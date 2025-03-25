package Lecciones.ColaboracionClases.Banco;

/*Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco requiere que al final del día
calcule la cantidad de dinero que hay depositada.
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Cliente y la clase Banco.*/

public class Cliente {

    //Atributos
    private String nombre;
    private int monto;

    public Cliente(String m){
        nombre= m;
        monto=0;
    }

    public void depositos(int m){
        monto= monto + m;
    }

    public void extracciones(int m){
        monto= monto - m;
    }

    public int retornoMonto(){
        return monto;
    }

    public void imprimir(){
        System.out.println("El cliente" + nombre + "tiene consignado un monto de " + monto);
    }

}
