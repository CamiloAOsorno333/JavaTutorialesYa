import java.util.Scanner;

/**
 Confeccionar una clase que permita ingresar valores enteros por teclado y 
 nos muestre la tabla de multiplicar de dicho valor. 
 Finalizar el programa al ingresar el -1.
 */
public class MetodosParametros{
    
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }
    
    public void calcular(int v) { 
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }
    
    public static void main(String[] ar) {
        MetodosParametros tabla;
        tabla=new MetodosParametros();
        tabla.cargarValor();
    }
    
}
