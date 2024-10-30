import java.util.Scanner;

/**
 Implementar la clase operaciones. Se deben cargar dos valores enteros, 
 calcular su suma, resta, multiplicación y división, cada una en un método, 
 imprimir dichos resultados.
 */
public class Operaciones{
    
    private Scanner teclado;
    private int valor1, valor2,suma,resta,multiplicacion,division;
    
    //Metodo inicializar 
    public void inicializar(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el primer valor= ");
        valor1=teclado.nextInt();
        System.out.println("Por favor ingrese el segundo valor= ");
        valor2=teclado.nextInt();
    }
    
    public void sumar(){
        suma=valor1 + valor2;
        System.out.println("El resultado de la suma es = " + suma);
    }
    
    public void restar(){
        resta=valor1 - valor2;
        System.out.println("El resultado de la resta es = " + resta);
        }
        
    public void multiplicar(){
        multiplicacion= valor1 * valor2;
        System.out.println("El resultado de la multiplicación es " + multiplicacion);
    }
    
    public void dividir(){
        division= valor1 / valor2;
        System.out.println("El resultado de la division es = " + division );
    }
    
    public static void main(String[] args){
        Operaciones operaciones1= new Operaciones();
        operaciones1.inicializar();
        operaciones1.sumar();
        operaciones1.restar();
        operaciones1.multiplicar();
        operaciones1.dividir();
        
    }
}
