package Lecciones;


/*Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.*/

import java.util.Scanner;

public class ProgramacionSecuencial {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el Número 1");
        int num1,num2,suma;
        num1= teclado.nextInt();
        System.out.println("Por favor ingrese el Número 2");
        num2=teclado.nextInt();
        suma=num1 + num2;
        System.out.println(" Suma es igual a = " + suma);

        /*Realizar la carga del lado de un cuadrado, mostrar por pantalla el
        perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)*/

        System.out.println("Por favor ingresa el valor del lado del cuadrado");
        int lado, perimetro;
        lado= teclado.nextInt();
        perimetro= lado * 4;
        System.out.println("El perimetro del cuadrado es =  " + perimetro);

        /*Escribir un programa en el cual se ingresen cuatro números,
        calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.*/

        System.out.println("Por favor ingresa 4 números para realizar algunos calculos");
        int n1,n2,n3,n4,producto,sum;
        System.out.println("Ingrese el número 1");
        n1= teclado.nextInt();
        System.out.println("Ingrese el número 2");
        n2= teclado.nextInt();
        System.out.println("Ingrese el número 3");
        n3= teclado.nextInt();
        System.out.println("Ingrese el número 4");
        n4= teclado.nextInt();
        sum= n1 + n2;
        System.out.println("El resultado de la suma es = " + sum);
        producto=n3 * n4;
        System.out.println(" El producto de los dos números es = " + producto);

        /*Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.*/

        System.out.println("Por favor ingrese 4 valores");
        int n5,n6,n7,n8, promedio,sum2;
        System.out.println("Ingrese el número 1");
        n5= teclado.nextInt();
        System.out.println("Ingrese el número 2");
        n6= teclado.nextInt();
        System.out.println("Ingrese el número 3");
        n7= teclado.nextInt();
        System.out.println("Ingrese el número 4");
        n8= teclado.nextInt();
        sum2= n5 + n6 + n7 + n8;
        System.out.println("La suma de los 4 números es = " + sum2);
        promedio= (n5 + n6 + n7 + n8) / 4;
        System.out.println("El promedio de los 4 números es = " + promedio);


        /*Se debe desarrollar un programa que pida el ingreso del precio de un artículo
        y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.*/

        int precio, cantidad,precioPagar;
        System.out.println("Por favor ingrese el precio del Articulo = ");
        precio= teclado.nextInt();
        System.out.println("Por favor ingrese la cantidad de productos que desea llevar = ");
        cantidad= teclado.nextInt();
        precioPagar= precio * cantidad;
        System.out.println("El precio a pagar por los productos es = " + precioPagar);

    }

}
