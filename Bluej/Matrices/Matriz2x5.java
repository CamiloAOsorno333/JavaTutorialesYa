import java.util.Scanner;

/**
 Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda 
 la primer columna, luego la segunda columna y así sucesivamente)
 */
public class Matriz2x5{
    
    private Scanner teclado;
    private int[][] mat;
    
    
    public void cargar(){
        teclado= new Scanner(System.in);
        mat= new int[2][5];
        System.out.println("Ingrese los componentes");
        for(int c=0; c < 5; c++){
            for(int f=0; f < 2; f++){
                System.out.print("Ingrese componente de la fila " + f + "y la columna " + c + "= ");
                mat [f][c]= teclado.nextInt();
            
            }
        }
    }
    
    
    public void imprimir(){
        for(int f=0; f < 2; f++){
            for(int c=0; c < 5; c++){
                System.out.print(mat[f][c]);
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args){
        Matriz2x5 mv= new Matriz2x5();
        mv.cargar();
        mv.imprimir();
    }
}
