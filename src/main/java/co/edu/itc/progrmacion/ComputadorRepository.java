package co.edu.itc.progrmacion;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;


public interface ComputadorRepository extends CrudRepository<Computador, Integer> {

    @Query("""
        SELECT * FROM computador
        WHERE 
            CAST(id AS VARCHAR) LIKE '%' || :criterio || '%' OR
            nombre LIKE '%' || :criterio || '%' OR
            CAST(fecha_ingreso AS VARCHAR) LIKE '%' || :criterio || '%' OR
            CAST(activo AS VARCHAR) LIKE '%' || :criterio || '%'
        """)
    List<Computador> findByCriteria(String criterio);
    List<Computador> findByActivoTrue();
}
