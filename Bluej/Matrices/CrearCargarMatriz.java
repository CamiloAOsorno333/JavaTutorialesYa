import java.util.Scanner;

/**
 Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila. Imprimir la última fila 
 e imprimir la primer columna.
 */
public class CrearCargarMatriz{
   
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
    
        teclado= new Scanner(System.in);
        mat= new int [3][4];
        for(int f=0; f < 3; f++){
            for(int c=0; c < 4; c++){
                System.out.println("Ingrese el valor del componente= ");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimirPfila(){
        System.out.println("La primera fila de la matriz es= ");
        for(int c=0; c < 4; c++){
             System.out.print( mat[0][c]);
             
        }
    
    }
    
    public void imprimirUfila(){
        System.out.println("La última fila de la matriz es= ");
        for(int c=0; c <4; c++){
            System.out.print(mat [2][c]);
        }
    } 
    
    public void imprimirPcolumna(){
        System.out.println("La primera columna de la matriz es= ");
            for(int f=0; f <3; f++){
                System.out.println(mat [f][0]);
                
            }
    }
    
    public static void main(String[] args){
        CrearCargarMatriz mv= new CrearCargarMatriz();
        mv.cargar();
        mv.imprimirPfila();
            System.out.println();
        mv.imprimirUfila();
            System.out.println();
        mv.imprimirPcolumna();
        
    }
    
}
