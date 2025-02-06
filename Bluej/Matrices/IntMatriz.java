import java.util.Scanner;

/* Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila
con la segunda. Imprimir luego la matriz. */

public class IntMatriz{
    private Scanner teclado;
    private int[][] mat;

    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz");
        int fil= teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        int col= teclado.nextInt();
        mat= new int[fil][col];
        for (int f=0; f < fil; f++){
            for (int c=0; c < col; c++){
                System.out.print("Ingrese los componentes  de la fila Nro. " + f + " columna Nro. " + c + "= " );
                mat [f][c]= teclado.nextInt();
            }
        }
    }

    public void intercambiar(){
        
            for (int c=0; c < mat[0].length; c++){
                 int f1=mat[0][c];
                 mat[0][c]= mat[1][c];
                 mat[1][c]=f1;
                  
        }
    }

    public void imprimir(){
        for (int f=0;f< mat.length;f++){
            for(int c=0; c < mat[f].length;c++ ){
                System.out.print( mat[f][c] + "  | " );
            }
            System.out.println();   
        }        

    }

    public static void main(String[] args){
        IntMatriz im= new IntMatriz();
        im.cargar();
        im.imprimir();
        im.intercambiar();
        im.imprimir();        
    }


}