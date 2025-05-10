package co.edu.itc.progrmacion;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("computador")

public class Computador implements Recurso {

    @Id
    private Integer id;
    private String nombre;
    private LocalDate fechaIngreso;
    private boolean activo;

    // Campos adicionales
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private TipoComputador tipo;

    public Computador() {
        // Constructor vacío
    }

    public Computador(String nombre, LocalDate fechaIngreso, boolean activo, String marca, String modelo, String sistemaOperativo, TipoComputador tipo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipo = tipo;
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

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    public TipoComputador getTipo() { return tipo; }
    public void setTipo(TipoComputador tipo) { this.tipo = tipo; }

    @Override
    public void darDeBaja() {
        this.activo = false;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", activo=" + activo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
