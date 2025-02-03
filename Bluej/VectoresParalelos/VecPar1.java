import java.util.Scanner;

/**
 Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas. Luego de realizar la carga 
 por teclado de todos los datos imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años) 
 */
public class VecPar1{
    private Scanner teclado;
    private String[] nombres;
    private int[] edades;
    
    
    public void inicializar(){
        teclado= new Scanner(System.in);
        nombres= new String[5];
        edades= new int[5];
        for(int x=0; x<nombres.length; x++){
            System.out.println("Por favor ingrese el nombre del sujeto Nro. " + x);
            nombres[x]= teclado.next();
            System.out.println("Por favor ingrese la edad del sujeto Nro. " + x);
            edades[x]=teclado.nextInt();
        }
           
    }
    
    public void imprimir(){
        for(int x=0;x<edades.length;x++){
            if(edades[x]>18){
                System.out.println("El señor(a) " + nombres[x] + " tiene " + edades[x] + " de edad");
            }
        }        
    }
    
    public static void main (String[] args){
        VecPar1 vp= new VecPar1();
        vp.inicializar();
        vp.imprimir();
        
    }
    
}
