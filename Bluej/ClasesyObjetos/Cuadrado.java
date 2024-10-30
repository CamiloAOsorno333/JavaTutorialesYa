import java.util.Scanner;

/*Desarrollar una clase que represente un Cuadrado y tenga los siguientes métodos: 
 *cargar el valor de su lado, imprimir su perímetro y su superficie.*/
 
public class Cuadrado{
    private Scanner teclado;
    private int lado1, lado2, lado3, lado4, perimetro, superficie;
    
    //Metodo Inicializar
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese el valor del lado 1= ");
        lado1=teclado.nextInt();
        System.out.println("Por favor ingrese el valor del lado 2= ");
        lado2=teclado.nextInt();
        System.out.println("Por favor ingrese el valor del lado 3= ");
        lado3=teclado.nextInt();
        System.out.println("Por favor ingrese el valor del lado 4= ");
        lado4=teclado.nextInt();
        if(lado1 != lado2 && lado2!=lado3 && lado3!=lado4){
            System.out.println("No se trata de un cuadrado");
        }
    }
    
    //Metodo perimetro
    public void perimetro(){
        do{
            if(lado1==lado2 && lado2==lado3 && lado3==lado4){
            perimetro= lado1 + lado2 + lado3 + lado4;
            System.out.println("El perimetro del cuadrado es= " + perimetro);
            }
        }
        while(lado1!=lado2 || lado2!=lado3 || lado3!=lado4);
    }
    
    
    //Metodo superficie
    public void superficie(){
        if(lado1==lado2 && lado2==lado3 && lado3==lado4){
        superficie= lado1 * lado2;
        System.out.println("La superficie del cuadrado es= " + superficie);
        }
    }
    
    //Metodo main
    public static void main (String[] args){
        Cuadrado cuadrado1= new Cuadrado();
        cuadrado1.inicializar();
        cuadrado1.perimetro();
        cuadrado1.superficie();
        
        
    }
    
}
