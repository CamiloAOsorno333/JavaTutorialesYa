/*Plantear una clase TablaMultiplicar. Definir dos constructores uno con un parámetro que llegue un entero indicando
que tabla queremos ver y otro con dos enteros que indique el primero que tabla queremos ver y el segundo parámetro
indica cuantos términos mostrar.
Si no llega la cantidad de términos a mostrar inicializar en 10 los términos a mostrar*/

import java.util.Scanner;

public class TablaMultiplicar{

    private Scanner teclado;
    private int tabla;
    private int cterminos;




    public TablaMultiplicar(int tabla){
        tabla=tabla;
    }

    public TablaMultiplicar(int tabla, int cterminos){
        tabla=tabla;
        cterminos=cterminos;
    }

    public void imprimir(){
        for(int f=0; f < cterminos; f++){
            System.out.println(tabla * f);
        }

    }

    public static void main(String[] ar){
        TablaMultiplicar tm1= new TablaMultiplicar(8);
        tm1.imprimir();
        TablaMultiplicar tm2= new TablaMultiplicar(8,10);
        tm2.imprimir();

    }
}