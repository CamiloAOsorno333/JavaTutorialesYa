package Lecciones.ColaboracionClases.Banco;

/*Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco requiere que al final del día
calcule la cantidad de dinero que hay depositada.
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Cliente y la clase Banco.*/


public class Banco {
    private Cliente cliente1,cliente2,cliente3;

    public Banco(){
        cliente1= new Cliente("Juan");
        cliente2= new Cliente("Andres");
        cliente3= new Cliente("Carlos");
    }

    public void operar(){
        cliente1.depositos(150000);
        cliente2.depositos(200000);
        cliente3.depositos(180000);
        cliente1.extracciones(20000);
        cliente3.extracciones(8000);
    }

    public void depositosTotales(){
        int t= cliente1.retornoMonto() + cliente2.retornoMonto() + cliente3.retornoMonto();
        System.out.println("El total de dinero consignado hoy en el Banco es " + t);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }

    public static void main(String[] args){
        Banco banco1= new Banco();
        banco1.operar();
        banco1.depositosTotales();
    }
}
