package co.edu.itc.progrmacion.repository;

import co.edu.itc.progrmacion.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {

    // Buscar libros cuyo autor contenga la cadena dada (insensible a mayúsculas)
    List<Libro> findByAutorContainingIgnoreCase(String autor);

    // Buscar libros por editorial exacta
    List<Libro> findByEditorial(String editorial);

    // Buscar libros por año
    List<Libro> findByAnio(int anio);
}
