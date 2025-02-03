import java.util.Scanner;

/**
 Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes y luego imprimirlas.
 */
public class CrearMatriz{
    
   private Scanner teclado;
   private int[] [] matriz;
   
   public void cargar(){
       teclado= new Scanner(System.in);
       matriz= new int [3] [5];
       for (int l=0; l < 3; l++){
            for (int c=0; c < 5; c++){
                System.out.println("Por favor ingresa los valores de la matriz"); 
                matriz [l] [c]= teclado.nextInt();
            }
        }
    }
    
   public void imprimir(){
   
       for(int l=0; l < 3; l++){
            for (int c=0; c < 5; c++){
                System.out.print(matriz [l] [c] + " ");
            }
            System.out.println();
        }
    } 
    
   public static void main (String[] arg){
        CrearMatriz mat= new CrearMatriz();
        mat.cargar();
        mat.imprimir();
    
    }
}
