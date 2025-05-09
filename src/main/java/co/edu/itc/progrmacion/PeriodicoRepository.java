package co.edu.itc.progrmacion;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;


public interface PeriodicoRepository extends CrudRepository<Periodico, Integer> {

    @Query("""
        SELECT * FROM periodico
        WHERE 
            CAST(id AS VARCHAR) LIKE '%' || :criterio || '%' OR
            nombre LIKE '%' || :criterio || '%' OR
            CAST(fecha_ingreso AS VARCHAR) LIKE '%' || :criterio || '%' OR
            CAST(activo AS VARCHAR) LIKE '%' || :criterio || '%'
        """)
    List<Periodico> findByCriteria(String criterio);
    List<Periodico> findByActivoTrue();
}
