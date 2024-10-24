package EjercicioDoWhile;
import java.util.Scanner;


public class CadenaCaracteres{
    
    public static void main(String[] args){
        
        /*Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.*/
            Scanner teclado= new Scanner(System.in);
            
            int p1,p2;
            String nom1,nom2;
            System.out.println("Por favor indique el nombre y la edad ");   
            System.out.println("Nombre Persona 1= ");
            nom1=teclado.next();
            System.out.println("Edad Persona 1= ");
            p1= teclado.nextInt();
            System.out.println("El nombre y la edad de la persona 1 es = " + nom1 + " " + p1 + '\n');
            System.out.println("Nombre Persona 2= ");
            nom2=teclado.next();
            System.out.println("Edad Persona 2= ");
            p2= teclado.nextInt();
            System.out.println("El nombre y la edad de la persona 2 es = " + nom2 + " " +  p2 + '\n');
            
            if(p1>p2){
                System.out.println("La persona con mayor edad es =  " + nom1 + " " + " con " + p1 + " " +" años");
            }else{
                System.out.println("La persona con mayor edad es = " + nom2 + " " + "con " + p2 + " " + "años" );
            }
            
            /*Solicitar el ingreso del apellido, nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad. 
             * Realizar la carga del apellido y nombre en una variable de tipo String. */
             
             String n1,n2 ;
             int edad1, edad2;
                          
             System.out.println("Vamos a ver el caso Nro.2  donde debes ingresar un nombre apellido y edad, de dos personas=  ");
             System.out.println("Nombre y apellido de la Primera Persona = ");
             n1=teclado.nextLine();
             teclado.nextLine();
             System.out.println("Edad de la Primera Persona = ");
             edad1=teclado.nextInt();
             System.out.println("Ahora vamos con la Segunda Persona");
             System.out.println("Nombre y apellido de la Segunda Persona");
             n2=teclado.nextLine();
             teclado.nextLine();
             System.out.println("Edad de la Segunda Persona");
             edad2=teclado.nextInt();
             
             if (edad1 > edad2){
                    System.out.println("La Primera Persona" + " " + n1 + " " + " es mayor en edad que la Segunda ");
                }else{
                    if(edad1 == edad2){
                        System.out.println("Las dos personas tienen la misma edad");
                    }else{
                    System.out.println("La Segunda Persona"+ " " + n1 + " " + " es mayor en edad que la Primera");
                }  
            }
                                   
             /*Solicitar el ingreso de dos apellidos. Mostrar un mensaje si son iguales o distintos.*/
            
             String ap1, ap2;
             
            System.out.println("Inicio del Caso Nro.  3 🐱‍👤🐱‍👤🐱‍👤 por Favor ingresa dos apellidos, para saber su diferencia ");
            System.out.println("Ingrese el apellido de la primera persona es = ");
            ap1=teclado.next();
            System.out.println("Ingrese el apellido de la segunda persona es = ");
            ap2=teclado.next();
            
            if(ap1.equals(ap2)){
                System.out.println("Los apellidos son iguales ");
            }else{
                System.out.println("Los apellidos son diferentes");
            }
                        
            
        
           
    
    
}  
}
