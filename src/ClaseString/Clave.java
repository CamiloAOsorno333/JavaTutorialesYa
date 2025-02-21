/*Desarrollar un programa que solicite la carga de una clave. La clase debe tener dos métodos uno para la carga y otro
que muestre si la clave es la correcta (la clave a comparar es "123abc")*/

package ClaseString;

import java.util.Scanner;

public class Clave {

    private Scanner teclado;
    private String clave;

    public Clave(){
        cargar();
        comprobar();

    }


    public void cargar(){
        teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese la clave de acceso al sistema= ");
        clave= teclado.next();
        System.out.println("La clave ingresada fue= " + clave);
    }

    //boolean equals(String s1)

    public void comprobar(){
        if(clave.equals("Benjamin2012*0218")==true){
            System.out.println("Clave correcta, puede ingresar al sistema");
        }else{
            System.out.println("Clave incorrecta, intentelo de nuevo");
        }

    }

    public static void main(String[] ar){
        Clave cl=new Clave();
    }
}
