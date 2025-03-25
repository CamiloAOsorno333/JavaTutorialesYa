package Lecciones.Herencia;

/*
*Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades un
* método que cargue los datos personales y otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un atributo sueldo y los métodos de cargar
* el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto de la clase Empleado y llamar a
* sus métodos.*/


import java.util.Scanner;

public class Persona {

    private Scanner teclado;
    private String nombre;
    private int edad;



    public Persona(){
        teclado=new Scanner(System.in);

    }

    public void cargarNombre(){
        System.out.println("Ingrese el Nombre");
        nombre= teclado.next();
    }

    public void cargarEdad(){
        System.out.println("Ingrese la Edad 🙈");
        edad=teclado.nextInt();
    }

    public void imprimir(){
        System.out.println(nombre + "cuenta con " + edad + "  de edad");
    }

}
