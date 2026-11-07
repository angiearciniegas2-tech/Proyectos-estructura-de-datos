import java.util.PriorityQueue;

public class PrioridadPalabras {

    public static void main(String[] args) {

        PriorityQueue<String> cola = new PriorityQueue<>();

        // TODO 1: Mete con offer() 4 palabras: tu nombre, tu ciudad,
        //         tu carrera y tu lenguaje de programación favorito.
        //         Luego imprime la cola completa con System.out.println(cola);
         
        cola.offer("Angie"); // Nombre
        cola.offer("Bogota");   // Ciudad
        cola.offer("Tecnologia"); // Carrera
        cola.offer("Java");     // Lenguaje de programacion favorito
        
        System.out.println("Cola completa: " + cola);

        // TODO 2: ANTES de ejecutar, escribe aquí en un comentario
        //         cuál crees que será la cabeza. Luego imprímela con peek().
        //         Mi predicción: 
         
        // Mi prediccion: Angie sera la cabeza porque empieza
        // con la letra A, que aparece primero alfabeticamente.

        System.out.println("La cabeza de la cola es: " + cola.peek());

        // TODO 3: Vacía la cola con isEmpty() y poll(), imprimiendo cada palabra.
        
        System.out.println("\nVaciando la cola:");

        while (!cola.isEmpty()) {

            String palabra = cola.poll();

            System.out.println("Se saco: " + palabra);
        }

        System.out.println("\nLa cola esta vacia: " + cola.isEmpty());

    }
}
    
