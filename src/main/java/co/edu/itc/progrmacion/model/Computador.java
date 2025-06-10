package co.edu.itc.progrmacion.model;

public class Computador extends Recurso {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String tipo; 

    public Computador() { super(); }

    public Computador(String nombre, String marca, String modelo, String sistemaOperativo, String tipo) {
        super(nombre);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipo = tipo;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

   
}
