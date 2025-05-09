package co.edu.itc.progrmacion;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;

public interface LibroRepository extends CrudRepository<Libro, Integer> {

    @Query("""
        SELECT * FROM libro 
        WHERE 
            CAST(id AS VARCHAR) LIKE '%' || :criterio || '%' OR
            nombre LIKE '%' || :criterio || '%' OR
            CAST(fecha_ingreso AS VARCHAR) LIKE '%' || :criterio || '%' OR
            CAST(activo AS VARCHAR) LIKE '%' || :criterio || '%'
        """)
    List<Libro> findByCriteria(String criterio);
    List<Libro> findByActivoTrue();
}
