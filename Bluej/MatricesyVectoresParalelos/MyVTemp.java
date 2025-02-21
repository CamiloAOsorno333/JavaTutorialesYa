import java.util.Scanner;

/* Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato
las temperaturas medias mensuales de dichos paises.
Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
c - Calcular la temperatura media trimestral de cada país.
c - Imprimr los nombres de los paises y las temperaturas medias trimestrales.
b - Imprimir el nombre del pais con la temperatura media trimestral mayor. */

public class MyVTemp{

    private Scanner teclado;
    private String[] pais;
    private int[][] temp;
    private int[] temM;

    public void cargar(){
        teclado= new Scanner(System.in);
        pais= new String[4];
        temp=new int[4][3];
        for (int f=0; f < pais.length; f++){
            System.out.println("Ingrese el país= ");
            pais[f]=teclado.next();

            for (int c=0; c < temp[f].length; c++){
                System.out.println(pais[f] + " Temperatura mes Nro.  " + f + " =");
                temp[f][c]=teclado.nextInt();
            }
        }
    }

    public void impTem(){
        for (int f=0; f < pais.length; f++){
            System.out.println("País= " + pais[f] + ":");
            for (int c=0; c < temp[f].length;c++)
            System.out.println(temp[f][c] + " ");
        }
    }

    public void media(){
        temM=new int[4];
        for (int f=0; f < temp.length; f++){
            int suma=0;
            for (int c=0; c < temp[f].length;c++){
                suma= suma + temp[f][c];
            }
            temM[f]= suma/3;
        }
    }

    public void imprmTM(){
        System.out.println("Temperatura trimestral");
        for(int f=0; f < pais.length; f++){
                System.out.println(pais[f] + "=" + temM[f]);
            
        }
    }
    
    public void mayorTemp(){
        int tempMayor=temM[0];
        String nom=pais[0];
        for(int f=0; f< pais.length;f++){
            if(temM[f] > tempMayor){
                tempMayor= temM[f];
                nom=pais[f];
            }
          }
          System.out.println("País con mayor temperatura "+ nom + " Temperatura= " + tempMayor);  
        }
    



    public static void main(String[] args ){
        MyVTemp mvp= new MyVTemp();
        mvp.cargar();
        mvp.impTem();
        mvp.media();
        mvp.imprmTM();
        mvp.mayorTemp();
        

    }


}