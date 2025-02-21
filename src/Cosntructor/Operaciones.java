/*Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, calcular su suma, resta,
multiplicación y división, cada una en un método, imprimir dichos resultados.*/

package Cosntructor;

import java.util.Scanner;

public class Operaciones {

    private Scanner teclado;
    private int v1,v2;
    private int suma,resta,division,multiplicacion;


    public Operaciones(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el valor 1= ");
        this.v1=teclado.nextInt();
        System.out.println("Por favor ingrese el valor 2= ");
        this.v2=teclado.nextInt();
        sumar(v1,v2);
        resta(v1,v2);
        division(v1,v2);
        multiplicacion(v1,v2);

    }

    public void sumar(int x1, int x2){
        suma= v1 + v2;
        System.out.println("El resultado de la Suma= " + suma);

    }

    public void resta(int x1, int x2){
        resta= v1 - v2;
        System.out.println("El resultado de la Resta= " + resta);

    }

    public void division(int x1, int x2){
        division= v1 / v2;
        System.out.println("El resultado de la División= " + division);

    }

    public void multiplicacion(int x1, int x2){
        multiplicacion= v1 * v2;
        System.out.println("El resultado de la Multiplicación= " + multiplicacion);

    }

    public static void main(String[] ar){
        Operaciones op= new Operaciones();
    }


}
