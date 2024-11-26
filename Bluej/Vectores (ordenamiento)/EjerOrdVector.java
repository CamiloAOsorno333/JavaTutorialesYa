import java.util.Scanner;

/**
 Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.
 */
public class EjerOrdVector{
    
    private Scanner teclado;
    private int[] elementos;
    private int n;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de elementos que pretende organizar"); 
        n=teclado.nextInt();
        elementos=new int[n];
        for(int f=0; f<elementos.length;f++){
            System.out.println("Por favor ingrese el elemento o valor Nro. " + f);
            elementos[f]=teclado.nextInt();
        }
    }

    public void ordenarMayorMenor(){
        //int l=n -1
        for(int k=0;k<elementos.length; k++){
            for(int f=0;f<elementos.length-1-k;f++){
                if(elementos[f]<elementos[f+1]){
                int aux;
                aux=elementos[f];
                elementos[f]=elementos[f+1];
                elementos[f+1]=aux;
            }
            }
        }  
    }
    
    public void ordenarMenorMayor(){
        //int l=n -1
        for(int k=0;k<elementos.length; k++){
            for(int g=0;g<elementos.length-1-k;g++){
                if(elementos[g]>elementos[g+1]){
                int aux;
                aux=elementos[g];
                elementos[g]=elementos[g+1];
                elementos[g+1]=aux;
            }
            }
        }  
    }
    
    public void imprimirMayorMenor(){
        System.out.println("Los elementos ordenados de mayor a menor son= ");
        for(int f=0; f<elementos.length;f++){
            System.out.println(elementos[f]);
        }
    }

    public void imprimirMenorMayor(){
        System.out.println("Los elementos ordenados de menor a mayor son= ");
        for(int g=0; g<elementos.length;g++){
            System.out.println(elementos[g]);
        }
    }
    
    public static void main(String[] args){
        EjerOrdVector pv= new EjerOrdVector();
        pv.cargar();
        pv.ordenarMayorMenor();
        pv.ordenarMenorMayor();
        // pv.imprimirMayorMenor();
        pv.imprimirMenorMayor();
    }
}

