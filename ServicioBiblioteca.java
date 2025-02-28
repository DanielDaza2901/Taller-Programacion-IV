package co.edu.itc.progrmacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ServicioBiblioteca {
   private Collection<Recurso> recursos;

   public ServicioBiblioteca() {
       this.recursos = new ArrayList<>();
   }

   // Método para agregar un recurso a la biblioteca.
   public void agregar(Recurso recurso) {
       recursos.add(recurso);
   }

   // Método para quitar un recurso de la biblioteca.
   public void quitarRecurso(Recurso recurso) {
       recursos.remove(recurso);
   }

   // Método para buscar recursos que coincidan con un criterio.
   public Collection<Recurso> buscarRecursos(String criterio) {
       return recursos.stream()
               .filter(recurso -> recurso.coincideConCriterio(criterio))
               .collect(Collectors.toList());
   }

   // Método para obtener todos los recursos.
   public Collection<Recurso> obtenerTodos() {
       return recursos;
   }
}
