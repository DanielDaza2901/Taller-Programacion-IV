package co.edu.itc.progrmacion;

import java.util.Collection;

public interface Repositorio<T> {
    void agregar(T elemento);
    void eliminar(T elemento);
    T buscar(String criterio);
    Collection<T> obtenerTodos();
}
