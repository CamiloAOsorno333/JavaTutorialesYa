import java.util.Scanner;

/**
 Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena.
 */
public class MayorElemento{
    
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de columnas de la matriz= ");
        int fil=teclado.nextInt();
        System.out.println("Ingrese la cantidad de filas de la matriz= ");
        int col=teclado.nextInt();
        mat= new int[fil][col];
        for(int c=0; c < col; c++){
            for(int f=0; f < fil; f++){
                System.out.print("Ingrese los componentes de la matriz, fila Nro. " + f + "=" + " columna Nro.  " + c + "=");
                mat[f][c]= teclado.nextInt();
            }
        }
    }
    
    public void imprimirMayor(){
        int mayor=mat[0][0];
        int fmay=0;
        int cmay=0;        
        for(int f=0; f< mat.length;f++){
            for(int c=0; c < mat[f].length;c++){
                if(mat[f][c] > mayor){
                    mayor=mat[f][c];
                    fmay=f;
                    cmay=c;
                }
            }
        }
        
        System.out.println("El elemento mayor en la matriz es= " + mayor );
        System.out.println("El elemento mayor esta ubicado en la columna= " + cmay + "en la fila= " + fmay);
    }
    
    public void imprimir(){
        for(int f=0; f < mat.length;f++){
            for(int c=0; c < mat[f].length;c++){
                System.out.print(mat [f][c] + "|");
            }
            System.out.println();
        }
        
    }
    
    
    public static void main(){
        MayorElemento me= new MayorElemento();
        me.cargar();
        me.imprimirMayor();
        me.imprimir();
    }
}
