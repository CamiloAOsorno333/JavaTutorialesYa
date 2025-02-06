import java.util.Scanner;

/**
 Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se encuentran en los vértices 
 de la misma (mat[0][0] etc.)
 */
public class MatV{
    
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas= ");
        int fs=teclado.nextInt();
        System.out.print("Ingrese la cantidad de columnas= ");
        int cs=teclado.nextInt();
        mat= new int[fs][cs];
        for(int f=0; f < fs;f++){
            for(int c=0; c < cs;c++){
                System.out.println("Ingrese los componentes de la matriz");
                mat[f][c]= teclado.nextInt();
            }
        }
    }
    
    public void imprimirV(){
        for(int f=0; f< mat.length;f++){
            for(int c=0; c < mat[f].length;c++){
            }     
                    
            
        }
        
        System.out.println("Vertice Nro.1= " + mat[0][0] );
        System.out.println("Vertice Nro.2= " + mat[0][mat.length-1] );
        System.out.println("Vertice Nro.3= " + mat[mat.length - 1][0] );
        System.out.println("Vertice Nro.4= " + mat[mat.length - 1][mat.length-1] );
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
        MatV mv= new MatV();
        mv.cargar();
        mv.imprimir();
        mv.imprimirV();
    }
}
