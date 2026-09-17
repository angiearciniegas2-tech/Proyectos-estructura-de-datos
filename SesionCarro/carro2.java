package uniminuto.sesionpoo_carro;

public class SesionPOO_Carro {
    public static void main(String[] args) {

        // ============================================================
        // PASO 3: Cada estudiante crea su objeto (instancia) y lo llena
        // Estos 4 son el EJEMPLO GUIA. Ustedes deben agregar 10 objetos
        // MAS (c5 a c14) siguiendo exactamente este mismo patron.
        // ============================================================
        Carro c1 = new Carro("Mazda", "3", 2020, "Rojo");
        Carro c2 = new Carro("Toyota", "Corolla", 2019, "Blanco");
        Carro c3 = new Carro("Renault", "Logan", 2021, "Gris");
        Carro c4 = new Carro("Chevrolet", "Spark", 2018, "Azul");
        Carro c5 = new Carro("Nissan", "Sentra", 2022, "Negro");
        Carro c6 = new Carro("Ford", "Fiesta", 2017, "Plata");
        Carro c7 = new Carro("Kia", "Picanto", 2023, "Amarillo");
        Carro c8 = new Carro("Hyundai", "Tucson", 2021, "Verde");
        Carro c9 = new Carro("Volkswagen", "Gol", 2019, "Rojo");
        Carro c10 = new Carro("Honda", "Civic", 2020, "Blanco");
        Carro c11 = new Carro("Subaru", "Impreza", 2018, "Azul");
        Carro c12 = new Carro("BMW", "320i", 2022, "Negro");
        Carro c13 = new Carro("Mercedes-Benz", "C200", 2023, "Gris");
        Carro c14 = new Carro("Audi", "A4", 2021, "Blanco");

        System.out.println("=== PASO 3: Objetos creados ===");
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        c4.mostrarInfo();

        // >>> AQUI VAN las llamadas a mostrarInfo() de c5 a c14 <<<
        c5.mostrarInfo();
        c6.mostrarInfo();
        c7.mostrarInfo();
        c8.mostrarInfo();
        c9.mostrarInfo();
        c10.mostrarInfo();
        c11.mostrarInfo();
        c12.mostrarInfo();
        c13.mostrarInfo();
        c14.mostrarInfo();

        // ============================================================
        // PASO 4: BLOQUE NO NEGOCIABLE - Referencia vs valor
        // ============================================================
        System.out.println("\n=== PASO 4: Referencia vs valor ===");
        Carro copia = c1;        // copia es una SEGUNDA LLAVE hacia el MISMO objeto
        copia.modelo = "CX-5";

        System.out.println("Que imprime c1.modelo? Predigan antes de ver:");
        System.out.println("c1.modelo = " + c1.modelo);

        // ============================================================
        // PASO 5 y 6: Enlazar los carros con "siguiente"
        // Ustedes deben enlazar los 14: c1->c2->c3->...->c14->null
        // ============================================================
        System.out.println("\n=== PASO 5-6: Enlazando los carros ===");
        c1.siguiente = c2;
        c2.siguiente = c3;
        c3.siguiente = c4;

        // >>> AQUI VAN los enlaces de c4 hasta c14, y c14.siguiente = null <<<
        c4.siguiente = c5;
        c5.siguiente = c6;
        c6.siguiente = c7;
        c7.siguiente = c8;
        c8.siguiente = c9;
        c9.siguiente = c10;
        c10.siguiente = c11;
        c11.siguiente = c12;
        c12.siguiente = c13;
        c13.siguiente = c14;
        c14.siguiente = null;

        // Recorrido: NO LO MODIFIQUEN, ya esta completo
        System.out.println("Recorriendo la cadena desde c1:");
        Carro actual = c1;
        while (actual != null) {
            actual.mostrarInfo();
            actual = actual.siguiente;
        }
        System.out.println("Llegamos a 'null': no hay mas carros encadenados.");
    }
}
