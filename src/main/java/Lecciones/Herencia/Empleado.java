package Lecciones.Herencia;

/*Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades un método
que cargue los datos personales y otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un atributo sueldo y los métodos de cargar el
sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto de la clase Empleado y llamar a
sus métodos.*/

import java.util.Scanner;

public class Empleado extends Persona{

    protected int sueldo;
    private Scanner teclado;

    public void cargarSueldo(){
        teclado=new Scanner(System.in);
        System.out.println("Ingrese el sueldo");
        sueldo= teclado.nextInt();
    }

    public void imprimirsueldo(){
        System.out.println("El sueldo es= " + sueldo);
    }

    public static void main(String[] args){
        Persona p= new Persona();
        p.cargarNombre();
        p.cargarEdad();
        p.imprimir();
        Empleado emp= new Empleado();
        emp.cargarNombre();
        emp.cargarEdad();
        emp.cargarSueldo();
        emp.imprimir();
        emp.imprimirsueldo();
                                    //Si declararamos en el constructor todos estos metodos,
    }

}
