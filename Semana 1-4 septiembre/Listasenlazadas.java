/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion.interfaz.list;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Angie
 */
public class SesionInterfazList {

private static void imprimirLista(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("imprimir elemento " + i + " " + lista.get(i));
        }
        
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("cadena 1");
        lista.add("cadena 2");
        lista.add("cadena 3");
        lista.add("cadena 4");
        lista.add("cadena 5");

        imprimirLista(lista);

        
        lista.addFirst("string prueba");

        imprimirLista(lista);

        lista.set(3, "cambiando string");

        imprimirLista(lista);

        lista.remove(5);

        imprimirLista(lista);

        
        lista.removeFirst();

        imprimirLista(lista);
    }
}
