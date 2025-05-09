package co.edu.itc.progrmacion;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("periodico")
public class Periodico implements Recurso {

    @Id
    private Integer id;
    private String nombre;
    private LocalDate fechaIngreso;
    private boolean activo;

    // Campos adicionales
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico() {
        // Constructor vacío
    }

    public Periodico(String nombre, LocalDate fechaIngreso, boolean activo, LocalDate fechaPublicacion, String editorial) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    @Override
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    @Override
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    @Override
    public void darDeBaja() {
        this.activo = false;
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", activo=" + activo +
                ", fechaPublicacion=" + fechaPublicacion +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
