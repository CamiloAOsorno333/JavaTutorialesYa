import java.util.Scanner;

/*Desarrollar una clase que represente un punto en el plano y tenga los siguientes 
 * métodos: cargar los valores de x e y, imprimir en que cuadrante se encuentra dicho 
 * punto (concepto matemático, primer cuadrante si x e y 
 * son positivas, si x<0 e y>0  * segundo cuadrante, etc.)*/

public class PlanoCarteciano{
    private Scanner teclado;
    private int x,y;
    
    //Metodo inicializar
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de X = ");
        x=teclado.nextInt();
        System.out.println("Por favor ingrese el valor de y = ");
        y= teclado.nextInt();
    }
    
    public void cuadrante(){
        if(x>= 0 && y>=0){
            System.out.println("Es el primer cuadrante");
        }else{
            if(x<= 0 && y>=0){
                System.out.println("Es el segundo cuadrante");
            }if(x<=0 && y<=0){
                System.out.println("Es el tercer cuadrante");
            }else{
                System.out.println("Es el cuarto cuadrante");
            }
        }
    }
    
    public static void main(String[] args){
        PlanoCarteciano plano1=new PlanoCarteciano();
        plano1.inicializar();
        plano1.cuadrante();
    }
    
    
    
}
