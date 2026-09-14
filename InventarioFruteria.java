*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario.fruteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Angie
 */
public class InventarioFruteria {

    public static void main(String[] args) {
        
        List<String> inventarioBase = new ArrayList<>();
        inventarioBase.add("Manzana");
        inventarioBase.add("Bananos");
        inventarioBase.add("Naranjas");
        inventarioBase.add("Fresas");

        
        inventarioBase.add("Uvas");

        
        String[] arregloProveedor = {"Mango", "Piña", "Papaya"};
        List<String> listaProveedor = Arrays.asList(arregloProveedor);

       

        List<String> inventarioConsolidado = new ArrayList<>(inventarioBase);
        inventarioConsolidado.addAll(listaProveedor);

        
        System.out.println("INVENTARIO BASE");
        inventarioBase.forEach(fruta -> System.out.println("- " + fruta));

        System.out.println("\nLISTA DEL PROVEEDOR (FIJA)");
        listaProveedor.forEach(fruta -> System.out.println("- " + fruta));

        System.out.println("\nINVENTARIO CONSOLIDADO");
        inventarioConsolidado.forEach(fruta -> System.out.println("- " + fruta));
    }
    
}
