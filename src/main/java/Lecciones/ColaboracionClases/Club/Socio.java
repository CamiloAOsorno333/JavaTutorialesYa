package Lecciones.ColaboracionClases.Club;

/*Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años).
En el constructor pedir la carga del nombre y su antigüedad.
La clase Club debe tener como atributos 3 objetos de
la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.*/


import java.util.Scanner;

public class Socio {

    private Scanner teclado;
    private String nombre;
    private int antiguedad;


    public Socio(Scanner teclado){
        System.out.println("Ingrese el Nombre");
        nombre=teclado.next();
        System.out.println("Ingrese la Antiguedad");
        antiguedad=teclado.nextInt();
    }

    public String cargaNombre(){
        return nombre;
    }

    public int antiguedad(){
       return antiguedad;
    }

    public void imprimir(){
        System.out.println("El socio " + nombre + "tiene " + antiguedad + " de antiguedad");
    }

    
}
