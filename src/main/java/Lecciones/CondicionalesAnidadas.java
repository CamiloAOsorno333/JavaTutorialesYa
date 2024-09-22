package Lecciones;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CondicionalesAnidadas {
    public static void main(String[] args) {

        /*Confeccionar un programa que pida por teclado tres notas de un alumno,
          calcule el promedio e imprima alguno de estos mensajes:
        Si el promedio es >=7 mostrar "Promocionado".
        Si el promedio es >=4 y <7 mostrar "Regular".
        Si el promedio es <4 mostrar "Reprobado".*/

        Scanner teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese las tres notas del periodo ");
        int nota1,nota2,nota3,promedio;
        System.out.println("Por favor ingresa la primera nota = ");
        nota1= teclado.nextInt();
        System.out.println("Por favor ingresa la segunda nota = ");
        nota2= teclado.nextInt();
        System.out.println("Por favor ingresa la tercera nota = ");
        nota3= teclado.nextInt();
        promedio= (nota1 + nota2 + nota3) /3;
        System.out.println("Tu promedio es = " + promedio);

        if (promedio >= 7){
            System.out.println("Has ganado, fuiste Promocionado");
        }else{
            if(promedio >=4 ){
                System.out.println("Regular");
            }else{
                System.out.println("Reprobado");
            }

        }

        /*Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos*/

        int num1,num2,num3;
        System.out.println("Por favor ingrese tres números, de los cuales quiera saber cual es el mayor");
        System.out.println("Ingrese el primer número");
        num1= teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2= teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        num3= teclado.nextInt();

        if(num1 >num2 && num1 > num3){
            System.out.println("El número mayor es = " + num1);
        }else{
            if(num2 > num1 && num2 > num3){
                System.out.println("El número mayor es = " + num2);
            }else{
                System.out.println("El número mayor es = " + num3);
            }
        }

        /*Se ingresa por teclado un valor entero, mostrar una leyenda
        que indique si el número es positivo, nulo o negativo.*/

        System.out.println("Por favor ingrese un número de su preferencia");
        int numero;
        numero=teclado.nextInt();
        if(numero ==0){
            System.out.println("Se ingresó el cero");
        }else{
            if(numero >0){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El número es negativo");
            }
        }

        /*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras
        y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si
         el número de cifras es mayor.*/

        System.out.println("Por favor ingresa un número para iniciar el juego");
        int numero2;
        numero2= teclado.nextInt();
        if (numero2 <=9){
            System.out.println("El número ingresado es de una cifra");
        }else{
            if(numero2 >9 && numero2 <=99){
                System.out.println("el número ingresado es de dos cifras");
            }else{
                System.out.println("El número ingresado es de tres cifras");
            }
        }

        /*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
         cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
         Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según
         el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
            Nivel máximo:	Porcentaje>=90%.
            Nivel medio:	Porcentaje>=75% y <90%.
            Nivel regular:	Porcentaje>=50% y <75%.
            Fuera de nivel:	Porcentaje<50%.*/

        int preguntas,correctas,nivel;
        System.out.println("Bienvenido al Test de capacitación para el nuevo empleo");
        System.out.println("El número de preguntas fue = ");
        preguntas= teclado.nextInt();
        System.out.println("La cantidad de respuesta correctas fue = ");
        correctas= teclado.nextInt();
        System.out.println("El nivel obtenido por respuestas correctas es =  ");
        nivel= (correctas * 100) / preguntas;
        if(nivel >= 90){
            System.out.println("Has alcanzado el Maximo Nivel en el examen "  + nivel + "%");
        }else{
            if(nivel >=75){
                System.out.println("Has alcanzado el Nivel Medio en el examen = "  + nivel + "%");
            } else if (nivel>= 50) {
                System.out.println("Has alcanzado el Nivel Regular en el examen = "  + nivel + "%");
            }else{
                System.out.println("Estas fuera de nivel = "  + nivel + "%");
            }
        }
    }
}
