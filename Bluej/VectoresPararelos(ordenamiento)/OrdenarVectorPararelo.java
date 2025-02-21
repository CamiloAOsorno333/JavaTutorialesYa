import java.util.Scanner;

/**
 Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas. Luego ordenar las notas de mayor 
 a menor. Imprimir las notas y los nombres de los alumnos.
 */
public class OrdenarVectorPararelo{
     
    private Scanner teclado;
    private String[] nombres;
    private int[] notas;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        nombres=new String[5];
        notas=new int[5];
        System.out.println("Por favor ingrese los datos solicitados");
        for(int f=0;f<nombres.length;f++){
            System.out.println("Por favor ingrese el nombre del alumno Nro= " + f);
            nombres[f]= teclado.next();
            System.out.println("Por favor ingrese la nota del alumno Nro= " + f);
            notas[f]=teclado.nextInt();    
        }
    }
    
    public void ordenar(){
        for(int k=0;k<notas.length;k++){
            for(int f=0;f<notas.length -1 - k;f++){
               if(notas[f]<notas[f+1]){
                    int aux;
                    aux=notas[f];
                    notas[f]=notas[f+1];
                    notas[f+1]=aux;
                    String auxnombre;
                    auxnombre=nombres[f];
                    nombres[f]=nombres[f+1];
                    nombres[f+1]=auxnombre;
                } 
            }
        }
    
    }
    
    public void imprimir(){
        for(int f=0; f<notas.length;f++){
            System.out.println("Alumno.java " + nombres[f] + " - " + "Nota= " + notas[f]);
        }
    }
    
    public static void main(String[] args){
        OrdenarVectorPararelo pv=new OrdenarVectorPararelo();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
    
}
