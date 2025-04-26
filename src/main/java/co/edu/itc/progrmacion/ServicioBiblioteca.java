package co.edu.itc.progrmacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ServicioBiblioteca {
<<<<<<< HEAD
    private final RecursoRepositorio<Libro> libroRepositorio;
    private final RecursoRepositorio<Periodico> periodicoRepositorio;
    private final RecursoRepositorio<Computador> computadorRepositorio;

    @Autowired
    public ServicioBiblioteca(RecursoRepositorio<Libro> libroRepositorio,
                               RecursoRepositorio<Periodico> periodicoRepositorio,
                               RecursoRepositorio<Computador> computadorRepositorio) {
=======
    private final Repositorio<Libro> libroRepositorio;
    private final Repositorio<Periodico> periodicoRepositorio;
    private final Repositorio<Computador> computadorRepositorio;

    @Autowired
    public ServicioBiblioteca(Repositorio<Libro> libroRepositorio,
                               Repositorio<Periodico> periodicoRepositorio,
                               Repositorio<Computador> computadorRepositorio) {
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
        this.libroRepositorio = libroRepositorio;
        this.periodicoRepositorio = periodicoRepositorio;
        this.computadorRepositorio = computadorRepositorio;
    }

    public void agregarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepositorio.agregar((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepositorio.agregar((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepositorio.agregar((Computador) recurso);
        }
    }

    public void eliminarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepositorio.eliminar((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepositorio.eliminar((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepositorio.eliminar((Computador) recurso);
        }
    }

    public Collection<Recurso> obtenerTodos() {
        return Stream.of(libroRepositorio.obtenerTodos(),
                         periodicoRepositorio.obtenerTodos(),
                         computadorRepositorio.obtenerTodos())
                     .flatMap(Collection::stream)
                     .collect(Collectors.toList());
    }

    public Collection<Recurso> buscarRecursos(String criterio) {
<<<<<<< HEAD
        List<Recurso> resultados = new ArrayList<>();
    
        Collection<Libro> libros = libroRepositorio.buscar(criterio);
        Collection<Periodico> periodicos = periodicoRepositorio.buscar(criterio);
        Collection<Computador> computadores = computadorRepositorio.buscar(criterio);
    
        resultados.addAll(libros);
        resultados.addAll(periodicos);
        resultados.addAll(computadores);
    
        return resultados;
=======
       List<Recurso> resultados = new ArrayList<>();
       Libro libro = libroRepositorio.buscar(criterio);
       Periodico periodico = periodicoRepositorio.buscar(criterio);
       Computador computador = computadorRepositorio.buscar(criterio);

        if(libro != null){
            resultados.add(libro);
        }
        if(periodico != null){
            resultados.add(periodico);
        }
       if(computador != null){
            resultados.add(computador);
        }
       return resultados;
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    }
}
