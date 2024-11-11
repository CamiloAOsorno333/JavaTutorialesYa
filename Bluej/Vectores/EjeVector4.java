import java.util.Scanner;

/**
 Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.
 */
public class EjeVector4{
    
    private int[] vector;
    private Scanner teclado;
    
    public void carga(){
        vector= new int[10];
        teclado= new Scanner(System.in);
        for(int x=0; x<10; x++){
            System.out.println("Por favor ingrese el No. " + " " + x + "para realizar el calculo");
            vector[x]= teclado.nextInt();
        }
        
    }
    
    public void calculo(){
        int orden=1;
        for(int x=0; x<9; x++){
            if(vector[x+1]<vector[x]){
               orden=0;     
               break;
            }
        }
        
        if(orden==1){
            System.out.println("Esta ordenado de menor a mayor");
        }else{
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
    
    public static void main(String[] args){
        EjeVector4 pv=new EjeVector4();
        pv.carga();
        pv.calculo();
    }
}
