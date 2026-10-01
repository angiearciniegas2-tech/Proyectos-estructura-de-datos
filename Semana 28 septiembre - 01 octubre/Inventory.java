package listasenlazadaspoo28sept;

import java.util.LinkedList;


public class Inventory {

    // Lista enlazada que almacena todos los productos del inventario
    private LinkedList<Product> products;

    
    //Constructor: inicializa la lista vacía.
    
    public Inventory() {
        products = new LinkedList<>();
    }

    /**
     * Busca un producto por su ID recorriendo la lista.
     * @return el producto encontrado, o null si no existe
     */
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * CREAR: agrega un nuevo producto al final de la lista.
     * No permite IDs repetidos.
     * @return true si se agregó, false si el ID ya existía
     */
    public boolean addProduct(Product product) {
        if (findById(product.getId()) != null) {
            return false; // ya existe un producto con ese ID
        }
        products.addLast(product);
        return true;
    }

    /**
     * MODIFICAR: suma unidades a la existencia de un producto.
     * @return true si se actualizó, false si el producto no existe
     */
    public boolean addStock(int id, int quantity) {
        Product p = findById(id);
        if (p == null) {
            return false;
        }
        p.addStock(quantity);
        return true;
    }

    /**
     * MODIFICAR: cambia el precio de un producto existente.
     * @return true si se actualizó, false si el producto no existe
     */
    public boolean updatePrice(int id, double newPrice) {
        Product p = findById(id);
        if (p == null) {
            return false;
        }
        p.setPrice(newPrice);
        return true;
    }

    /**
     * CONSULTAR: muestra todos los productos de la lista.
     */
    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("---- INVENTARIO (" + products.size() + " productos) ----");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    /**
     * ELIMINAR: quita de la lista el producto con el ID indicado.
     * @return true si se eliminó, false si el producto no existe
     */
    public boolean removeProduct(int id) {
        Product p = findById(id);
        if (p == null) {
            return false;
        }
        products.remove(p);
        return true;
    }
}
