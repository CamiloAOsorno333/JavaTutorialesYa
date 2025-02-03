import java.util.Scanner;

public class VertorOrdPaisesPobla {
    private Scanner teclado;
    private String[] vectorPais;
    private int[] vectorPoblacion;

    public VertorOrdPaisesPobla() {
    }

    public void ingresarPais() {
        this.teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de países que vamos a conocer= ");
        int pais = this.teclado.nextInt();
        this.vectorPais = new String[pais];

        for(int f = 0; f < pais; ++f) {
            System.out.println("Por favor ingrese el nombre del país Nro. " + f + "= ");
            this.vectorPais[f] = this.teclado.next();
        }

    }

    public void ingresarPoblacion() {
        System.out.print("Por favor ingresea la cifra de la población del país= ");
        int poblacion = this.teclado.nextInt();
        this.vectorPoblacion = new int[poblacion];

        for(int g = 0; g < poblacion; ++g) {
            System.out.print("Por favor ingrese la cifra de la población del país Nro. " + g + "= ");
            this.vectorPoblacion[g] = this.teclado.nextInt();
        }

    }

    public void recorridoPoblacion() {
        for(int x = 0; x < this.vectorPais.length; ++x) {
            for(int g = 0; g < this.vectorPais.length - 1 - x; ++g) {
                if (this.vectorPoblacion[g] < this.vectorPoblacion[g + 1]) {
                    int menor = this.vectorPoblacion[g];
                    this.vectorPoblacion[g] = this.vectorPoblacion[x + 1];
                    this.vectorPoblacion[x + 1] = menor;
                }
            }
        }

    }

    public void ordenarPais() {
        for(int x = 0; x < this.vectorPais.length; ++x) {
            for(int f = 0; f < this.vectorPais.length - 1 - x; ++f) {
                if (this.vectorPais[f].compareTo(this.vectorPais[f + 1]) > 0) {
                    String auxpais = this.vectorPais[f];
                    this.vectorPais[f] = this.vectorPais[f + 1];
                    this.vectorPais[f + 1] = auxpais;
                    int auxpob = this.vectorPoblacion[f];
                    this.vectorPoblacion[f] = this.vectorPoblacion[f + 1];
                    this.vectorPoblacion[f + 1] = auxpob;
                }
            }
        }

    }

    public void imprimir() {
        for(int x = 0; x < this.vectorPais.length; ++x) {
            String var10001 = this.vectorPais[x];
            System.out.print(var10001 + "= " + this.vectorPoblacion[x]);
        }

    }

    public static void main(String[] ar) {
        VertorOrdPaisesPobla pv = new VertorOrdPaisesPobla();
        pv.ingresarPais();
        pv.ingresarPoblacion();
        System.out.println("Los paises escogidos son= ");
        pv.imprimir();
    }
}
