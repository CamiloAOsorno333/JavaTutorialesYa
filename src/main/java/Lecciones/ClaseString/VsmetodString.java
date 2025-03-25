/*Cargar un String por teclado e implementar los siguientes métodos:
a) Imprimir la primera mitad de los caracteres de la cadena.
b) Imprimir el último caracter.
c) Imprimirlo en forma inversa.
d) Imprimir cada caracter del String separado con un guión.
e) Imprimir la cantidad de vocales almacenadas.
f) Implementar un metodo que verifique si la cadena se lee igual de izquierda a derecha tanto como de derecha a
 izquierda (ej. neuquen se lee igual en las dos direcciones)*/

package ClaseString;

import java.util.Scanner;

public class VsmetodString {

    private Scanner teclado;
    private String palabra;
    private char inv;

    public VsmetodString(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese la palabra con la que vamos a jugar 😁= ");
        palabra=teclado.next();
        System.out.println(palabra + " " + "Es la palabra con la que vamos a jugar ");
        mitad();
        ultimo();
        invertir();
        separado();
        vocales();
        ambos();
    }

    //Imprimir la primera mitad de los caracteres de la cadena.
    //String substring(int pos1,int pos2)

    public void mitad(){
        String nword=palabra.substring(0,palabra.length()/2);
        System.out.println(nword + " " + "Es la palabra que resulta de aplicar el metodo Substring");
    }

    //Imprimir el último caracter.
    //int compareTo(String s1)

    public void ultimo(){
        char uchat=palabra.charAt(palabra.length()-1);
        System.out.println(uchat + " " + "Es el último caracter de la palabra  " + palabra);
    }

    //Imprimirlo en forma inversa.

    public void invertir(){
        //char inv;
        for(int f=palabra.length()-1; f >=0;f--) {
            System.out.print(palabra.charAt(f));
        }
        System.out.println();
    }

    //Imprimir cada caracter del String separado con un guión.

    public void separado(){
        for(int f=0;f < palabra.length(); f++){
            System.out.print(palabra.charAt(f) + " - ");
        }
        System.out.println();
    }

    //Imprimir la cantidad de vocales almacenadas.

    public void vocales(){
        char aux;
        int vocal=0;
        for (int f=0;f<palabra.length();f++){
           aux=palabra.charAt(f);
           if(aux=='a' || aux=='e' || aux=='i' || aux=='o' || aux=='u' ){
                vocal=vocal + 1;
           }

        }
        System.out.println(palabra + " tiene " + vocal + " vocales");
    }

    /*Implementar un metodo que verifique si la cadena se lee igual de izquierda a derecha tanto como de derecha a
     izquierda (ej. neuquen se lee igual en las dos direcciones) /// String substring(int pos1,int pos2)*/

    public void ambos(){
        int cant=0;
        for(int f=0; f< palabra.length()/2;f++){
            if(palabra.charAt(f)==palabra.charAt(palabra.length()-1-f)){
                cant++;
            }
        }
        if(cant== palabra.length()/2){
            System.out.println("Es capicúa  la cadena " + palabra);
        }else {
            System.out.println("Es capicúa  la cadena " + palabra);
        }


    }



    public static void main(String[] ar){
        VsmetodString vm= new VsmetodString();
    }

}
