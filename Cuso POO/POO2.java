package poo2;


public class Poo2 {

    
    public static void main(String[] args) {
     
    //Llama a el contructor 
    Alumno alu1 = new Alumno (); //Llama a el constructor vacio
    Alumno alu2 = new Alumno (1012,"Lorena","Perez"); //Llama a el constructor con datos  
     
    
    System.out.println("el id del alumno 2 es:" + alu2.getId());
    System.out.println("el nombre del alumno 2 es:" + alu2.getNombre());
    System.out.println("el apellido del alumno 2 es:" + alu2.getApellido());
    
    alu1.setId(236);
    alu1.setNombre("Juliana");
    alu1.setApellido("Suarez");
    
     //se agrega el valor con set
    System.out.println("el id del alumno 1 es:" + alu1.getId());
    System.out.println("el nombre del alumno 1 es:" + alu1.getNombre());
    System.out.println("el apellido del alumno 1 es:" + alu1.getApellido());
    
    
    //se cambia el valor
    alu2.setId(1102);
    
    System.out.println("el id del alumno 2 es:" + alu2.getId());
    System.out.println("el nombre del alumno 2 es:" + alu2.getNombre());
    System.out.println("el apellido del alumno 2 es:" + alu2.getApellido());
    
            }          
    
}
