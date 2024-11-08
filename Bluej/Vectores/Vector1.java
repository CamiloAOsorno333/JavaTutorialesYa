import java.util.Scanner;

/**
 Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto 
momento los 5 sueldos almacenados en memoria.
 */
public class Vector1{
    
    private Scanner teclado;
    private int[] sueldos;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        sueldos= new int[5];
        for(int f=0; f<5;f++){
            System.out.println("Por favor ingrese el sueldo del Empleado Nro. " + " " + f);
            sueldos[f]=teclado.nextInt();
            }
        }
        
    public void imprimir(){
        for(int f=0;f<5;f++){
            System.out.println("El sueldo del Empledo Nro. "+ " " + f + "  es= " + sueldos[f]);
            }
        }
    
    public static void main(String[] args){
        Vector1 pv= new Vector1();
        pv.cargar();
        pv.imprimir();
        
    }
        
    }
    
    
    
    
    
        
            
            
    
   