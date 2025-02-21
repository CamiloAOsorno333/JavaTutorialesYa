/*Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.*/

import java.util.Scanner;

public class Operarios{

    private Scanner teclado;
    private int[] sueldos;
    private String[] nombres;

    public Operarios(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Operarios a analizar= ");
        int ops= teclado.nextInt();
        sueldos=new int[ops];
        nombres=new String[ops];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Por favor ingrese el nombre del Operario Nro. " +  i + " =");
            nombres[i]=teclado.next();
            System.out.println("Por favor ingrese el sueldo del Operario Nro. " + i + " =");
            sueldos[i]=teclado.nextInt();
        }
    }

    public void imprimir(){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El operario= " + nombres[i] + " tiene un sueldo de= " + sueldos[i] );
        }
    }

    public static void main(String[] args) {
        Operarios op= new Operarios();
        op.imprimir();
    }
}