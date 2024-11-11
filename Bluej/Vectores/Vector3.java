import java.util.Scanner;

/**
 Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados
 (4 por la mañana y 4 por la tarde) Confeccionar un programa que permita
 almacenar los sueldos de los empleados agrupados por turno.
Imprimir los gastos en sueldos de cada turno
 */
public class Vector3{
   
    private int[] empMañana;
    private int[] empTarde;
    private Scanner teclado;
    
    public void inicializar(){
        teclado= new Scanner(System.in);
        empMañana= new int[4];
        empTarde= new int[4];
        for(int x=0; x<4; x++){
            System.out.println("Por favor ingresar el sueldo del empleado Nro. " + " " + x + "  de la mañana");
            empMañana[x]=teclado.nextInt();
            System.out.println("Por favor ingresar el sueldo del empleado Nro. " + " " + x + "  de la tarde");
            empTarde[x]=teclado.nextInt();
        }
    }
    
    public void calcular(){
        int sumaMañana=0;
        int sumaTarde=0;
        for(int x=0;x<4;x++){
            sumaMañana=sumaMañana + empMañana[x];
            sumaTarde=sumaTarde + empTarde[x];
        }
        System.out.println("El gasto total de los empleados del turno de la mañana es "+ " " + sumaMañana);
        System.out.println("El gasto total de los empleados del turno de la tarde es " + " " + sumaTarde);
    }
    
    public static void main(String[] args) {
        Vector3 prueba1= new Vector3();
        prueba1.inicializar();
        prueba1.calcular();
    }
}
