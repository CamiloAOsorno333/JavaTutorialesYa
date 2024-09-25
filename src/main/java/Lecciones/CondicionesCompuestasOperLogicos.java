package Lecciones;

import java.util.Scanner;

public class CondicionesCompuestasOperLogicos {
    public static void main(String[] args) {

        /*Confeccionar un programa que lea por teclado tres números distintos y nos muestre el mayor.*/

        System.out.println("Por favor ingrese tres números ");
        Scanner teclado= new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Por favor ingrese el primer número");
        n1= teclado.nextInt();
        System.out.println("Por favor ingrese el segundo número");
        n2= teclado.nextInt();
        System.out.println("Por favor ingrese el tercero número");
        n3= teclado.nextInt();

        if (n1 > n2 && n1>n3){
            System.out.println("El  número mayor  es = "  + n1);
        }if(n2 > n3){
            System.out.println("El  número mayor  es = "  + n2);
        }else {
            System.out.println("El  número mayor  es = "  + n3);
        }

        /*Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si corresponde al primer
        trimestre del año (enero, febrero o marzo) Cargar por teclado el valor numérico del día, mes y año.
        Ejemplo: dia:10 mes:1 año:2010.*/

        System.out.println("Por favor ingresa una fecha con día mes y año");
        int dia,mes, ano;
        System.out.println("Por favor ingresa el día");
        dia= teclado.nextInt();
        System.out.println("Por favor ingresa el mes");
        mes= teclado.nextInt();
        System.out.println("Por favor ingresa el ano");
        ano= teclado.nextInt();

        if(mes==1 || mes == 2 || mes==3){
            System.out.println("La fecha corresponde al primer trimestre");
        }else {
            System.out.println("La fecha no corresponde al primer trimestre");
        }

    /*Realizar un programa que pida cargar una fecha cualquiera, luego verificar
    si dicha fecha corresponde a Navidad*/

        System.out.println("Por favor ingresa una fecha, para saber si es navidad");
        int dia2, mes2,ano2;
        System.out.println("Por favor ingrese el día");
        dia2= teclado.nextInt();
        System.out.println("Por favor ingrsee el mes");
        mes2=teclado.nextInt();
        System.out.println("Por favor ingrese el año");
        ano2=teclado.nextInt();
        if (dia2 == 25 && mes2 == 12 || ano2 == 2024 ){
            System.out.println("Hoy es navidad");
        }else{
            System.out.println("No es navidad ");
        }

        /*Se ingresan tres valores por teclado, si todos son iguales
        se imprime la suma del primero con el segundo y a este resultado se lo multiplica por
        el tercero.*/


        /*Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
        imprimir en pantalla la leyenda "Todos los números son menores a diez".*/

        /*Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10,
        imprimir en pantalla la leyenda "Alguno de los números es menor a diez".*/


        /*Escribir un programa que pida ingresar la coordenada de un punto en el plano,
        es decir dos valores enteros x e y (distintos a cero).
        Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
        (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/

        /*De un operario se conoce su sueldo y los años de antigüedad.
        Se pide confeccionar un programa que lea los datos de entrada e informe:
        a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
            otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
        b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
        c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

        /*Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e
        informe su rango de variación (debe mostrar el mayor y el menor de ellos)*/
    }

}
