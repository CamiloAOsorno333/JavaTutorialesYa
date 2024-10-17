import java.util.Scanner;


public class DoWhile{
   public static void main(String[] args){
    
    /*Escribir un programa que solicite la carga de un número entre 0 y 999,
     * y nos muestre un mensaje de cuántos dígitos tiene el mismo. 
     * Finalizar el programa cuando se cargue el valor 0.*/
    
    Scanner teclado= new Scanner(System.in);
    int valor;
    
    do{System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza)");
    valor=teclado.nextInt();
        if(valor >= 100){
            System.out.println("Es un número de 3 digitos");
        }else{
            if(valor>=10){
                System.out.println("Es un número de 2 digitos ");
            }else{
                System.out.println("Es un número de 1 digito");
            }
    }
    
    }while(valor !=0);
    
    
    
    /*Escribir un programa que solicite la carga de números por teclado, obtener su promedio. 
     * Finalizar la carga de valores cuando se cargue el valor 0.*/
     
    System.out.println("Por favor ingrese dos valores para su procesamiento");
     int suma,cant,valor1,prom;
        suma=1;
        cant=1;
        
        
        do {
            System.out.print("Ingrese un valor (0 para finalizar):");
            valor1=teclado.nextInt();
            if (valor1 !=0) {
                suma=suma+valor;
                cant++;
            }
        } while (valor1 !=0);
        if (cant!=0) {
            prom=suma/cant;
            System.out.println("El promedio de los valores ingresados es:"+ prom );
            
        } else {
            System.out.println("No se ingresaron valores.");
        }
      
        
        /*Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando 
         * ingresamos el valor 0. Se debe informar:
        a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
        b) La cantidad total de piezas procesadas.*/
        
        System.out.println("Inicio del Ejercicio Nro. 1 🐱‍👤 ");
        
        float sump,p1,p2,p3,pieza;
        sump=0;
        p1=0;
        p2=0;
        p3=0;
        
        do{
        System.out.println("Por favor ingrese la pieza a analizar");
        pieza=teclado.nextFloat();
            if(pieza < 9.8){
                p1++;
            }else{
                if(pieza == 9.8 || pieza <=10.2){
                    p2++;
                }else{
                    p3++;
                }
                    }
        }while(pieza !=0 );
        
        sump=p1+p2+p3;
        
        System.out.println("La cantidad de piezas con peso entre 9.8  y 10.2 son=  " + p2);
        System.out.println("La cantidad de piezas con peso mayor a  10.2 son=  " + p3);
        System.out.println("La cantidad de piezas con peso meor a  9.8   son=  " + p1);
        System.out.println("La suma de todas las piezas es =  " + sump);
        
        /*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, 
         * indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, 
         * mayor a cero o menor a cero.*/
        
        
        /*En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de 
         * cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
        Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
        a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
        Estado de la cuenta	'Acreedor' si el saldo es >0.
        			'Deudor' si el saldo es <0.
        			'Nulo' si el saldo es =0.
        b) La suma total de los saldos acreedores.*/
                
    }
    
}

