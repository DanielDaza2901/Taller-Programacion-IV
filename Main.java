package co.edu.itc.progrmacion;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.Collection;
import java.time.LocalDate;

public class Main {

   public static void main(String[] args) {

       // Crear una instancia del servicio de biblioteca.
       ServicioBiblioteca biblioteca = new ServicioBiblioteca();

       // Crear recursos: libros.
       Libro libro1 = new Libro("El Señor de los Anillos", LocalDateTime.now(), true,
               "J.R.R. Tolkien", "Editorial Planeta", Year.of(2001));
       Libro libro2 = new Libro("Harry Potter", LocalDateTime.now(), true,
               "J.K. Rowling", "Editorial Scholastic", Year.of(1997));
       Libro libro3 = new Libro("El Código Da Vinci", LocalDateTime.now(), true,
               "Dan Brown", "Editorial Doubleday", Year.of(2003));

       // Crear recursos: periódicos.
       Periodico periodico1 = new Periodico("El País", LocalDateTime.now(), true,
               LocalDate.now(), "Grupo PRISA");
       Periodico periodico2 = new Periodico("El Mundo", LocalDateTime.now(), true,
               LocalDate.now(), "Unidad Editorial");
       Periodico periodico3 = new Periodico("La Vanguardia", LocalDateTime.now(), true,
               LocalDate.now(), "Grupo Godó");

       // Crear recursos: computadores.
       Computador computador1 = new Computador("PC-001", LocalDateTime.now(), true,
               "HP", "Pavilion", "Windows 10", TipoComputador.ESCRITORIO);
       Computador computador2 = new Computador("PC-002", LocalDateTime.now(), true,
               "Dell", "Inspiron", "Ubuntu", TipoComputador.PORTATIL);
       Computador computador3 = new Computador("PC-003", LocalDateTime.now(), true,
               "Apple", "MacBook", "macOS", TipoComputador.PORTATIL);

       // Agregar recursos a la biblioteca.
       biblioteca.agregar(libro1);
       biblioteca.agregar(libro2);
       biblioteca.agregar(libro3);
       biblioteca.agregar(periodico1);
       biblioteca.agregar(periodico2);
       biblioteca.agregar(periodico3);
       biblioteca.agregar(computador1);
       biblioteca.agregar(computador2);
       biblioteca.agregar(computador3);

       // Imprimir lista de recursos actual en la biblioteca.
       System.out.println("Lista de Recursos:");
       for (Recurso recurso : biblioteca.obtenerTodos()) {
           System.out.println(recurso.toString());
           System.out.println();
       }

       // Buscar recursos que coincidan con un criterio y imprimir resultados.
       String criterio = "HP";
       Collection<Recurso> resultados = biblioteca.buscarRecursos(criterio);
       
       System.out.println("Resultados de búsqueda para '" + criterio + "':");
       
       for (Recurso recurso : resultados) {
           System.out.println(recurso.toString());
           System.out.println();
       }

       // Tomar el primer resultado de la búsqueda y eliminarlo de la biblioteca.
       if (!resultados.isEmpty()) {
           Recurso primerResultado = resultados.iterator().next();
           biblioteca.quitarRecurso(primerResultado);
           System.out.println("Se ha eliminado el recurso: " + primerResultado.getNombre());
           System.out.println();
       }

       // Volver a imprimir la lista de recursos actualizados.
       System.out.println("Lista de Recursos Actualizada:");
       
       for (Recurso recurso : biblioteca.obtenerTodos()) {
           System.out.println(recurso.toString());
           System.out.println();
       }
   }
}
