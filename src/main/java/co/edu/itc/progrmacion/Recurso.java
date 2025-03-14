package co.edu.itc.progrmacion;

import java.time.LocalDateTime;

public abstract class Recurso {
    private String nombre;
    private LocalDateTime fechaIngreso;
    private boolean activo;

    public Recurso(String nombre, LocalDateTime fechaIngreso, boolean activo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void darDeBaja() {
        this.activo = false;
    }

    public boolean coincideConCriterio(String criterio){
        return getNombre().contains(criterio) || getFechaIngreso().toString().contains(criterio);

    }


  
}
