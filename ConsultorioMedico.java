/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/**
 *
 * @author Angie
 */
public class ConsultorioMedico {
  
    public static void main(String[] args) {
       
        List<String> fila = new ArrayList<>();
        fila.add("Carlos Pérez");
        fila.add("Ana Gómez");
        fila.add("Lucía Fernández");
        fila.add("Jorge Ramírez");
        fila.add("Marta Torres");

 
        System.out.println("FILA DE ESPERA (ORDEN DE LLEGADA)");
        ListIterator<String> it = fila.listIterator();
        
        while (it.hasNext()) {
            int posicion = it.nextIndex() + 1; 
            String paciente = it.next();
            System.out.println("Posición " + posicion + ": " + paciente);
        }

      
        System.out.println("\nREPORTE INVERSO (MÁS RECIENTES PRIMERO)");
        while (it.hasPrevious()) {
            int posicion = it.previousIndex() + 1;
            String paciente = it.previous();
            System.out.println("Posición " + posicion + ": " + paciente);
        }

    
        // Avanzamos 2 personas en la fila:
        it.next(); // Avanza la 1ra persona ("Carlos Pérez")
        it.next(); // Avanza la 2da persona ("Ana Gómez")

        
        it.add("URGENCIA - Roberto Díaz");

        // 5. Confirmar el orden completo final de la fila
        System.out.println("\nFILA FINAL CON PACIENTE DE URGENCIA");
        it = fila.listIterator(); // Reiniciamos el iterador al inicio
        while (it.hasNext()) {
            int posicion = it.nextIndex() + 1;
            String paciente = it.next();
            System.out.println("Posición " + posicion + ": " + paciente);
        }
    }
}
