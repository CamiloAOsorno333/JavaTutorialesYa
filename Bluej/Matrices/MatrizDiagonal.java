import java.util.Scanner;

/**
 Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.
 */
public class MatrizDiagonal{
    
    private Scanner teclado;
    private int[] [] matriz;
    
    public void cargar(){
        
        teclado= new Scanner(System.in);
        matriz= new int [4][4];
        for (int f=0; f < 4;f++){
            for(int c=0; c < 4; c++){
                System.out.println("Ingrese los valores de la fila Nro. " + f + "= ");
                matriz[f][c]= teclado.nextInt();
            }
        }
    }
    
    public void imprimir(){
    
        for(int k=0; k < 4; k++){
            System.out.println(matriz [k][k] + " "); 
        }
    }
    
    
    public void imprimirII(){           ///Esta es otra forma de imprimir la diagonal
    
        for(int f=0; f < 4; f++){
            for(int c=0; c < 4; c++){
                if (f==c){
                System.out.println(matriz [f][c] + " "); 
            }
        }
      }
    }
    
    public static void main(String[] args){
        MatrizDiagonal md= new MatrizDiagonal();
        md.cargar();
        md.imprimir();
        md.imprimirII();
    }
}
