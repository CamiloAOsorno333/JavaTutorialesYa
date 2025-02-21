/*Confeccionar una clase que solicite el ingreso de dos String y luego emplee los métodos más comunes de la
clase String.*/

package ClaseString;

import java.util.Scanner;

public class MetStringAccion{



    public static void main(String[] ar){

        Scanner teclado;
        String s1,s2;

        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese las palabras para poderlas comparar ");
        System.out.println("Ingrese la primera palabra= ");
        s1=teclado.nextLine();
        System.out.println("Ingrese la segunda palabra= ");
        s2=teclado.nextLine();
        if (s1.equals(s2)== true){
            System.out.println( s1 + " Es exactamente igual que la palabra 2   " + s2);
        }else {
            System.out.println(s1 + "No es exactamente igual a la palabra 2 " + s2);
        }
        if (s1.equalsIgnoreCase(s2)== true){
            System.out.println(s1 + " es igual a la palabra 2 " + s2 + " sin tener en cuenta mayuculas y minusculas");
        }else {
            System.out.println(s1 +"No es exactamente igual a la palabra 2 " + s2);
        }
        if (s1.compareTo(s2)==0){
            System.out.println(s1 +" contiene los mismos caracteres de " + s2);
        }else{
            if(s1.compareTo(s2)>0) {
                System.out.println(s1 + " es mayor alfabeticamente que " + s2);
            }else{
                System.out.println(s2 + " es mayor alfabeticamente que  " + s1);
            }
        }

        char caracter1s1=s1.charAt(0);
        System.out.println("El primer caracter de " + s1 + " es " + caracter1s1);

        int c1s1= s1.length();
        System.out.println(s1 + "tiene " + c1s1 + "letras");

        String primeraP=s1.substring(2,5);
        System.out.println("La palabra que surge aplicar el subString a " + s1 + "  es= " + primeraP);

        int index=s1.indexOf(s2);
        if (index==1){
            System.out.println(s2 + " no esta contenido en " + s1);
        }else{
            System.out.println(s2 + " esta contenido en " + s1);
        }

        System.out.println(s1 + " convertido en mayusculas " + s1.toUpperCase());
        System.out.println(s1 + " convertido en minusculas " + s1.toLowerCase());
    }
}
