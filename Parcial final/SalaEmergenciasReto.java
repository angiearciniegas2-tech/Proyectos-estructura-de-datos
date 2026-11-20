import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 * RETO 7: Un nuevo nivel: Crítico
 * Estudiante: Arciniegas Angie Yulied
 *
 * Que debo hacer: Agregar el nivel 5 con el texto "Critico"
 * en getGravedadTexto. Luego registrar a Leo con gravedad 5.
 *
 * Pregunta: ¿Quién sale primero? ¿Tuviste que cambiar
 * compareTo? ¿Por qué?
 *
 * 1. Mi prediccion (ANTES de ejecutar):
 * Creo que Leo va a salir primero porque tiene gravedad 5,
 * que es el nivel más alto.
 *
 * 2. Lo que salio en la consola:
 * Leo aparece como el paciente más urgente y sale primero
 * en la atención.
 *
 * 3. Por que salio asi:
 * Porque PriorityQueue organiza los pacientes según su
 * gravedad y compareTo ya está configurado para que el
 * número más alto tenga mayor prioridad.
 */

public class SalaEmergenciasReto {

    static class Paciente implements Comparable<Paciente> {

        private String nombre;
        private int gravedad;

        public Paciente(String nombre, int gravedad) {
            this.nombre = nombre;
            this.gravedad = gravedad;
        }

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
                case 5: return "Critico";
                default: return "Desconocida";
            }
        }

        @Override
        public String toString() {
            return nombre + " (" + getGravedadTexto() + ")";
        }

        @Override
        public int compareTo(Paciente otro) {
            return Integer.compare(otro.gravedad, this.gravedad);
        }
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

        // NUEVO PACIENTE DEL RETO
        salaEspera.offer(new Paciente("Leo", 5));

        System.out.println("Orden de llegada: " + salaEspera);

        // 2. TRIAGE
        PriorityQueue<Paciente> triage = new PriorityQueue<>();

        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }

        System.out.println("Paciente mas urgente: " + triage.peek());
        System.out.println();

        // 3. ATENCION E HISTORIAL
        Stack<Paciente> historial = new Stack<>();

        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historial.push(atendido);
        }

        System.out.println();

        System.out.println("Ultimo paciente atendido: " + historial.peek());
        System.out.println("Total atendidos: " + historial.size());

        System.out.println("\nTodos los pacientes fueron atendidos.");
    }
}
