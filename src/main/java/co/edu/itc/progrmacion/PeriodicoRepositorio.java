package co.edu.itc.progrmacion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
<<<<<<< HEAD
public class PeriodicoRepositorio implements RecursoRepositorio<Periodico> {
=======
public class PeriodicoRepositorio implements Repositorio<Periodico> {
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    private List<Periodico> periodicos = new ArrayList<>();

    @Override
    public void agregar(Periodico periodico) {
        periodicos.add(periodico);
    }

    @Override
    public void eliminar(Periodico periodico) {
        periodicos.remove(periodico);
    }

    @Override
<<<<<<< HEAD
    public Collection<Periodico> buscar(String criterio) {
        return periodicos.stream()
                .filter(periodico -> periodico.coincideConCriterio(criterio))
                .toList();
    }
    
=======
    public Periodico buscar(String criterio) {
        return periodicos.stream()
                .filter(periodico -> periodico.coincideConCriterio(criterio))
                .findFirst()
                .orElse(null);
    }

>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    @Override
    public Collection<Periodico> obtenerTodos() {
        return periodicos;
    }
}
