package Lecciones.While;

import java.util.Scanner;

public class ProblemasWhile {
    public static void main(String[] args) {

        /*1. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen
        notas mayores o iguales a 7 y cuántos menores.*/

        Scanner teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese 10 notas del algún alumno");
        int x,n,suma,nota, nMayor,nMenor;
        x=1;
        suma=1;
        n=1;
        nMayor=0;
        nMenor=0;

        while(x<=10){
            System.out.println("Por favor ingrese la nota" + " " + x + 'o');
            nota=teclado.nextInt();
            if(nota>=7){
                 nMayor++;
            }else{
                 nMenor++;
            }
            x++;
        }
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7 son =  " + nMayor);
        System.out.println("Cantidad de alumnos con notas menores a 7 son =  " + nMenor);



        /*2. Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de
        las personas.*/
        System.out.println("Inicio caso Nro. 2");
        float y, z,altura,promedio,suma2;
        System.out.println("Por favor ingrese la cantidad de alturas que va a ingresar = ");
        z= teclado.nextFloat();
        System.out.println("Por favor ingrese la altura de sus amigos= ");

        y=1;
        altura=0;
        promedio=0;
        suma2=1;

        while(y<=z){
            System.out.println("Por favor ingresar la altura de la persona 🧔" + " " + y);
            altura= teclado.nextFloat();
            suma2= suma2 +altura;
            y++;
        }

        promedio=suma2/y;
        System.out.println("El promedio de altura es " + promedio);

        /*3. En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
        realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
        empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa
        deberá informar el importe que gasta la empresa en sueldos al personal.*/

        System.out.println("Inicio caso Nro. 3" + '\n' + "🐱‍👤" + '\n');

        int sueldo,t, v, empleados, importe,sM300,sMenor300;

        System.out.println("Por favor ingrese el número de empleados = ");
        v=teclado.nextInt();

        t=1;
        sueldo=0;
        empleados=0;
        importe=0;
        sMenor300=0;
        sM300=0;

        while(t<=v){
            System.out.println("Ingrese el sueldo del empleado Nro. " + " " + t + "o" );
            sueldo= teclado.nextInt();

            if(sueldo<=300){
                sMenor300++;
            }else{
                sM300++;
            }
            suma= suma + sueldo;
            t++;
        }

        System.out.println("El número de trabajadores que ganan entre $100 y $300 es = " + sMenor300);
        System.out.println("El número de trabajadores que ganan mas de $300 es = " + sM300);
        System.out.println("El total del gasto en pago de empleados es = " + suma);

        /*4. Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
        (No se ingresan valores por teclado)*/

        System.out.println("Aquí inicia el cuarto problema a resolver.." +" " + '\n' +"🤖🤖" );
        int r= 0;
        while(r<=275){
            System.out.println(r);
            r=r+11;
        }

        /*5. Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.*/

        System.out.println("\n" + "Aquí inicia el Quinto problema ..." + "\n" + "🐱‍🚀" );

        int s=8;
        while (s<=500){
            System.out.println(s + "🐼");
            s= s+8;
        }

        /*6. Realizar un programa que permita cargar dos listas de 15 valores cada una.
        Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
        (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
        Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.*/

        System.out.println("\n" + "Inicio del problema 6o " + "👻");

        int l,m,l1,l2,valor1,valor2,totlista1,totlista2;

        System.out.println("Por favor ingrese los valores de la lista 1");
        l=0;
        totlista1=0;
        totlista2=0;

        while (l<=15){
            System.out.println("valor " + l + "o");
            valor1=teclado.nextInt();
            totlista1=totlista1 + valor1;
            l++;
        }

        System.out.println("Por favor ingrese los valores de la lista 2");
        m=0;

        while (m<=15){
            System.out.println("valor " + m +"o");
            valor2=teclado.nextInt();
            totlista2=totlista2 + valor2;
            m++;
        }
        if (totlista1 > totlista2){
            System.out.println("La lista 1 contiene un mayor valor");
            }if (totlista2 > totlista1){
                System.out.println("La lista 2 contiene un mayor valor");
            }else{
                System.out.println("listas iguales ");
            }



        /*7. Desarrollar un programa que permita cargar n números enteros y
        luego nos informe cuántos valores fueron pares y cuántos impares.
        Emplear el operador % en la condición de la estructura condicional:
            if (valor%2==0)         //Si el if da verdadero luego es par.*/


        System.out.println("\n" + "Inicio del septimo y último caso del While " + "\n" + "🐱‍👓");

        int p,numeros,n3, impares,pares,valor;
        p=1;
        impares=0;
        pares=0;
        valor=0;

        System.out.println("Ingrese la cantidad de números que pretende analizar = ");
        numeros=teclado.nextInt();

        while (p<=numeros){
            System.out.println("ingrese el número " + p + "o");
            n3=teclado.nextInt();
            if(n3 %2==0){
                pares++;
            }else{
                impares++;
            }
            p++;
            System.out.println("El total de números impares es = " + impares);
            System.out.println("El total de números pares es = " + pares);

            System.out.println("Gracias por realizar los ejercicios de while");

        }


    }

}
