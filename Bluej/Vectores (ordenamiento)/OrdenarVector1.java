import java.util.Scanner;

/**
Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
 */
public class OrdenarVector1{
    
    private Scanner teclado;
    private int[] sueldos;
    
    
    public void cargar(){
        teclado= new Scanner(System.in);
        sueldos= new int[5];
        for(int f=0; f<sueldos.length;f++){
            System.out.println("Por favor ingrese el sueldo del empleado Nro. " + f);
            sueldos[f]=teclado.nextInt();
        }
    
    }
    
    public void ordenar(){
       for(int k=0;k<4;k++){
            for(int f=0; f<4-k;f++){
                if(sueldos[f]>sueldos[f+1]){
                    int aux;
                    aux= sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        } 
    }
    
    public void imprimir(){
        System.out.println("Los sueldos ordenados de mayor a menor.");
        for(int f=0; f<sueldos.length;f++){
            System.out.println(sueldos[f]);
        }
    }

    
    public static void main(String[] args){
       OrdenarVector1 pv= new OrdenarVector1();
       pv.cargar();
       pv.ordenar();
       pv.imprimir();
       
    }
}
