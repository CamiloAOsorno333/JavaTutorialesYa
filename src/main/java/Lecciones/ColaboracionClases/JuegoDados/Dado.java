package Lecciones.ColaboracionClases.JuegoDados;

public class Dado {

    private int valor;

    public void tirar(){
        valor= 1 + (int) (Math.random()*6);
    }

    public void imprimir(){
        System.out.println("El valor del Dado es= " + valor);
    }
    public int retornarValor(){
        return valor;
    }



}
