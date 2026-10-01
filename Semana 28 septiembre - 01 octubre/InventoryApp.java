package listasenlazadaspoo28sept;

import java.util.Scanner;


public class InventoryApp {

    // Scanner compartido para leer datos desde la consola
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Inventory inventory = new Inventory(); // objeto que administra la LinkedList
        int option;

        // Ciclo del menú: se repite hasta que el usuario elija salir (0)
        do {
            showMenu();
            option = readInt("Elija una opción: ");

            switch (option) {
                case 1:
                    createProduct(inventory);
                    break;
                case 2:
                    addStock(inventory);
                    break;
                case 3:
                    updatePrice(inventory);
                    break;
                case 4:
                    inventory.showProducts();
                    break;
                case 5:
                    deleteProduct(inventory);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 0);
    }

    //Imprime las opciones del menú. 
    private static void showMenu() {
        System.out.println("\n---- MENÚ DE INVENTARIO ----");
        System.out.println("1. Crear producto");
        System.out.println("2. Agregar existencia");
        System.out.println("3. Actualizar precio");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Eliminar producto");
        System.out.println("0. Salir");
    }

    //Pide los datos y crea un nuevo producto en el inventario. 
    private static void createProduct(Inventory inventory) {
        int id = readInt("ID del producto: ");
        System.out.print("Nombre: ");
        String name = scanner.nextLine().trim();
        double price = readDouble("Precio: ");
        int stock = readInt("Existencia inicial: ");

        // Validaciones básicas de los datos
        if (name.isEmpty() || price < 0 || stock < 0) {
            System.out.println("Datos inválidos: el nombre no puede estar vacío y los números no pueden ser negativos.");
            return;
        }

        Product product = new Product(id, name, price, stock);
        if (inventory.addProduct(product)) {
            System.out.println("Producto creado correctamente.");
        } else {
            System.out.println("Ya existe un producto con el ID " + id + ".");
        }
    }

    //Pide un ID y una cantidad para sumar a la existencia. 
    private static void addStock(Inventory inventory) {
        int id = readInt("ID del producto: ");
        int quantity = readInt("Cantidad a agregar: ");

        if (quantity <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        if (inventory.addExistencie(id, quantity)) {
            System.out.println("Existencia actualizada.");
        } else {
            System.out.println("No se encontró el producto con ID " + id + ".");
        }
    }

    //Pide un ID y un nuevo precio para actualizarlo. 
    private static void updatePrice(Inventory inventory) {
        int id = readInt("ID del producto: ");
        double newPrice = readDouble("Nuevo precio: ");

        if (newPrice < 0) {
            System.out.println("El precio no puede ser negativo.");
            return;
        }

        if (inventory.updatePrice(id, newPrice)) {
            System.out.println("Precio actualizado.");
        } else {
            System.out.println("No se encontró el producto con ID " + id + ".");
        }
    }

    //Pide un ID y elimina el producto correspondiente. 
    private static void deleteProduct(Inventory inventory) {
        int id = readInt("ID del producto a eliminar: ");

        if (inventory.removeProduct(id)) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("No se encontró el producto con ID " + id + ".");
        }
    }

    /**
     * Lee un número entero de forma segura.
     * Repite la pregunta si el usuario escribe algo que no es un entero.
     */
    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Escriba un número entero.");
            }
        }
    }

    /**
     * Lee un número decimal de forma segura.
     * Acepta coma o punto como separador decimal.
     */
    private static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Escriba un número (ej: 2500.50).");
            }
        }
    }
}
