/*Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes
métodos:
a) Mostrar por pantalla los datos.
b) Consulta del mail ingresando su nombre.
c) Mostrar los mail que no tienen el carácter @.*/

package ClaseString;

import java.util.Scanner;

public class CincoNombres {

    private Scanner teclado;
    private String[] nombres;
    private String[] mail;
    private String conNombre;

    public CincoNombres(){
        cargar();
        mostrar();
        consulta();
        verArroba();
     }

     public void cargar() {
         teclado = new Scanner(System.in);
         nombres = new String[5];
         mail = new String[5];
         for (int f = 0; f < nombres.length; f++) {
             System.out.println("Por ingrese el nombre Nro. " + f + " =");
             nombres[f] = teclado.next();
             System.out.println("Por favor ingrese el correo Nro. " + f + " =");
             mail[f]= teclado.next();

         }
     }

     public void mostrar(){
        System.out.println("Los datos ingresados son= ");
        for(int f=0; f< nombres.length; f++){
            System.out.println("Nombre= " + nombres[f] + '\n' + "Email= "+ mail[f]);
        }
     }

     public void consulta(){

        System.out.println("Por favor ingrese su nombre= ");
         conNombre=teclado.next();
         for(int f=0; f <nombres.length; f++){
             if(nombres[f].equals(conNombre)){
                System.out.println("El correo de la persona ingesada es " + mail[f]);
             }

             }
         }

    public void verArroba(){
         for(int k=0; k <mail.length; k++) {
             boolean existe = false;
             for (int f = 0; f < mail[k].length(); f++) {
                 if (mail[k].charAt(f) == '@') {
                     existe = true;
                 }
             }
             if (existe == false) {
                 System.out.println(nombres[k] + " No cuenta con un arroba que lo identifica con como un correo valido");
             }
         }

    }


     public static void main(String[] ar){
         CincoNombres cn= new CincoNombres();
     }
}
