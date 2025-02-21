/*Plantear una clase llamada Alumno y definir como atributos su nombre y su edad. En el constructor realizar la carga
de datos. Definir otros dos métodos para imprimir los datos ingresados y un mensaje si es mayor o no de edad (edad >=18)*/

import java.util.Scanner;

public class Alumno{

    private Scanner teclado;
    private String nombre;
    private int edad;

    public Alumno(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del Alumno= ");
        nombre= teclado.next();
        System.out.println("Por favor ingrese la edad del alumno");
        edad=teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("El Alumno= " + nombre + "cuenta con una edad de = " + edad);
    }

    public void mEdad() {
        if(edad > 18){
            System.out.println("El alumno " + nombre + " es mayor de edad");
        }else {
            System.out.println("El alumno " + nombre + " no es mayor de edad" );
        }
    }

    public static void main(String[] ar){

       Alumno al= new Alumno();
       al.imprimir();
       al.mEdad();
    }

}