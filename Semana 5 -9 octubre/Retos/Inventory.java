import java.util.LinkedList;
import java.util.List;

public class Inventory {
    // Lista donde se guardan los productos
    private List<Product> products;

    // Constructor: crea la lista vacía
    public Inventory() {
        products = new LinkedList<>();
    }

    // AGREGAR UN PRODUCTO NUEVO
    public void newProduct(int ID, String name, int existence, double price, String category) {
        Product newProduct = new Product(ID, name, existence, price, category);
        boolean success = products.add(newProduct);

        if (success) {
            System.out.println("El producto " + name + " se añadió satisfactoriamente");
        } else {
            System.out.println("Ocurrió un problema al agregar el producto");
        }
    }

    // AUMENTAR LA EXISTENCIA DE UN PRODUCTO (Con validación)
    public void addProduct(int ID) {
        int productIndex = products.indexOf(new Product(ID));
        
        if (productIndex == -1) {
            System.out.println("El producto no existe");
            return;
        }

        Product product = products.get(productIndex);
        int existenceTemp = product.getExistence();
        int newExistence = existenceTemp + 1;
        product.setExistence(newExistence);
        System.out.println("\nSe agregó una unidad de " + product.getName());
    }

    // MOSTRAR TODOS LOS PRODUCTOS
    public void printProducts() {
        System.out.println("PRODUCTOS EN EL ALMACÉN");
        products.forEach(System.out::println);
        System.out.println();
    }

    // ACTUALIZAR EL PRECIO (Con validación)
    public void updateProduct(int ID, double price) {
        int productIndex = products.indexOf(new Product(ID));
        
        if (productIndex == -1) {
            System.out.println("El producto no existe");
            return;
        }

        Product product = products.get(productIndex);
        product.setPrice(price);
        System.out.println("\nPrecio actualizado correctamente");
    }

    // ELIMINAR UN PRODUCTO (Con validación)
    public void deleteProduct(int ID) {
        int productIndex = products.indexOf(new Product(ID));
        
        if (productIndex == -1) {
            System.out.println("El producto no existe");
            return;
        }

        Product deleteProduct = products.remove(productIndex);
        System.out.println("El producto " + deleteProduct + " se eliminó");
    }

    // CONSULTAR UN PRODUCTO POR SU ID (Nuevo requerimiento)
    public void findProductByID(int ID) {
        int productIndex = products.indexOf(new Product(ID));
        
        if (productIndex == -1) {
            System.out.println("El producto no existe");
        } else {
            Product product = products.get(productIndex);
            System.out.println("Producto encontrado: " + product);
        }
    }
}
