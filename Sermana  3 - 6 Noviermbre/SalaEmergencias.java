import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// Clase Paciente: va en el mismo archivo, sin "public"
class Paciente implements Comparable<Paciente> {

    // PASO 1: atributos, constructor y getters
    
    private String nombre;
    private int edad;
    private int gravedad;

    public Paciente(String nombre, int edad, int gravedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getGravedad() {
        return gravedad;
    }
    // PASO 2: getGravedadTexto() y toString()
     public String getGravedadTexto() {

        switch (gravedad) {
            case 1:
                return "Leve";
            case 2:
                return "Moderada";
            case 3:
                return "Grave";
            case 4:
                return "Muy grave";
            case 5:
                return "Critica";
            default:
                return "Desconocida";
        }
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre +
               " | Edad: " + edad +
               " | Gravedad: " + getGravedadTexto();
    }
    // PASO 5: compareTo()
    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(otro.gravedad, this.gravedad);
    }
}


public class SalaEmergencias {

    public static void main(String[] args) {
        

        // PASO 1 y 2: prueba tu clase Paciente aquí
        
        Paciente p1 = new Paciente("Ana", 25, 3);
        Paciente p2 = new Paciente("Carlos", 40, 5);
        Paciente p3 = new Paciente("Maria", 30, 1);
        Paciente p4 = new Paciente("Pedro", 50, 4);

        System.out.println("=== PACIENTES REGISTRADOS ===");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        // PASO 3: sala de espera
        
          Queue<Paciente> salaEspera = new LinkedList<>();

        salaEspera.offer(p1);
        salaEspera.offer(p2);
        salaEspera.offer(p3);
        salaEspera.offer(p4);

        System.out.println("\n=== SALA DE ESPERA ===");

        for (Paciente paciente : salaEspera) {
            System.out.println(paciente);
        }

        
        // PASO 4: triage
        
         PriorityQueue<Paciente> triage = new PriorityQueue<>();

        while (!salaEspera.isEmpty()) {

            Paciente paciente = salaEspera.poll();

            triage.offer(paciente);
        }

        System.out.println("\n=== ORDEN DE TRIAGE ===");

        for (Paciente paciente : triage) {
            System.out.println(paciente);
        }


        // PASO 6: atención e historial
        Stack<Paciente> historial = new Stack<>();

        System.out.println("\n=== ATENCION DE PACIENTES ===");

        while (!triage.isEmpty()) {

            Paciente atendido = triage.poll();

            System.out.println("Se atendio: " + atendido);

            historial.push(atendido);
        }

         // Mostrar historial

        System.out.println("\n=== HISTORIAL DE ATENCION ===");

        while (!historial.isEmpty()) {

            Paciente paciente = historial.pop();

            System.out.println("Historial: " + paciente);
        }

        System.out.println("\nTodos los pacientes fueron atendidos.");
    }
}
    
