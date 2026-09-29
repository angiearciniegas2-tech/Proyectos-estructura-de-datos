ackage poo2;

// Clase:Plantilla
public class Alumno {
    //Atributos: Caracteristicas de un objeto 
    int id;
    String nombre;
    String apellido;
    
//Metodo contructores: permiten crear objetos (en este caso de la clase alumno se creaun objeto)
    public Alumno() {//Constructores vacios: Permiten crear objetos sin datos
    }

    public Alumno(int id, String nombre, String apellido) {//Constructores con todos los parametros: se pasa los datos que queremos que tenaga cada uno de los objetos
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getter and setter son metodos especiales que nos permite entrar en los valores de cada uno de los atributos que ten amos de una clase 
    //get: Traer (Es para obtener los datos)
    //set:colocaro modificar(los valores de los atributos)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
      
    
    
    //Metodos:Acciones - void es un procedimiento
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    
     public void saberNota(double calificacion){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
        if (calificacion >=3.0){
            System.out.println("Paso la materiA");
        }
        else{
            System.out.println("materia perdida");
        }    
    }
   
    
}
