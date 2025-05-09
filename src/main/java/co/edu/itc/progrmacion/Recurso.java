package co.edu.itc.progrmacion;

import java.time.LocalDate;


public interface Recurso {
    String getNombre();
    LocalDate getFechaIngreso();
    boolean isActivo();
    void darDeBaja();
    String toString();
}
