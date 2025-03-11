package co.edu.itc.progrmacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Periodico extends Recurso {
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico(String nombre, LocalDateTime fechaIngreso, boolean activo, LocalDate fechaPublicacion, String editorial) {
        super(nombre, fechaIngreso, activo);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return getNombre().contains(criterio) || getEditorial().contains(criterio);
    }

    @Override
    public String toString() {
        return "Periodico\n" +
                "Nombre=" + getNombre() + "\n" +
                "Fecha de Publicación=" + fechaPublicacion + "\n" +
                "Editorial=" + editorial + "\n" +
                "Fecha de Ingreso=" + getFechaIngreso() + "\n";
    }

    @Override
    public String getTipo() {
        return "Periodico";
    }
}
