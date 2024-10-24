import java.util.Scanner;

/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2{
    public static void main (String[] args){
    
     /*Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)*/
     
     System.out.println("Bienvenido vamos a ver la tabla de multimplicar de 5 😎 ");
     int multiplicacion;
     int multiplicador=5;
     
     for(int x=1; x<=10; x++){
        multiplicacion= x * multiplicador;
        System.out.println("5 x " + x + "= " + multiplicacion);
        }
        System.out.println("Sigue intentandolo, la perseverancia en la clave de todo");

        /*Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre
        la tabla de multiplicar del mismo (los primeros 12 términos)
        Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.*/
        
        System.out.println("Inicio Ejercicio Nro. 2 🐱‍💻");
        
        Scanner teclado= new Scanner(System.in); 
        int numero;
        
        System.out.println("Por favor ingrese un valor del 1 al 10");
        numero=teclado.nextInt();
        
        for(int f=1;f<=12;f++){
            multiplicacion= f * numero;
            System.out.println(numero + "x"+ f + "=" + multiplicacion);
        }
        
        System.out.println("🐱‍👤🐱‍👤🐱‍👤🐱‍👤🐱‍👤");
        
        

        /*Realizar un programa que lea los lados de n triángulos, e informar:
        a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
        isósceles (dos lados iguales), o escaleno (ningún lado igual)
        b) Cantidad de triángulos de cada tipo.
        c) Tipo de triángulo que posee menor cantidad.*/
        
        System.out.println("Inicio Ejercicio Nro. 3 🐱‍👓");
        
        int lado1, lado2, lado3,numTriangulos,nlado,equilatero,isoseles,escaleno;
        equilatero=0;
        isoseles=0;
        escaleno=0;
        
        System.out.println("Hoy vamos a determinar el tipo de triangulo según sus lados, cuantos triangulos quieres analizar = ");
        numTriangulos=teclado.nextInt();
                        
        for(int g=1;g<=numTriangulos;g++){
            System.out.println("Triangulo Nro." + g);
            System.out.println("Ingrese el valor del lado");
            lado1=teclado.nextInt();
            System.out.println("Ingrese el valor del lado");
            lado2=teclado.nextInt();
            System.out.println("Ingrese el valor del lado");
            lado3=teclado.nextInt();
                if(lado1==lado2 &&  lado1==lado3){
                    System.out.println("Equilatero");
                   equilatero++;
                    }else{
                        if (lado1==lado2 || lado1 == lado3 || lado2==lado3){
                        System.out.println("Isoseles");
                        isoseles++;
                        }else{
                            System.out.println("Escaleno");
                            escaleno++;
                        }
                    }  
            }
            
            
            System.out.println("El total de triangulos es= " + "\n" + "Equilatero= " + equilatero +
            "\n" + "Isoseles= " + isoseles +
            "\n" + "Escaleno= " + escaleno);
            
            if(equilatero < isoseles && equilatero < escaleno){
                System.out.println("El tipo de triangulo que tiene menor cantidad es el Equilatero");
            }if(isoseles < escaleno){
                System.out.println("El tipo de triangulo que tiene menor cantidad es el Isoseles");
            }else{
                System.out.println("El tipo de triangulo que tiene menor cantidad es el Escaleno");
            }
            
        

        /*Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
        Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar
        el programa se pide que se ingrese la cantidad de puntos a procesar.*/

       System.out.println("Aquí comienza el ejercicio Nro. 4 🙈🙉🙊");
        
        int cooX,cooY,nvalores;
        
        System.out.print("Por favor ingrese el números de pares de coordenadas que se van a analizar");
        nvalores=teclado.nextInt();
        
        System.out.println("Por favor ingrese las coordenadas =..... ");
        
        for(int h=1;h<=nvalores;h++){
            System.out.println("Por favor ingrese las coordenadas del punto Nro. " + h );
            System.out.println("Ingrese X");
            cooX=teclado.nextInt();
            System.out.println("Ingrese Y");
            cooY=teclado.nextInt();
            if(cooX>0 && cooY>0){
                System.out.println("Las coordenads estan dentro del primer cuadrante, X y Y positos");
            }else{
                if(cooX<0 && cooY>0){
                    System.out.println("Las coordenads estan dentro del segundo cuadrante, X negativo y Y posito");
                }if(cooX<0 && cooY<0){
                    System.out.println("Las coordenadas estan dentro del tercer cuadrante, X y Y negativos");
                }else{
                    System.out.println("Las coordenadas estan dentro del cuarto cuadrante, X positivo y Y negativo");
                }
            }
        }
        
         
        
        /*Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
        a) La cantidad de valores ingresados negativos.
        b) La cantidad de valores ingresados positivos.
        c) La cantidad de múltiplos de 15.
        d) El valor acumulado de los números ingresados que son pares.*/
        
        System.out.println("Inicio del Quinto Ejercicio 🧛‍♀️");
        
        int nvals,cvals,impares,pares,negativo, positivo,multiplos15;
        negativo=0;
        positivo=0;
        multiplos15=0;
        impares=0;
              
        System.out.println("Por favor ingrese la cantidad de números que se van a anlizar");
        
        
        for (int j=1; j<=10;j++){
            System.out.println("Por favor ingrese el número " + j);
            cvals=teclado.nextInt(); 
            if(cvals<0){
                negativo++;
            }else{
                if(cvals >0){
                   positivo++; 
                }if(cvals %15==0){
                    multiplos15++;
                }if(cvals %2==0){
                    impares++;
                }
            }
        }
        
        System.out.println("El total de los números negativos es = " + negativo );
        System.out.println("El total de los números positivos es = " + positivo );
        System.out.println("El total de los números multiplos de 15 es = " + multiplos15 );
        System.out.println("El total de los números impares es = " + impares );
                
        
        

        /*Se cuenta con la siguiente información:
        Las edades de 50 estudiantes del turno mañana.
        Las edades de 60 estudiantes del turno tarde.
        Las edades de 110 estudiantes del turno noche.
        Las edades de cada estudiante deben ingresarse por teclado.
                a) Obtener el promedio de las edades de cada turno (tres promedios)
                b) Imprimir dichos promedios (promedio de cada turno)
                c) Mostrar por pantalla un mensaje que indique cual de los tres turnos
                tiene un promedio de edades menor.*/
    
    }
}

    