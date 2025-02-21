import java.util.Scanner;

/**
 Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila 
 y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador)
Realizar la carga por teclado e imprimir posteriormente.
 */
public class Mascendente
{
    private Scanner teclado;
    private int[][] mat;
	
	
	public void cargar(){
		teclado= new Scanner(System.in);
		/*System.out.println("Ingrese la cantidad de filas");
		int fs=teclado.nextInt();*/
		mat= new int[5][];
		for(int f=0; f < mat.length;f++){
			mat[f]= new int[f +1];
			for(int c=0; c < mat[f].length;c++){
				System.out.println("Por favor ingrese los componentes de la Fila Nro. " + "- " + f + " - " + "Columna Nro.  " + " - " + c + " =");
				mat[f][c]= teclado.nextInt();
			}
		}
		
	}
	
	public void imprimir(){
		System.out.println("La matriz tiene los siguientes componentes= ");
		for(int f=0; f < mat.length; f++){
			for(int c=0; c < mat[f].length;c++){
				System.out.print(mat[f][c] + " / " );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ar){
		Mascendente ma= new Mascendente();
		ma.cargar();
		ma.imprimir();
	}
}
