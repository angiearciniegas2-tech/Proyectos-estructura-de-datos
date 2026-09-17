package uniminuto.sesionpoo_carro;

public class Carro {

    // ---- Atributos de datos puros ----
    String marca;
    String modelo;
    int anio;
    String color;

    // ---- Atributo de REFERENCIA hacia otro Carro (el "puente" a Nodo) ----
    Carro siguiente; // por defecto queda en null hasta que se asigne

    // ---- Constructor ----
    Carro(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.siguiente = null; // al crearse, no apunta a nadie todavia
    }

    // ---- Metodo (unico, sin parametros, sin retorno) ----
    void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo
                + " | Anio: " + anio + " | Color: " + color);
    }
}
