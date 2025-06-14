package co.edu.itc.progrmacion.repository;

import java.util.Collection;

import co.edu.itc.progrmacion.model.Recurso;

public interface RecursoRepositorio<T extends Recurso>  {
    void agregar(T elemento);
    void eliminar(T elemento);
    Collection<T> buscar(String criterio);
    Collection<T> obtenerTodos();
}
