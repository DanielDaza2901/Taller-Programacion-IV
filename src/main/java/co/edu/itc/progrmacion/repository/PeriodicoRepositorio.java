package co.edu.itc.progrmacion.repository;

import co.edu.itc.progrmacion.model.Periodico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PeriodicoRepositorio extends JpaRepository<Periodico, Long> {

    // Buscar periódicos por editorial
    List<Periodico> findByEditorial(String editorial);

    // Buscar periódicos publicados después de una fecha
    List<Periodico> findByFechaPublicacionAfter(LocalDate fecha);
}
