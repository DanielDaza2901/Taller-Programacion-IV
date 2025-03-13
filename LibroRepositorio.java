package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class LibroRepositorio implements Repositorio<Libro> {
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
    public Libro buscar(String criterio) {
        return libros.stream()
                .filter(libro -> libro.coincideConCriterio(criterio))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Libro> obtenerTodos() {
        return libros;
    }
}
