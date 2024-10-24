import java.util.Scanner;

/*Confeccionar una clase que permita carga el nombre y la edad de una persona. Mostrar los datos cargados. 
        * Imprimir un mensaje si es mayor de edad (edad>=18)*/ 
       

public class Persona{
    
    private Scanner teclado; 
    private int edad;
    private String nombre;
    
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.println("Ingrese por favor el nombre= ");
        nombre=teclado.next();
        System.out.println("Por favor ingrese la edad = ");
        edad=teclado.nextInt();
        }
        
    public void imprimir(){
        System.out.println("Nombre= " + nombre);
        System.out.println("Edad = " + edad);
    }
    
    public void esMayorEdad(){
        if(edad>18){
            System.out.println(nombre + " " + "Es mayor de edad");
        }else{
            System.out.println(nombre + " " + "No es mayor de edad");
        }
    }
    
    public static void main(String[] ar){
        Persona persona1;
        persona1= new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
    
}
