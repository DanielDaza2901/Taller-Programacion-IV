package co.edu.itc.progrmacion.model;

import java.time.LocalDateTime;

public abstract class Recurso {
    private String nombre;
    private LocalDateTime fechaIngreso;
    
    public Recurso() {
        this.fechaIngreso = LocalDateTime.now();
    }

    public Recurso(String nombre) {
        this.nombre = nombre;
        this.fechaIngreso = LocalDateTime.now();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDateTime getFechaIngreso() { return fechaIngreso; }

    public abstract String getTipo();
}
