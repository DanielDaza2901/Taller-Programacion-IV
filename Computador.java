package biblioteca;

import java.time.LocalDateTime;

public class Computador extends Recurso {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private TipoComputador tipo;

    public Computador(String nombre, LocalDateTime fechaIngreso, boolean activo, String marca, String modelo, String sistemaOperativo, TipoComputador tipo) {
        super(nombre, fechaIngreso, activo);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public TipoComputador getTipo() {
        return tipo;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return getNombre().contains(criterio) || getMarca().contains(criterio) || getModelo().contains(criterio);
    }

    @Override
    public String toString() {
        return "Computador\n" +
                "Nombre=" + getNombre() + "\n" +
                "Marca=" + marca + "\n" +
                "Modelo=" + modelo + "\n" +
                "Sistema Operativo=" + sistemaOperativo + "\n" +
                "Tipo=" + tipo + "\n" +
                "Fecha de Ingreso=" + getFechaIngreso() + "\n";
    }

    @Override
    public String getTipo() {
        return "Computador";
    }
}
