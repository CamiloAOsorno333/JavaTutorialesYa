import java.util.Scanner;

/**
Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.
 */
public class VectorMenor{
     private Scanner teclado;
     private int[] elementos;
     private int n;
     private int menor;
     
     public void cargar(){
         teclado= new Scanner(System.in);
         System.out.println("Por favor ingrese el la cantidad de elementos a analizar");
         n=teclado.nextInt();
         elementos= new int[n];
         for(int x=0;x<elementos.length;x++){
            System.out.println("Por favor ingrese el valor del campo Nro. " + x);
            elementos[x]=teclado.nextInt();
            }
     }
     
     public void menor(){
        menor=elementos[0];
        int men=0;
        for(int x=0; x<elementos.length; x++){
              if (elementos[x]< menor){
                    menor=elementos[x];
                }  
           }
           System.out.println("Elemento menor es= " + menor);
        }
        
     public void repetido(){
        int cant=0;
        for(int x=0; x<elementos.length;x++){
            if(elementos[x]==menor){
                cant++;
            }
          }
          if(cant>1){
                System.out.println("El elemento menor se repite en el vector");
            }else{
                System.out.println("El elemento menor no se en el vector");
            }
        }
        
           
     public static void main(String[] args){
        VectorMenor pv= new VectorMenor();
        pv.cargar();
        pv.menor();
        pv.repetido();
        }
}
