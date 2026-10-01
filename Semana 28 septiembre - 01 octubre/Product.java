package listasenlazadaspoo28sept;


 
public class Product {

    // Atributos del producto (privados para respetar el encapsulamiento)
    private int id;        // Código único que identifica al producto
    private String name;   // Nombre del producto
    private double price;  // Precio unitario
    private int existencie;     // Cantidad disponible en existencia

    
    //Constructor: crea un producto con todos sus datos.
    
    public Product(int id, String name, double price, int existencie) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.existencie = existencie;
    }

    // ---------- Getters: permiten consultar los datos ----------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getExistencie() {
        return existencie;
    }

    // ---------- Setters: permiten modificar los datos ----------

    public void setPrice(double price) {
        this.price = price;
    }

    
    //Suma una cantidad a la existencia actual del producto.
   
    public void addStock(int quantity) {
        this.existencie += quantity;
    }

    
    //Representación en texto del producto.
    
    @Override
    public String toString() {
        return "ID: " + id
                + " | Nombre: " + name
                + " | Precio: $" + String.format("%.2f", price)
                + " | Existencia: " + existencie;
    }
}
