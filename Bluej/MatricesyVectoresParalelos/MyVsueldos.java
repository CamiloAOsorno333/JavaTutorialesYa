import java.util.Scanner;

/*Se tiene la siguiente información:
· Nombres de 4 empleados.
· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
Confeccionar el programa para:

a) Realizar la carga de la información mencionada.
b) Generar un vector que contenga el ingreso acumulado en sueldos en los últimos 3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los últimos 3 meses
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado */

public class MyVsueldos{

    private Scanner teclado;
    private String[] empleado;
    private int[][] sueldo;
    private int[] stotal;

    private void cargar(){
        teclado= new Scanner(System.in);
        empleado= new String[4];
        sueldo= new int[4][3];
        for (int f=0; f < empleado.length; f++) {
            System.out.println("Ingrese el nombre del empleado ");
            empleado[f] = teclado.next();

            for (int c = 0;  c < sueldo[f].length; c++) {
                System.out.println("Empleado= " + empleado[f] + " fila No. " + c + "-" + " columna No. " + c + " =");
                sueldo[f][c]= teclado.nextInt();
            }
        }
    }

    private void totalSueldos(){
        stotal= new int[4];
        for (int f=0;f < sueldo.length;f++){
            int suma=0;
            for (int c=0;c < sueldo[f].length;c++){
               suma= suma + sueldo[f][c];
            }
            stotal[f]=suma;
        }
    }

    public void impTpagado(){
        System.out.println("Los sueldos pagados por empleado.");
        for (int f=0; f < stotal.length; f++ ){
            System.out.println(empleado[f] + "= " + stotal[f]);
        }
    }

    public void empMacumulado(){
        System.out.println("El acumulado de sueldos por empleado es= ");
        for(int e=0; e < empleado.length;e++){
            System.out.println(empleado[e]);
           
            for(int s=0; s < sueldo[s].length;s++){
                 int sum=0;
                for (int c=0; c < sueldo.length;c++) {
                    sum = sum + sueldo[s][c];
                }
                System.out.println("Empleado= " + empleado + "Sueldo= " + stotal);
            }

        }
    }

    public void sueldoM(){
        int smayor=stotal[0];
        String nom=empleado[0];
        for(int f=0; f < sueldo.length; f++){
            for (int c=0; c < sueldo[f].length; c++){
                if(stotal[f] > smayor){
                    smayor= stotal[f];
                    nom=empleado[f];
                }
            }
        }System.out.println("El empleado con mayor sueldo es= "+ nom + "con un sueldo= " + smayor);


    }

    public static void main(String[] args){
        MyVsueldos mv= new MyVsueldos();
        mv.cargar();
        mv.totalSueldos();
        mv.impTpagado();
        mv.sueldoM();

    }

}