package co.edu.itc.progrmacion.model;

import java.time.LocalDate;

public class Periodico extends Recurso {
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico() { super(); }

    public Periodico(String nombre, LocalDate fechaPublicacion, String editorial) {
        super(nombre);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    @Override
    public String getTipo() { return "Periodico"; }
}
