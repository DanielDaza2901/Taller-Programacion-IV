package co.edu.itc.progrmacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioBiblioteca {

    @Autowired
    private LibroRepository libroRepo;

    @Autowired
    private PeriodicoRepository periodicoRepo;

    @Autowired
    private ComputadorRepository computadorRepo;

    // Obtener todos los recursos activos
    public Collection<Recurso> obtenerTodos() {
        List<Recurso> recursos = new ArrayList<>();
        libroRepo.findAll().forEach(recursos::add);
        periodicoRepo.findAll().forEach(recursos::add);
        computadorRepo.findAll().forEach(recursos::add);
        return recursos;
    }

    public void agregarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepo.save((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepo.save((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepo.save((Computador) recurso);
        } else {
            throw new IllegalArgumentException("Tipo de recurso no soportado para agregar");
        }
    }


    // Buscar recursos por criterio en todos los repositorios
    public Collection<Recurso> buscarRecursos(String criterio) {
        List<Recurso> resultados = new ArrayList<>();
        resultados.addAll(libroRepo.findByCriteria(criterio));
        resultados.addAll(periodicoRepo.findByCriteria(criterio));
        resultados.addAll(computadorRepo.findByCriteria(criterio));
        return resultados;
    }

    // Eliminar recurso según su tipo
    public void eliminarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepo.delete((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepo.delete((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepo.delete((Computador) recurso);
        } else {
            throw new IllegalArgumentException("Tipo de recurso no soportado para eliminar");
        }
    }
}
