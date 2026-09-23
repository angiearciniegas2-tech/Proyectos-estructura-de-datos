package materias;

import java.util.LinkedList;

public class Materias {

    public static void main(String[] args) {
        LinkedList<String> materias = new LinkedList<>();

        materias.add("ingles");
        materias.add("fisica");
        materias.add("calculo");
        materias.add("programacion");

        System.out.println("--- Lista inicial ---");
        materias.forEach(System.out::println);

        // Agregar al inicio
        materias.addFirst("Algoritmos");
        System.out.println("\nSe agregó Algoritmos al inicio de la lista");
        materias.forEach(System.out::println);

        // Agregar al final
        materias.addLast("Inteligencia artificial");
        System.out.println("\nSe agregó Inteligencia artificial al final");
        materias.forEach(System.out::println);

        // Agregar "Estructura de datos" en la posición (índice) 2
        materias.add(2, "estructura de datos");
        System.out.println("\nLista con estructura de datos en índice 2:");
        materias.forEach(System.out::println);
        
        // Consultar información
        System.out.println("\nLa materia que está en la posición 3 es: " + materias.get(3));
        
        // Consultar último y primer elemento de la lista
        System.out.println("El primer elemento de la lista es: " + materias.getFirst());
        System.out.println("El último elemento de la lista es: " + materias.getLast());
            
        if (materias.contains("ingles")) {
            System.out.println("La lista contiene ingles");
        } else {
            System.out.println("No contiene ingles");
        }
        int posicion = materias.indexOf("Base deDatos");
        if(posicion ! = -1){
        System.out.println("la posicion de la Base de Datos es:" + posicion);
        
    }
            System.out.print("\n Base de Datos esta en la posocion:" + materias.indexOf("Base de Datos"));
        }
    } 

