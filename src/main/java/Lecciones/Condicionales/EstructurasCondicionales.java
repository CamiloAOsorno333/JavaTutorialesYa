package Lecciones.Condicionales;

import java.util.Scanner;

public class EstructurasCondicionales {
    public static void main(String[] args) {

      /*Ingresar el sueldo de una persona,
      si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.*/

       float sueldo;
       Scanner teclado= new Scanner(System.in);

        System.out.println("Por favor ingrese el sueldo que devenga = ");
        sueldo= teclado.nextFloat();
        if(sueldo >3000){
            System.out.println("Esta persona debe pagarle impuestos a la DIAN");

        }
   /*Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla
   el mayor de ellos.*/

        int num1,num2;
        System.out.println("Por favor ingrese dos números para determinar cual es mayor");
        System.out.println("Ingrese el número 1 = ");
        num1= teclado.nextInt();
        System.out.println("Ingres el número 2 = ");
        num2= teclado.nextInt();
        if(num1>num2){
            System.out.println("El número 1 es el mayor" + num1);
        }else{
            System.out.println("El número 2 es el mayor" + num2);
        }

        /*Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo
        informar su suma y diferencia, en caso contrario informar el producto y la división del
        primero respecto al segundo.*/

        int num3,num4,suma,diferencia, producto, division;
        System.out.println("Por favor ingrese dos números para realizar operaciones");
        System.out.println("Ingrese el primer número");
        num3= teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num4= teclado.nextInt();
        if(num3>num4){
            suma=num3+num4;
            System.out.println("La suma de los números es = " + suma);
            diferencia= num3 - num4;
            System.out.println("La diferencia de los números es =" + diferencia);
        }else {
            producto= num3 * num4;
            System.out.println("El producto de los números es = " + producto);
            division= num3 / num4;
            System.out.println("La diferencia de los números es = " + division);
        }

        /*Se ingresan tres notas de un alumno,
        si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado"*/

        float nota1,nota2,nota3,sumaNotas,promedio;

        System.out.println("Por favor ingrese las tres notas del periodo");
        System.out.println("Ingrese la primer nota = ");
        nota1= teclado.nextFloat();
        System.out.println("Ingrese la segunda nota = ");
        nota2= teclado.nextFloat();
        System.out.println("Ingrese la tercera nota = ");
        nota3= teclado.nextFloat();
        sumaNotas= nota1 + nota2 + nota3;
        promedio= sumaNotas / 3;
        if (promedio > 7) {
            System.out.println("Su promedio es =  " + promedio);
            System.out.println("Promocionado");
        }else{
            System.out.println("Has Reprobado, sigue intentandolo, ");
        }

    /*Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando
    si el número tiene uno o dos dígitos.
    (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/

        System.out.println("Por  favor ingrese un número del 1 al 99");
        int num5;
        System.out.println("Ingrese el número");
        num5= teclado.nextInt();
        if(num5 <= 9){
            System.out.println("El número ingresado es de un digito");
        }else{
            System.out.println("El número ingresado es de dos digitos");
        }

    }

}
