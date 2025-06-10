package co.edu.itc.progrmacion.controller;

import co.edu.itc.progrmacion.model.*;
import co.edu.itc.progrmacion.service.ServicioBiblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
@CrossOrigin(origins = "*")
public class BibliotecaController {

    @Autowired
    private ServicioBiblioteca servicio;

    @GetMapping
    public List<Recurso> listarTodos() {
        return servicio.obtenerTodos();
    }

    @PostMapping("/libros")
    public void agregarLibro(@RequestBody Libro libro) {
        servicio.agregarRecurso(libro);
    }

    @PostMapping("/periodicos")
    public void agregarPeriodico(@RequestBody Periodico periodico) {
        servicio.agregarRecurso(periodico);
    }

    @PostMapping("/computadores")
    public void agregarComputador(@RequestBody Computador computador) {
        servicio.agregarRecurso(computador);
    }

    @DeleteMapping("/{nombre}")
    public void eliminarRecurso(@PathVariable String nombre) {
        servicio.eliminarRecurso(123l, nombre);
    }
}
