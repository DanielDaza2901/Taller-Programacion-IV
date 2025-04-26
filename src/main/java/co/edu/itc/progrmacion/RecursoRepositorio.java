package co.edu.itc.progrmacion;

import java.util.Collection;

public interface RecursoRepositorio<T extends Recurso>  {
    void agregar(T elemento);
    void eliminar(T elemento);
    Collection<T> buscar(String criterio);
    Collection<T> obtenerTodos();
}
