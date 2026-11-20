
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 * ============================================================
 * SALA DE EMERGENCIAS
 * Estructura de Datos - UNIMINUTO
 * ============================================================
 * Nombre completo: Arciniegas Angie Yulied
 *
 *  INSTRUCCIONES
 *  1. Ejecuta el programa y mira la salida en la consola.
 *  2. Responde las 8 preguntas (P1 a P8). Escribe tu respuesta
 *     en la línea "// R:" que está debajo de cada pregunta.
 *  3. Respuestas cortas: la respuesta y una frase de por qué.
 *  4. No borres ni cambies el código de este archivo.
 * ============================================================
 */

public class SalaEmergencias {
    
    // Clase Paciente: el "molde" de cada paciente.
    // Va dentro de SalaEmergencias (por eso lleva static).
    static class Paciente implements Comparable<Paciente> {

        private String nombre;
        private int gravedad;  // 1 Leve, 2 Moderada, 3 Grave, 4 Muy grave

        public Paciente(String nombre, int gravedad) {
            this.nombre = nombre;
            this.gravedad = gravedad; 
        }

        // P1. En "this.nombre = nombre", ¿cuál de los dos es el atributo
        //     del paciente y cuál es el dato que llegó entre paréntesis?
        // R: this.nombre es el atributo del paciente (lo que gusrda el objeto) y
        // nombre es el dato que recibe el constructor.

        public String getNombre() {
            return nombre;
        }

        public int getGravedad() {
            return gravedad;
        }

        public String getGravedadTexto() {
            switch (gravedad) {
                case 1: return "Leve";
                case 2: return "Moderada";
                case 3: return "Grave";
                case 4: return "Muy grave";
                default: return "Desconocida";
            }
        }

        // P2. Si un paciente tuviera gravedad 7, ¿qué texto mostraría? ¿Por qué?
        // R: Mostraría "Desconocida", porque el número 7 no está incluido en 
        //los casos del switch.

        @Override
        public String toString() {
            return nombre + " (" + getGravedadTexto() + ")";
        }

        @Override
        public int compareTo(Paciente otro) {
            return Integer.compare(otro.gravedad, this.gravedad);
        }

        // P3. compareTo decide quién va primero en el triage.
        //     Si se escribiera Integer.compare(this.gravedad, otro.gravedad)
        //     ¿quién saldría primero: el más grave o el menos grave?
        // R: Saldría primero el menos grave, porque al
        // cambiar el orden de la comparación también cambia
        // la prioridad o sea ordena del menar al mayor al revez de como esta
        //ahorita
    }

    public static void main(String[] args) {

        // ---------- 1. SALA DE ESPERA (Queue: orden de llegada) ----------
        Queue<Paciente> salaEspera = new LinkedList<>();

        salaEspera.offer(new Paciente("Juan", 1));
        salaEspera.offer(new Paciente("Raquel", 3));
        salaEspera.offer(new Paciente("Ignacio", 2));
        salaEspera.offer(new Paciente("Omar", 4));
        salaEspera.offer(new Paciente("Beatriz", 3));
        salaEspera.offer(new Paciente("Xochilt", 1));

        System.out.println("Orden de llegada: " + salaEspera);

        // P4. ¿Por qué Juan aparece de primero en la sala de espera?
        // R: Porque Juan fue el primero en llegar y Queue
        // respeta el orden de llegada (FIFO)el primero en entrar es el primero 
        //en salir y el fue el primero en entrarr.

        // ---------- 2. TRIAGE (PriorityQueue: el más grave primero) ----------
        PriorityQueue<Paciente> triage = new PriorityQueue<>();

        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }

        System.out.println("Paciente mas urgente: " + triage.peek());
        System.out.println();

        // P5. Al terminar este while, ¿cuántos pacientes quedan en salaEspera? ¿Por qué?
        // R: Quedan 0 pacientes esta vacia  porque todos se pasan
        // de salaEspera a triage.

       
        // ---------- 3. ATENCIÓN E HISTORIAL (Stack: el último queda arriba) ----------
        Stack<Paciente> historial = new Stack<>();

        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historial.push(atendido);
        }

        // P6. Juan llegó de primero, pero lo atienden de quinto. ¿Por qué?
        // R: Porque Juan tenía gravedad 1 y hay otros con gravedad 3 y 4lestoca
        // esperar turno detras de los que estab peor y el programa atiende 
        //primero a los pacientes más graves.

        System.out.println();

        System.out.println("Ultimo paciente atendido: " + historial.peek());
        System.out.println("Total atendidos: " + historial.size());

        // P7. ¿Por qué historial.peek() muestra a Xochilt y no a Omar?
        // R: Porque Xochilt fue la última paciente atendida
        // y Stack funciona con el principio de el ultimo que entra es el primero en salir.

        // P8. ¿Qué diferencia hay entre peek() y poll()? Da un ejemplo de este código.
        // R: peek() muestra un elemento sin eliminarlo,
        // mientras que poll() lo muestra y lo elimina.
        // Por ejemplo, triage.peek() permite ver al paciente
        // más urgente sin sacarlo de la cola.
    }
}
