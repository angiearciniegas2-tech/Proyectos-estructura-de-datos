/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariomaterias;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;


/**
 *
 * @author prestamo
 */
public class InventarioMaterias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<String> Basematerias = new ArrayList<>();
    
        Basematerias.add("Matematicas");
        Basematerias.add("Piloto Español");
        Basematerias.add("Ingles");
        Basematerias.add("Piloto Artes");
        
        String[] arregloProveedor = {
            "Piloto de IoT",
            "Inteligencia Artificial",
            "Piloto de filosofía",
            "Seguridad Informática"
        };
         Basematerias.addAll(Arrays.asList(arregloProveedor));
                 
                 System.out.println("LISTA CONSOLIDADA ANTES DE DEPURAR (Total: " + Basematerias.size() + ")");
        for (String materia : Basematerias) {
            System.out.println(materia);
        }
        System.out.println();
        Iterator<String> iterador = Basematerias.iterator();
        while (iterador.hasNext()) {
            String materia = iterador.next();
            if (materia.startsWith("Piloto")) {
                iterador.remove(); 
            }
        }
         System.out.println("LISTA DESPUÉS DE ELIMINAR LAS QUE EMPIEZAN CON \"Piloto\" (Total: " + Basematerias.size() + ")");
        for (String materia : Basematerias) {
            System.out.println(materia);
  }
    }
}
