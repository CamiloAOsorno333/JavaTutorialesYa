import java.util.Scanner;

/**
Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. Obtener la suma de los dos vectores, 
dicho resultado guardarlo en un tercer vector del mismo tamaño. Sumar componente a componente.
 */
public class EjeVector2{
    
    private Scanner teclado;
    private int[] v1;
    private int[] v2;
    private int[] vsuma;
    
    public void v1(){
        teclado= new Scanner(System.in);
        v1=new int[4];
        System.out.println("Carga del primer Vector");
        for(int x=0; x<4;x++){
            System.out.println("Ingrese el valor No. " + " " + x + " del vector No. 1");
            v1[x]=teclado.nextInt();  
            /*System.out.println("Ingrese el valor No. " + " " + x + "del vector No. 2");
            v1[x]=teclado.nextInt();  */   
        }
    }
    
    public void v2(){
        teclado=new Scanner(System.in);
        v2= new int[4];
        System.out.println("Carga del segundo Vector");
        for(int x=0; x<4;x++){
            System.out.println("Ingrese el valor No. " + " " + x + " del vector No. 2");
            v2[x]=teclado.nextInt();
        }      
    }
    
    public void suma(){
        vsuma= new int[4];
        for(int x=0; x<4;x++){
            vsuma[x]= v1[x] + v2[x];
        }
        System.out.println("La suma del vector resultante");
        for(int x=0; x<4;x++){
            System.out.println(vsuma[x]);
        }
            
    }
    

    public static void main(String[] args){
        EjeVector2 vec2= new EjeVector2();
        vec2.v1();
        vec2.v2();
        vec2.suma();
    }
}
