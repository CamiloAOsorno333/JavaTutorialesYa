import java.util.Scanner;

/**
 Desarrollar un programa que permita ingresar un vector de n elementos, 
 ingresar n por teclado. Luego imprimir la suma de todos sus elementos
 */
public class TamVector2{
   
    private int[] elementos;
    private Scanner teclado;
    
    
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.println("Por ingrese la cantidad de elementos que desea calcular= ");
        int cantidad=teclado.nextInt();
        elementos=new int[cantidad];
        for(int x=0;x<elementos.length;x++){
            System.out.println("Por favor ingrese el valor del elemento No. " + " " + x );
            elementos[x]=teclado.nextInt();
        }
    
    }
    
    public void suma(){
        int suma=0;
        for(int x=0;x<elementos.length; x++){
            suma=suma + elementos[x];
        }
         System.out.println("La suma de todos los elementos es= " + suma);
    }
    
    /*public void imprimir(){
        System.out.println("La suma de todos los elementos es= " + suma);
    }*/
    
    public static void main(String[] args){
        TamVector2 pv= new TamVector2();
        pv.inicializar();
        pv.suma();
    }
}
