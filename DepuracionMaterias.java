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
public class DepuracionMaterias {

    public static void main(String[] args) {
        
        List<String> materias = new ArrayList<>();
        materias.add("Estructuras de Datos");
        materias.add("Piloto - Inteligencia Artificial");
        materias.add("Bases de Datos");
        materias.add("Piloto - Computación en la Nube");
        materias.add("Inglés Técnico");

        System.out.println("INICIANDO REVISIÓN Y DEPURACIÓN");

        
        ListIterator<String> it = materias.listIterator();

        while (it.hasNext()) {
            String materia = it.next();
            System.out.println("Revisando: " + materia);

            
            if (materia.startsWith("Piloto")) {
                it.remove(); 
                System.out.println("   --> Eliminada por ser materia piloto.");
            }
        }

        
        System.out.println("\n=== LISTA DE MATERIAS DEPURADA ===");
        materias.forEach(m -> System.out.println("- " + m));
    }
}
