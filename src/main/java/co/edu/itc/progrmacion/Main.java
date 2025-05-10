package co.edu.itc.progrmacion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalDate;
import java.time.Year;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Crea el contexto de Spring usando la configuración de AppConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtiene el bean del servicio
        ServicioBiblioteca servicioBiblioteca = context.getBean(ServicioBiblioteca.class);

        // Crea recursos de ejemplo
        Libro libro1 = new Libro("El Señor de los Anillos", LocalDate.now(), true, "J.R.R. Tolkien", "Editorial Planeta", Year.of(2001));
        Libro libro2 = new Libro("Harry Potter", LocalDate.now(), true, "J.K. Rowling", "Editorial Scholastic", Year.of(1997));
        Periodico periodico1 = new Periodico("El País", LocalDate.now(), true, LocalDate.now(), "Grupo PRISA");
        Periodico periodico2 = new Periodico("El Mundo", LocalDate.now(), true, LocalDate.now(), "Unidad Editorial");
        Computador computador1 = new Computador("PC-001", LocalDate.now(), true, "HP", "Pavilion", "Windows 10", TipoComputador.ESCRITORIO);
        Computador computador2 = new Computador("PC-002", LocalDate.now(), true, "Dell", "Inspiron", "Ubuntu", TipoComputador.PORTATIL);

        // Agrega los recursos
        servicioBiblioteca.agregarRecurso(libro1);
        servicioBiblioteca.agregarRecurso(libro2);
        servicioBiblioteca.agregarRecurso(periodico1);
        servicioBiblioteca.agregarRecurso(periodico2);
        servicioBiblioteca.agregarRecurso(computador1);
        servicioBiblioteca.agregarRecurso(computador2);

        // Muestra los recursos
        System.out.println("Lista de Recursos:");
        Collection<Recurso> recursos = servicioBiblioteca.obtenerTodos();
        recursos.forEach(System.out::println);

        // Busca y elimina un recurso según criterio
        String criterioBusqueda = "HP";
        Collection<Recurso> resultados = servicioBiblioteca.buscarRecursos(criterioBusqueda);
        if (!resultados.isEmpty()) {
            Recurso recursoAEliminar = resultados.iterator().next();
            servicioBiblioteca.eliminarRecurso(recursoAEliminar);
            System.out.println("\nRecurso eliminado: " + recursoAEliminar.getNombre());
        }

        // Muestra la lista actualizada
        System.out.println("\nLista de Recursos Actualizada:");
        servicioBiblioteca.obtenerTodos().forEach(System.out::println);

        // Cierra el contexto de Spring
        context.close();
    }
}
