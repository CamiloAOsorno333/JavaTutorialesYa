import java.util.Scanner;

/**
 Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50.
 */
public class EjeVector1{
    
    private Scanner teclado;
    private int[] elemento;
    private int may36;
    private int may50;
    
    public void inicializar(){
        teclado= new Scanner(System.in);
        elemento= new int[8];
        for(int x=0; x<8; x++){
            System.out.println("Por favor ingrese el elementos No. " + " " + x );
            elemento[x]=teclado.nextInt();
            }
    }
    
    public void calcular(){
        int suma=0;
        for(int x=0; x<8;x++){
            suma= suma + elemento[x];  
        }
        System.out.println("La suma de todos los elementos es " + " " + suma);
        
    }
    
    public void mayores36(){
        may36=0;
        for(int x=0;x<8;x++){
            if(elemento[x]>36){
                may36= may36 + elemento[x];
            }
        }
        System.out.println("La suma de todos los elementos mayores a 36 es " + " " + may36);
    }
    
    public void mayores50(){
        may50=0;
        for(int x=0; x<8;x++){
            if(elemento[x]>50){
                may50++;
            }
        }
        System.out.println("El total de todos los elementos mayores a 36 es " + " " + may50);
    }
    
    public static void main (String[] args){
        EjeVector1 ejercicio= new EjeVector1();
        ejercicio.inicializar();
        ejercicio.calcular();
        ejercicio.mayores36();
        ejercicio.mayores50();
    }
 
    
  
}
