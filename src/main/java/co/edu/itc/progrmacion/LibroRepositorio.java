package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
<<<<<<< HEAD
public class LibroRepositorio implements RecursoRepositorio<Libro> {
=======
public class LibroRepositorio implements Repositorio<Libro> {
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
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
<<<<<<< HEAD
    public Collection<Libro> buscar(String criterio) {
        return libros.stream()
                .filter(libro -> libro.coincideConCriterio(criterio))
                .toList();
    }
    
=======
    public Libro buscar(String criterio) {
        return libros.stream()
                .filter(libro -> libro.coincideConCriterio(criterio))
                .findFirst()
                .orElse(null);
    }

>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    @Override
    public Collection<Libro> obtenerTodos() {
        return libros;
    }
}
