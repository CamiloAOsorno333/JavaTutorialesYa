import java.util.Scanner;

/**
 Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar. 
 Luego crear un vector con dicho tamaño.
 */
public class TamVector1{
    
    private int[] sueldos;
    private Scanner teclado;
    
    public void iniciar(){
        teclado=new Scanner(System.in);
        System.out.println("Cuantos sueldos de empleados desea cargar en el presente ejercicio? ");
        int cant= teclado.nextInt();
        sueldos= new int[cant];
        for(int x=0; x<sueldos.length; x++){
            System.out.println("Ingrese el Sueldo del empleado No=  " + x );
            sueldos[x]=teclado.nextInt();
        }
    }
    
    public void imprimir(){
        for(int x=0; x<sueldos.length;x++){
            System.out.println("El sueldo del empleado " + x + " es =  " + sueldos[x]);
        }
    }
    
    public static void main(String[] args){
        TamVector1 pv= new TamVector1();
        pv.iniciar();
        pv.imprimir();
    }
    
    
    
}
