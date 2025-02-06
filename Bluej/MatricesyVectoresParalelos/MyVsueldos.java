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
            empleado[e] = teclado.next();

            for (int c = 0;  c < sueldo.length; c++) {
                System.out.println("Empleado= " + f + " fila No. " + c + "-" + " columna No. " + c + " =");
                sueldo[f][c]= teclado.nextInt();
            }
        }
    }

    private void totalSueldos(){
        stotal= new int[4]
        for (int f=0;f < sueldo.length;f++){
            int suma=0;
            for (int c=0;c < sueldo[f].length;c++){
               suma= suma + stotal[f][c];
            }
        }
    }

    public void impTpagado(){
        System.out.println("Los sueldos pagados por empleado.");
        for (int f=0; f < sueldo.length; f++ ){
            System.out.println(empleado[f] + "= " + sueldo[f]);
        }
    }

    public void empMacumulado(){
        

    }


}