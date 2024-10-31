import java.util.Scanner;

/**
 Confeccionar una clase que permita ingresar tres valores por teclado. 
 Luego mostrar el mayor y el menor.
 */
public class MayorMenor{
    
    //Metodo inicializar
    public void inicializar(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor ingrese el primer valor");
        int v1=teclado.nextInt();
        System.out.println("Por favor ingrese el segundo valor ");
        int v2=teclado.nextInt();
        System.out.println("Por favor ingrese el tercer valor");
        int v3=teclado.nextInt();
        int mayor,menor;
        mayor=calcularMayor(v1,v2,v3);
        menor=calcularMenor(v1,v2,v3);
        System.out.println("El valor mayor de los tres es= " + mayor);
        System.out.println("El valor menor de los tres es= " + menor);
    }
    
    //Metodo mayorMenor
    public int calcularMayor(int v1,int v2, int v3){
        int m;
        if(v1>v2 && v1>v3){
            m=v1;
        }else{
            if(v2>v3){
                m=v2;
            }else{
                m=v3;
            }
        }
        return(m);   
    }
    
    public int calcularMenor(int v1, int v2, int v3){
        int m;
        if(v1<v2 && v1<v3){
            m=v1;
        }else{
            if(v2<v3){
                m=v2;
            }else{
                m=v3;
            }
        }
        return(m);
    }
    
    //Main
    public static void main(String[] args){
        MayorMenor prueba1= new MayorMenor();
        prueba1.inicializar();
    }
    
}
