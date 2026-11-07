package PracticasPilasyColas;


import java.util.Stack;

public class PilaPersonal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        
        pila.push(7); // Numero de lista
        imprimirPila(pila);

        pila.push(5); // Dia de cumpleaños
        imprimirPila(pila);

        pila.push(8); // Mes de cumpleaños
        imprimirPila(pila);



        // TODO 2: Busca tu número de lista con search() e imprime la posición.
       int posicion = pila.search(7);

        System.out.println("La posicion del numero de lista es: " + posicion);



        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        while (!pila.empty()) {
            int elementoSacado = pila.pop();
            System.out.println("Se saco " + elementoSacado);
            imprimirPila(pila);
        }

    }

    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}
