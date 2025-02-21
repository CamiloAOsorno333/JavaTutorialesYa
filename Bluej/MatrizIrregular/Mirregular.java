import java.util.Scanner;

/**
 Confeccionaremos un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa.
 */
public class Mirregular{
   
    private int[][] mat;
    private Scanner teclado;
    
    
    
    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de filas que tendrá la matriz");
        int fs=teclado.nextInt();
        mat=new int [fs][];
        for(int f=0; f < mat.length;f++ ){
            System.out.println("Ingrese los componentes de la fila Nro. " + f);
            System.out.println("Por favor ingrese la cantidad de columnas= ");
            int cs=teclado.nextInt();
            mat[f]=new int[cs];
            for(int c=0; c < mat[f].length;c++){
               System.out.println("Por favor ingrese los componentes de la matriz fila Nro. " + f + " columna= " + c ); 
               mat[f][c]=teclado.nextInt();
            }
        
        }
    }
    
    public void imprimir(){
        for(int f=0; f < mat.length;f++){
            for(int c=0; c < mat[f].length;c++){
               System.out.println("Fila Nro. " + mat[f][c]); 
            }
        System.out.println();    
        }
    }
    
    public static void main(){
    
        Mirregular mi= new Mirregular();
        mi.cargar();
        mi.imprimir();
    }
}
