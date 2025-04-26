package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
<<<<<<< HEAD
public class ComputadorRepositorio implements RecursoRepositorio<Computador> {
=======
public class ComputadorRepositorio implements Repositorio<Computador> {
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    private List<Computador> computadores = new ArrayList<>();

    @Override
    public void agregar(Computador computador) {
        computadores.add(computador);
    }

    @Override
    public void eliminar(Computador computador) {
        computadores.remove(computador);
    }

    @Override
<<<<<<< HEAD
    public Collection<Computador> buscar(String criterio) {
        return computadores.stream()
                .filter(computador -> computador.coincideConCriterio(criterio))
                .toList();
=======
    public Computador buscar(String criterio) {
        return computadores.stream()
                .filter(computador -> computador.coincideConCriterio(criterio))
                .findFirst()
                .orElse(null);
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    }

    @Override
    public Collection<Computador> obtenerTodos() {
        return computadores;
    }
}
