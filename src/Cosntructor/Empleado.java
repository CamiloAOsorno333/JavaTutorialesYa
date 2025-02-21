/*Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. En el constructor
cargar los atributos y luego en otro método imprimir sus datos y por último uno que imprima un mensaje si debe pagar
impuestos (si el sueldo supera a 3000)*/

package Cosntructor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Empleado {

    private Scanner teclado;
    private String nombre;
    private int sueldo;

    public Empleado(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese los datos del Empleado" + '\n' + "Nombre= " + '\n' + "Sueldo= " );
        System.out.println("Por favor ingrese el nombre del empleado= ");
        nombre= teclado.next();
        System.out.println("Por favor ingrese el sueldo del empleado= ");
        sueldo= teclado.nextInt();
        imprimir();
        impuesto();
    }

    public void imprimir(){

        System.out.println("El Empleado= " + nombre + "Tiene un sueldo de= " + sueldo);
    }

    public void impuesto(){
        if (sueldo > 3000){
            System.out.println("El empleado es un ricachon, debe pagar impuestos");
        }else {
            System.out.println("Mero pobreton, que pesar, no debe pagar impuestos");
        }

    }

    public static void main(String[] args) {
        Empleado em= new Empleado();
        //em.imprimir();
        //em.impuesto();
    }

}
