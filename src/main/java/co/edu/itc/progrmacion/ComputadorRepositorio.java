package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ComputadorRepositorio implements RecursoRepositorio<Computador> {
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
    public Collection<Computador> buscar(String criterio) {
        return computadores.stream()
                .filter(computador -> computador.coincideConCriterio(criterio))
                .toList();
    }

    @Override
    public Collection<Computador> obtenerTodos() {
        return computadores;
    }
}
