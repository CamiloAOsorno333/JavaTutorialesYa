import java.util.Scanner;

/*Desarrollar un programa que cargue los lados de un triángulo e implemente 
 *los siguientes métodos: inicializar los atributos, imprimir el valor del 
 *lado mayor y otro método que muestre si es equilátero o no.*/

public class Triangulo{
    
    private Scanner teclado;
    int lado1,lado2,lado3;
    
    //Metodo Inicializar
    public void inicializar(){ 
    teclado=new Scanner(System.in);
    System.out.println("Ingrese el valor del lado 1= ");
    lado1=teclado.nextInt();
    System.out.println("Ingrese el valor del lado 2= ");
    lado2=teclado.nextInt();
    System.out.println("Ingrese el valor del lado 3= ");
    lado3=teclado.nextInt();
    }
    
    public void imprimir(){
    if(lado1 > lado2 && lado1 > lado3){
        System.out.println("El lado 1 es el mayor " + lado1);
        }if(lado2 > lado1 && lado2 > lado3){
            System.out.println("El lado 2 es el mayor " + lado2);
        }else{
            System.out.println("El lado 3 es el mayor " + lado3);
        }
    }
    
    public void trianguloEquilatero(){
        if(lado1==lado2 && lado1==lado3 && lado3==lado2 ){
            System.out.println("Se trata de un Triangulo Equilatero");
        }else{
            System.out.println("No se trata de un triangulo Equilatero");
        }
    }
    
    public static void main(String[] args){
        Triangulo triangulo1= new Triangulo();
        triangulo1.inicializar();
        triangulo1.imprimir();
        triangulo1.trianguloEquilatero();
    }

     
}
