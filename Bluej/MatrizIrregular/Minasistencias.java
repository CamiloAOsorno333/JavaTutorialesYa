import java.util.Scanner;

/**
 Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han 
faltado cada empleado (cargar el número de día que faltó)
Cada fila de la matriz representan los días de cada empleado.
Mostrar los empleados con la cantidad de inasistencias.
Cuál empleado faltó menos días.
 */
public class Minasistencias{
    
    private Scanner teclado;
    private String[] empleado;
    private int[][] faltas;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        empleado=new String[3];
        faltas=new int[3][];
        for(int f=0; f < empleado.length; f++){
            System.out.println("Ingrese el nombre del empleado");
            empleado[f]= teclado.next();
            System.out.println("Por favor ingrese la cantidad de días que ha faltado");
            int fs=teclado.nextInt();
            faltas[f]= new int[fs];
            for(int c=0; c < faltas[f].length;c++){
                System.out.println("Por favor ingrese los componentes de la Fila Nro.  " + "-" + f + " -" + c + " =");
                faltas[f][c]=teclado.nextInt();
            }
        }
   
    }
    
    
    
    public void imprimir(){
        for(int f=0; f < empleado.length;f++){
            System.out.println("Empleado= " + empleado[f] + " faltó " +faltas[f].length + " días");
            
        }
         
    }
    
    
    public void MenosFaltas(){
        int dias=faltas[0].length;
        String nombre=empleado[0];
        for(int f=0;f < faltas.length;f++){
             if(faltas[f].length < dias){
                dias=faltas[f].length;
                nombre=empleado[f];
                }
            }
            System.out.println("Empleado con menos faltas= " + nombre + "  con " + dias + " faltas.");
        }
    
    public static void main(String[] ar){
        Minasistencias mi= new Minasistencias();
        mi.cargar();
        mi.imprimir();
        mi.MenosFaltas();
        
    
    }
    
}
