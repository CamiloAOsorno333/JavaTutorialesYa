package Lecciones.ColaboracionClases.Club;


/*Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años).
En el constructor pedir la carga del nombre y su antigüedad.
La clase Club debe tener como atributos 3 objetos de
la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.*/


import java.util.Scanner;

public class Club {

    private Socio socio1,socio2,socio3;
    private Scanner teclado;


    public Club(){
        teclado= new Scanner(System.in);
        socio1=new Socio(teclado);
        socio2=new Socio(teclado);
        socio3=new Socio(teclado);
    }

    public void antiguedad(){
        socio1.antiguedad();
        socio2.antiguedad();
        socio1.antiguedad();

    }

    public void masAntiguo(){
       System.out.println("El socio mas antiguio es= ");
        if(socio1.antiguedad()==socio2.antiguedad() && socio1.antiguedad()==socio3.antiguedad() ){
            socio1.imprimir();
        }else{
            if(socio2.antiguedad()==socio1.antiguedad() && socio2.antiguedad()==socio3.antiguedad()){
               socio2.imprimir();
            }else{
                socio3.imprimir();
            }
        }
    }

    public static void main(String[] args){
        Club c= new Club();
        c.antiguedad(); /// en este caso no tiene sentido invocarla ya que el metodo no tiene nada quie imprimir
        c.masAntiguo();
    }
}
