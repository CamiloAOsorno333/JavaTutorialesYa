import java.util.Scanner;

/**
 Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
 */
public class EjeVector3{
     
    private int[] v1;
    private int[] v2;
    private int[] suma;
    private int sumaV1;
    private int sumaV2;
    private int sumaTotal;
    private int[] calculo;
    private Scanner teclado;
    
    
    public void cursoA(){
        System.out.println("Por favor ingrese las notas del grupo A");
        teclado= new Scanner(System.in);
        v1=new int[5];
        sumaV1=0;
        for(int x=0; x<5; x++){
            System.out.println("Por favor ingrese la nota del primer parcial del  alumno No. " + " " + x);
            v1[x]=teclado.nextInt();
            sumaV1= sumaV1 + v1[x];
             
        }
       
    }
    
    public void cursoB(){
        System.out.println("Por favor ingrese las notas del grupo A");
        teclado= new Scanner(System.in);
        v2=new int[5];
        for(int x=0; x<5; x++){
            System.out.println("Por favor ingrese la nota del primer parcial del  alumno No. " + " " + x);
            v2[x]=teclado.nextInt();
            sumaV2=sumaV2 + v2[x];
             
        }
       
    }
    
    public void calculo(){
        sumaV1=0;
        sumaV2=0;
        int promedioV1=0;
        int promedioV2=0;
        for(int x=0; x<5;x++){
            sumaV1= sumaV1 + v1[x];
            sumaV2= sumaV2 + v2[x];
        } 
        promedioV1=sumaV1 / 5;
        promedioV2=sumaV2 / 5;
        
        if(promedioV1 > promedioV2){
            System.out.println("El promedio mayor lo tiene la clase A " + " " + promedioV1 );
        }else{
            if(promedioV2 > promedioV1){
            System.out.println("El promedio mayor lo tiene la clase B " + " " + promedioV2 );
            }else{
                System.out.println("Los dos grupos tienen el mismo promedio");
            }
        }
        
    }
    
    public static void main(String[] args){
        EjeVector3 pv=new EjeVector3();
        pv.cursoA();
        pv.cursoB();
        pv.calculo();
    }
}
