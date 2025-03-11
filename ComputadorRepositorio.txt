package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ComputadorRepositorio implements Repositorio<Computador> {
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
    public Computador buscar(String criterio) {
        return computadores.stream()
                .filter(computador -> computador.coincideConCriterio(criterio))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Computador> obtenerTodos() {
        return computadores;
    }
}
