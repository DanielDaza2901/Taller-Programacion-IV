package co.edu.itc.progrmacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ServicioBiblioteca {
    private final Repositorio<Libro> libroRepositorio;
    private final Repositorio<Periodico> periodicoRepositorio;
    private final Repositorio<Computador> computadorRepositorio;

    @Autowired
    public ServicioBiblioteca(Repositorio<Libro> libroRepositorio,
                               Repositorio<Periodico> periodicoRepositorio,
                               Repositorio<Computador> computadorRepositorio) {
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
    }
}
