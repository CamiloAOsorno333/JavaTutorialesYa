import java.util.Scanner;

/**
 Confeccionar un programa que permita cargar los nombres de 5 operarios y sus sueldos respectivos. Mostrar el sueldo mayor 
 y el nombre del operario.
 */
public class VectMyM1{
     
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;
    
    public void inicializar(){
        teclado= new Scanner(System.in);
        nombres= new String[5];
        sueldos=new float[5]; 
        for(int x=0; x<nombres.length; x++){
            System.out.println("Por favor ingrese el nombre del operario Nro. " + x);
            nombres[x]=teclado.next();
            System.out.println("Por favor ingrese el sueldo del operario Nro. " + x);
            sueldos[x]=teclado.nextFloat();
        }   
    }
    
    
    public void mayor(){
        float mayor= sueldos[0];
        int pos=0;
        for(int f=1;f<nombres.length;f++){
            if(sueldos[f]>mayor){
                mayor=sueldos[f];
                pos=f;
            }
        }
        System.out.println("El operario con mayor sueldo es " + nombres[pos]);
        System.out.println("Tiene un sueldo: " + mayor );
        
    }
    
    
    public static void main(String[] args){
        VectMyM1 pv= new VectMyM1();
        pv.inicializar();
        pv.mayor();
    }
}
