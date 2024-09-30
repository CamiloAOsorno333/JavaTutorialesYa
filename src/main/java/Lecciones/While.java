package Lecciones;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        /*Realizar un programa que imprima en pantalla los números del 1 al 100.*/

        int x=1;

        while (x<=100){
            System.out.println(x);
            System.out.print(" - ");
            x++;
        }

        while (x<=500){
            System.out.println(x);
            System.out.print(" - ");
            x++;
        }

        int x2=50;

        while(x2<=100){
            System.out.println(" 🐱‍👤 " + x2);
            x2++;

        }

        x=-50;
        while(x>=0){
            System.out.println(" - " + x);
            x++;
        }

        x=2;
        while(x<=100){
            System.out.println(" - " + x);
            x=x+2;
        }

        /*Escribir un programa que solicite
        la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno. */

        Scanner teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese un número positivo");
        int n= teclado.nextInt();
        x=1;
        while (x<=n){
            System.out.println(" - " + x);
            x++;
        }

        /*Desarrollar un programa que permita la carga de 10 valores por teclado
        y nos muestre posteriormente la suma de los valores ingresados y su promedio.*/

        System.out.println("Por favor ingrese 10 valores que seran sumados y promediaddos");

        int suma, valor,promedio,p;
        p=1;
        suma=0;
        while (p<=10){
            System.out.println("Por favor ingrese un valor");
            valor= teclado.nextInt();
            suma=suma + valor;
           p++;
        }
        promedio= suma/10;
        System.out.println("La suma de los valores es = " + suma);
        System.out.println("El promedio de los La suma de los valores es = " + promedio);

        /*Una planta que fabrica perfiles de hierro posee un lote de n piezas.
        Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a
        procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya
        longitud esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla
        la cantidad de piezas aptas que hay en el lote.*/

        
    }
}
