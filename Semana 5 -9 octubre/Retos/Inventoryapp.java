import java.util.Scanner;

public class InventoryApp {
    private Scanner sc = new Scanner(System.in);
    private Inventory inventory;

    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        app.init();
    }

    public void init() {
        inventory = new Inventory();
        int op;
        do {
            System.out.println("\n\n MENU");
            System.out.println("---- GESTIÓN DE INVENTARIOS ----");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar existencia");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Consultar producto por ID"); // Nueva opción
            System.out.println("7. Salir"); // Opción 7 para salir
            System.out.println("\nSelecciona una opción:");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    printProduct();
                    break;
                case 6:
                    findProduct(); // Llama a la nueva opción
                    break;
            }
        } while (op != 7); // Cambia a 7 para salir
    }

    private void newProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto:");
        String name = sc.next();

        System.out.println("Existencia inicial:");
        int existence = sc.nextInt();

        System.out.println("Precio del producto:");
        double price = sc.nextDouble();

        System.out.println("Categoría del producto:");
        String category = sc.next(); // Captura la categoría

        inventory.newProduct(ID, name, existence, price, category);
    }

    private void addProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();
        inventory.addProduct(ID);
    }

    private void deleteProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();
        inventory.deleteProduct(ID);
    }

    private void updateProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nuevo precio:");
        double price = sc.nextDouble();

        inventory.updateProduct(ID, price);
    }

    private void printProduct() {
        inventory.printProducts();
    }

    // Método para la nueva opción del menú
    private void findProduct() {
        System.out.println("ID del producto a buscar:");
        int ID = sc.nextInt();
        inventory.findProductByID(ID);
    }
}
