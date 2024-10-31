import java.util.Scanner;
 
public class TablaM{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in); 
        
        System.out.println("Por favor ingrese el número");
        int x =teclado.nextInt();
        int resultado;
        //int num;
        for ( int i = 0 ; i <= 11 ; i++){
            resultado=x*i;
            System.out.println(x + "X" + i + "= " + resultado);
        }
    
    }
}
