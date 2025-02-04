package Lecciones.For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        /*Realizar un programa que imprima en pantalla los números del 1 al 100.*/

        for (int f=1;f<=100;f++){
            System.out.println(f + "-");
        }

            /*Desarrollar un programa que permita la carga de 10 valores por teclado
            y nos muestre posteriormente la suma de los valores ingresados y su promedio.
            Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.*/

            Scanner teclado= new Scanner(System.in);
            int suma=0;

            for (int x=1; x<=10; x++){
                System.out.println("Por favor ingrese un valor para su calculo = " + x + "o");
                int valor= teclado.nextInt();
                suma= suma + valor;
            }
            int promedio= suma /10;
            System.out.println("la suma de los valores es = " + suma);
            System.out.println("el promedio de los valores es = " + promedio);

        /*Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen
        notas mayores o iguales a 7 y cuántos menores.*/

        System.out.println("Por favor ingrese las notas de los alumnos");
        int notas;
        int aprobadas=0;
        int reprobadas=0;

        for (int f=1; f<=10;f++){
            System.out.println("Por favor ingrese la nota Nro. " + f + "o");
            notas=teclado.nextInt();
            if(notas >=7){
                 aprobadas++;
            }else{
                reprobadas++;
            }
            System.out.println("Los alumnos aprobados son = " + aprobadas );
            System.out.println("Los alumnos reprobados son = " + reprobadas );
        }

    }
}
