import java.util.Iterator;
import java.util.LinkedList;
 
public class Main {
 
    public static void main(String[] args) {
 
        // 1. CREAR la colección
        LinkedList<String> materias = new LinkedList<>();
        materias.add("Programación");
        materias.add("Matemáticas");
        materias.add("Inglés");
        materias.add("Bases de Datos");
        materias.add("Redes");
        System.out.println("1. Lista inicial: " + materias);
 
        // 2. AGREGAR información
        materias.addFirst("Algoritmos");                 // al inicio
        System.out.println("Después de addFirst: " + materias);
 
        materias.addLast("Inteligencia Artificial");     // al final
        System.out.println("Después de addLast: " + materias);
 
        materias.add(2, "Estructura de Datos");          // en la posición 2
        System.out.println("Después de add(2, ...): " + materias);
 
        // 3. CONSULTAR información
        System.out.println("\n3. Elemento en la posición 3: " + materias.get(3));
        System.out.println("Primer elemento: " + materias.getFirst());
        System.out.println("Último elemento: " + materias.getLast());
        System.out.println("¿Contiene Inglés? " + materias.contains("Inglés"));
        System.out.println("Posición de Bases de Datos: " + materias.indexOf("Bases de Datos"));
 
        // 4. MODIFICAR información
        System.out.println("\n4. Antes de modificar: " + materias);
        int posicion = materias.indexOf("Matemáticas");  // primero localizamos
        if (posicion != -1) {
            materias.set(posicion, "Matemáticas Aplicadas"); // luego modificamos
        }
        System.out.println("Después de modificar: " + materias);
 
        // 5. ELIMINAR información
        materias.remove("Inglés");                       // por nombre
        System.out.println("\n5. Después de remove(\"Inglés\"): " + materias);
 
        materias.remove(1);                              // por posición
        System.out.println("Después de remove(1): " + materias);
 
        materias.removeFirst();                          // el primero
        System.out.println("Después de removeFirst: " + materias);
 
        materias.removeLast();                           // el último
        System.out.println("Después de removeLast: " + materias);
 
        // 6. RECORRER la colección
        System.out.println("\n6. Recorrido con for:");
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(materias.get(i));
        }
 
        System.out.println("Recorrido con for-each:");
        for (String materia : materias) {
            System.out.println(materia);
        }
 
        // 7. CONTAR y verificar
        System.out.println("\n7. Cantidad de elementos: " + materias.size());
        if (materias.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista contiene información.");
        }
 
        // 8. ELIMINAR TODOS los elementos
        materias.clear();
        System.out.println("\n8. Después de clear: " + materias);
        System.out.println("¿Está vacía? " + materias.isEmpty());
 
        // RETO ADICIONAL: eliminar solo las que comienzan con "Piloto"
        materias.add("Programación");
        materias.add("Piloto Java");
        materias.add("Matemáticas");
        materias.add("Piloto Python");
        materias.add("Redes");
        materias.add("Piloto Web");
        materias.add("Bases de Datos");
        System.out.println("\nReto - antes de eliminar: " + materias);
 
        Iterator<String> it = materias.iterator();
        while (it.hasNext()) {
            String materia = it.next();
            if (materia.startsWith("Piloto")) {
                it.remove(); // elimina de forma segura mientras se recorre
            }
        }
        System.out.println("Reto - después de eliminar: " + materias);
    }
}
