import java.util.Scanner;


public class Persona{
    //Atributos
    private Scanner teclado;
    private String nombre;
    private int edad;

    //Metodo Iniciarlizar
    public void inicializar(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre");
        nombre= teclado.next();
        System.out.println("Por favor ingres la edad");
        edad=teclado.nextInt();
    }

    //Metodo Imprimir
    public void imprimir(){
        System.out.println(nombre);
        System.out.println(edad);
    }

    //Metodo edad
    public void edadMayor(){
        if(edad >=18){
            System.out.println(nombre +  " " + "Se trata de una persona mayor de edad");
        }else{
            System.out.println(nombre +  " " + "Se trata de una persona menor de edad");
        }
    }

    //Main
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.edadMayor();
    }
}
