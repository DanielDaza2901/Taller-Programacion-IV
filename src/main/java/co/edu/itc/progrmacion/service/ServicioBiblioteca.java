package co.edu.itc.progrmacion.service;

import co.edu.itc.progrmacion.model.*;
import co.edu.itc.progrmacion.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioBiblioteca {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private PeriodicoRepositorio periodicoRepositorio;

    @Autowired
    private ComputadorRepositorio computadorRepositorio;

    // Obtener todos los recursos combinados
    public List<Recurso> obtenerTodos() {
        List<Recurso> recursos = new ArrayList<>();
        recursos.addAll(libroRepositorio.findAll());
        recursos.addAll(periodicoRepositorio.findAll());
        recursos.addAll(computadorRepositorio.findAll());
        return recursos;
    }

    // Agregar recurso según tipo
    public Recurso agregarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            return libroRepositorio.save((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            return periodicoRepositorio.save((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            return computadorRepositorio.save((Computador) recurso);
        }
        throw new IllegalArgumentException("Tipo de recurso no soportado");
    }

    // Buscar recurso por id y tipo (opcional)
    public Optional<Recurso> buscarPorId(Long id, String tipo) {
        switch (tipo.toLowerCase()) {
            case "libro":
                return libroRepositorio.findById(id).map(l -> (Recurso) l);
            case "periodico":
                return periodicoRepositorio.findById(id).map(p -> (Recurso) p);
            case "computador":
                return computadorRepositorio.findById(id).map(c -> (Recurso) c);
            default:
                return Optional.empty();
        }
    }

    // Actualizar recurso
    public Recurso actualizarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            return libroRepositorio.save((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            return periodicoRepositorio.save((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            return computadorRepositorio.save((Computador) recurso);
        }
        throw new IllegalArgumentException("Tipo de recurso no soportado");
    }

    // Eliminar recurso por id y tipo
    public void eliminarRecurso(Long id, String tipo) {
        switch (tipo.toLowerCase()) {
            case "libro":
                libroRepositorio.deleteById(id);
                break;
            case "periodico":
                periodicoRepositorio.deleteById(id);
                break;
            case "computador":
                computadorRepositorio.deleteById(id);
                break;
            default:
                throw new IllegalArgumentException("Tipo de recurso no soportado");
        }
    }
}
