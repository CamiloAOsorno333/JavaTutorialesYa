import java.util.Scanner;

/**
 Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.
 */
public class MatCantFyC{
    
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese lacantidad de columnas de su matriz= ");
        int columnas= teclado.nextInt();
        System.out.println("Ingrese la cantidad de filas de su matriz= ");
        int filas= teclado.nextInt();
        mat= new int[filas][columnas];
        for(int f=0; f < filas; f++){
            for(int c=0; c < columnas; c++){
                System.out.println("Ingrese el componente de la matriz fila Nro. " + f + " columna Nro. " + c);
                mat[f][c]= teclado.nextInt();
            }
        }
        
    }
   
    
    public void imprimir(){
        System.out.println("La matriz= ");
        for(int f=0; f< mat.length;f++){
            for(int c=0; c< mat[f].length; c++){
                System.out.print(mat[f][c] + "|");
                
            }
            System.out.println();
        }
    }
    
    public void impUltima(){
        System.out.println("La última fila de la matriz= ");
        for(int f=0; f < mat.length; f++){
            for(int c=0; c < mat.length -1;c++){
                System.out.print(mat [mat.length -1][c]  );
            }
            
        }
    }
    
    public static void main(String[] args){
        MatCantFyC mfc= new MatCantFyC();
        mfc.cargar();
        mfc.imprimir();
        mfc.impUltima();
        
    }
}
