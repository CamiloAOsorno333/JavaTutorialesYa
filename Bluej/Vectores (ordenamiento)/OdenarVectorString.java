import java.util.Scanner;

/**
 Definir un vector donde almacenar los nombres de 5 paises. Confeccionar el algoritmo de ordenamiento alfabético.
 */
public class OdenarVectorString{
     
    private Scanner teclado;
    private String[] paises;
    
    public void cargar(){
        teclado=new Scanner(System.in);
        paises=new String[5];
        for(int f=0; f<paises.length;f++){
            System.out.println("Por favor ingrese el nombre del país Nro. " + f);
            paises[f]= teclado.next();
        }        
    }
    
    public void ordenar(){
        for(int k=0; k<4;k++){
            for(int f=0; f<4-k;k++){
                if(paises[f].compareTo(paises[f+1])>0){
                    String aux;
                    aux=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=aux;
                    
                }
            }
        }
    }
    
    public void imprimir(){
        System.out.println("El orden de los paises ingresados es= ");
        for(int f=0; f<paises.length;f++){
            System.out.println("País Nro. " + paises[f]);
        }
    }
    
    public static void main(String[] args){
        OdenarVectorString pv=new OdenarVectorString();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
    
}
