package co.edu.itc.progrmacion;


import java.time.LocalDateTime;
import java.time.Year;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private Year anio;

    public Libro(String nombre, LocalDateTime fechaIngreso, boolean activo, String autor, String editorial, Year anio) {
        super(nombre, fechaIngreso, activo);
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public Year getAnio() {
        return anio;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return getNombre().contains(criterio) || getAutor().contains(criterio) || getEditorial().contains(criterio);
    }

    @Override
    public String toString() {
        return "Libro\n" +
                "Nombre=" + getNombre() + "\n" +
                "Autor=" + autor + "\n" +
                "Editorial=" + editorial + "\n" +
                "Año=" + anio + "\n" +
                "Fecha de Ingreso=" + getFechaIngreso() + "\n";
    }


   
}
