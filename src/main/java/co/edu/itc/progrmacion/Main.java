package co.edu.itc.progrmacion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServicioBiblioteca servicioBiblioteca = context.getBean(ServicioBiblioteca.class);
        AppNamePrinter appNamePrinter = context.getBean(AppNamePrinter.class);
        appNamePrinter.imprimirNombre();
        
    

        // Agregar recursos
        Libro libro1 = new Libro("El Señor de los Anillos", LocalDateTime.now(), true, "J.R.R. Tolkien", "Editorial Planeta", Year.of(2001));
        Libro libro2 = new Libro("Harry Potter", LocalDateTime.now(), true, "J.K. Rowling", "Editorial Scholastic", Year.of(1997));
        Periodico periodico1 = new Periodico("El País", LocalDateTime.now(), true, LocalDate.now(), "Grupo PRISA");
        Periodico periodico2 = new Periodico("El Mundo", LocalDateTime.now(), true, LocalDate.now(), "Unidad Editorial");
        Computador computador1 = new Computador("PC-001", LocalDateTime.now(), true, "HP", "Pavilion", "Windows 10", TipoComputador.ESCRITORIO);
        Computador computador2 = new Computador("PC-002", LocalDateTime.now(), true, "Dell", "Inspiron", "Ubuntu", TipoComputador.PORTATIL);

        servicioBiblioteca.agregarRecurso(libro1);
        servicioBiblioteca.agregarRecurso(libro2);
        servicioBiblioteca.agregarRecurso(periodico1);
        servicioBiblioteca.agregarRecurso(periodico2);
        servicioBiblioteca.agregarRecurso(computador1);
        servicioBiblioteca.agregarRecurso(computador2);

        // Mostrar lista de recursos
        System.out.println("Lista de Recursos:");
        Collection<Recurso> recursos = servicioBiblioteca.obtenerTodos();
        recursos.forEach(recurso -> System.out.println(recurso.toString()));

        // Buscar y eliminar recurso
        String criterioBusqueda = "HP";
        Collection<Recurso> resultados = servicioBiblioteca.buscarRecursos(criterioBusqueda);
        if (!resultados.isEmpty()) {
            Recurso recursoAEliminar = resultados.iterator().next();
            servicioBiblioteca.eliminarRecurso(recursoAEliminar);
            System.out.println("\nRecurso eliminado: " + recursoAEliminar.getNombre());
        }

        // Imprimir nuevamente la lista de recursos
        System.out.println("\nLista de Recursos Actualizada:");
        servicioBiblioteca.obtenerTodos().forEach(recurso -> System.out.println(recurso.toString()));

        context.close();
    }
}

