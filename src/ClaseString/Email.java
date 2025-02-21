/*Realizar una clase, que permita cargar una dirección de mail en el constructor, luego en otro método mostrar un
  mensaje si contiene el caracter '@'.*/

package ClaseString;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Email {

    private Scanner teclado;
    private String mail;

    public Email(){
        teclado= new Scanner(System.in);
        System.out.println("Por favor ingrese el email de su empresa= ");
        mail=teclado.next();
        System.out.println("Ingresó el correo= " + mail);

    }

    public void verifEmail() {
        boolean existe = false;
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                existe = true;
            }
        }
        if (existe = true) {
            System.out.println("El email ingresado es correcto, contiene una @");
        } else {
            System.out.println("Por  favor corrija el email ingresado, debe tener un @");
            }

        }


        public static void main (String[] ar){
            Email em = new Email();
            em.verifEmail();
        }

    }
