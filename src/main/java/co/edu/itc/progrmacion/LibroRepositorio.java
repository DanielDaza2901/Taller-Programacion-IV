package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class LibroRepositorio implements RecursoRepositorio<Libro> {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregar(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void eliminar(Libro libro) {
        libros.remove(libro);
    }

    @Override
    public Collection<Libro> buscar(String criterio) {
        return libros.stream()
                .filter(libro -> libro.coincideConCriterio(criterio))
                .toList();
    }
    
    @Override
    public Collection<Libro> obtenerTodos() {
        return libros;
    }
}
