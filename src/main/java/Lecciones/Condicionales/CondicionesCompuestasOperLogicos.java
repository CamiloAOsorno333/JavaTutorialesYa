package Lecciones.Condicionales;

import java.util.Scanner;

public class CondicionesCompuestasOperLogicos {
    public static void main(String[] args) {

        /*Confeccionar un programa que lea por teclado tres números distintos y nos muestre el mayor.*/

        System.out.println("Por favor ingrese tres números ");
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Por favor ingrese el primer número");
        n1 = teclado.nextInt();
        System.out.println("Por favor ingrese el segundo número");
        n2 = teclado.nextInt();
        System.out.println("Por favor ingrese el tercero número");
        n3 = teclado.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El  número mayor  es = " + n1);
        }
        if (n2 > n3) {
            System.out.println("El  número mayor  es = " + n2);
        } else {
            System.out.println("El  número mayor  es = " + n3);
        }

        /*Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si corresponde al primer
        trimestre del año (enero, febrero o marzo) Cargar por teclado el valor numérico del día, mes y año.
        Ejemplo: dia:10 mes:1 año:2010.*/

        System.out.println("Por favor ingresa una fecha con día mes y año");
        int dia, mes, ano;
        System.out.println("Por favor ingresa el día");
        dia = teclado.nextInt();
        System.out.println("Por favor ingresa el mes");
        mes = teclado.nextInt();
        System.out.println("Por favor ingresa el ano");
        ano = teclado.nextInt();

        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("La fecha corresponde al primer trimestre");
        } else {
            System.out.println("La fecha no corresponde al primer trimestre");
        }

    /*Realizar un programa que pida cargar una fecha cualquiera, luego verificar
    si dicha fecha corresponde a Navidad*/

        System.out.println("Por favor ingresa una fecha, para saber si es navidad");
        int dia2, mes2, ano2;
        System.out.println("Por favor ingrese el día");
        dia2 = teclado.nextInt();
        System.out.println("Por favor ingrsee el mes");
        mes2 = teclado.nextInt();
        System.out.println("Por favor ingrese el año");
        ano2 = teclado.nextInt();
        if (dia2 == 25 && mes2 == 12 || ano2 == 2024) {
            System.out.println("Hoy es navidad");
        } else {
            System.out.println("No es navidad ");
        }

        /*Se ingresan tres valores por teclado, si todos son iguales
        se imprime la suma del primero con el segundo y a este resultado se lo multiplica por
        el tercero.*/

        int v1, v2, v3, suma, resta, division, producto;

        System.out.println("Por favor ingrese tres valores por teclado");
        System.out.println("Por favor ingrese el primer valor ");
        v1 = teclado.nextInt();
        System.out.println("Por favor ingrese el segundo valor ");
        v2 = teclado.nextInt();
        System.out.println("Por favor ingrese el tercer valor ");
        v3 = teclado.nextInt();

        if (v1 == v2 && v1 == v3) {
            suma = v2 + v2;
            System.out.println("La suma de los dos primeros valres es = " + suma);
            producto = v3 * suma;
            System.out.println("La el producto del valor 3 con el valor 2 es =  " + producto);
        } else {
            System.out.println("Ninguno de los tres valores es igual");
        }


        /*Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
        imprimir en pantalla la leyenda "Todos los números son menores a diez, si al menos uno de
        los valores ingresados es menor a 10,         imprimir en pantalla la leyenda
        "Alguno de los números es menor a diez".*/

        System.out.println("Por favor ingrese tres números para saber si son menores que 10");
        int num1, num2, num3;
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = teclado.nextInt();

        if (num1 < 10 && num2 < 10 && num3 < 10) {
            System.out.println("Todos los números son menores a 10");
        }
        if (num1 < 10 || num2 < 10 || num3 < 10) {
            System.out.println("Alguno de los números es menor a 10");
        } else {
            System.out.println("Sigue intentando ninguno de los números son menores a 10");
        }

        System.out.println(" 😁😎🚀🚒👍😜🎶😁😎🚀🚒👍😜🎶😁😎🚀🚒👍😜🎶😁😎🚀🚒👍😜🎶 ");

       /*Escribir un programa que pida ingresar la coordenada de un punto en el plano,
        es decir dos valores enteros x e y (distintos a cero).
        Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
        (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/

        int x, y;
        System.out.println("Por favor ingrese las coordenads de X y Y");
        System.out.println("Por favor ingrese la coordenada X");
        x = teclado.nextInt();
        System.out.println("Por favor ingrese la coordenada Y");
        y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Las Coordenadas se encuentran en el cuadrante 1o ");
        }else{
            if (x < 0 && y > 0) {
                System.out.println("Las Coordenadas se encuentran en el cuadrante 2o ");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("Las Coordenadas se encuentran en el cuadrante 3o ");
                } else {
                    System.out.println("Las Coordenadas se encuentran en el cuadrante 4o ");
                }
            }
        }


        /*De un operario se conoce su sueldo y los años de antigüedad.
        Se pide confeccionar un programa que lea los datos de entrada e informe:
        a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
            otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
        b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
        c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

        int sueldo,antiguedad, aumento20, aumento5, sueldoPagar;
        System.out.println("Por favor ingresa el sueldo devengado");
        sueldo=teclado.nextInt();
        System.out.println("Por favor ingresa los años de antiguedad");
        antiguedad=teclado.nextInt();
        aumento20= sueldo +  (sueldo * 20/100);
        aumento5= sueldo +  (sueldo * 5/100);

        if(sueldo < 500 && antiguedad >= 10){
            System.out.println("Se le ha otorgado un aumento del 20% = " + aumento20);
        }if(sueldo < 500 && antiguedad < 10){
            System.out.println(" Se le ha otorgado un aumento de 5% = " +aumento5);
        }else{
            System.out.println("No tiene la antiguedad ni el tope de sueldo necesario para optar a un aumento");
        }


        /*Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e
        informe su rango de variación (debe mostrar el mayor y el menor de ellos)*/

        //int numero1,numero2,numero3;
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();

        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        System.out.print("Rango de valores:");
        if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        System.out.print("-");
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }


    }

}
