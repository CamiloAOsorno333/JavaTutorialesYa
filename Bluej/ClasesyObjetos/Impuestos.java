import java.util.Scanner;

/*Confeccionar una clase que represente un empleado. Definir como atributos su nombre 
 * y su sueldo. Confeccionar los métodos para la carga, otro para imprimir sus datos 
 * y por último uno que imprima un mensaje si debe pagar impuestos 
 * (si el sueldo supera a 3000)*/

public class Impuestos{
    
    //Atributos
    private Scanner teclado;
    private String nombre;
    private int sueldo;
    
    
    //Metodo Inicializar
    public void inicializar(){
    teclado=new Scanner(System.in);
    System.out.println("Por favor ingrese el nombre del empleado= ");
    nombre=teclado.nextLine();
    //teclado.nextLine();
    System.out.println("Por favor ingrese el sueldo del empleado= ");
    sueldo=teclado.nextInt();
    }
    
    //Medodo Imprimir
    public void imprimir(){
        System.out.println("Empleado = " + nombre);
        System.out.println("Sueldo = " + sueldo);
    }
    
    //Metodo calcular pago impuesto
    public void calculo(){
        if(sueldo>3000){
            System.out.println("El empleado debe pagar impuestos");
        }else{
            System.out.println("El empleado esta exento del pago de impuestos");
        }
    }
    
    //Main
    public static void main(String[] args){
        Impuestos impuesto1=new Impuestos();
        impuesto1.inicializar();
        impuesto1.imprimir();
        impuesto1.calculo();
    }
}
