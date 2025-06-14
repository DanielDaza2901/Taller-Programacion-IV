package co.edu.itc.progrmacion.repository;

import co.edu.itc.progrmacion.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputadorRepositorio extends JpaRepository<Computador, Long> {

    // Buscar computadores por marca
    List<Computador> findByMarcaContainingIgnoreCase(String marca);

    // Buscar computadores por tipo (PORTATIL, ESCRITORIO, TABLET)
    List<Computador> findByTipo(String tipo);
}
