package co.edu.itc.progrmacion.model;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private int anio;

    public Libro() { super(); }

    public Libro(String nombre, String autor, String editorial, int anio) {
        super(nombre);
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    @Override
    public String getTipo() { return "Libro"; }
}
