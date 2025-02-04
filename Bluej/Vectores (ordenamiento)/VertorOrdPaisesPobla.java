import java.util.Scanner;

/**
 Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo. 
 Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes 
 (de mayor a menor) e imprimir nuevamente.
 */
public class VertorOrdPaisesPobla{
    
    
    Scanner teclado= new Scanner (System.in);
    private String[] vectorPais;
    private String[] vectorPoblacion;
    
    public void ingresarPais(){
        System.out.println("Por favor ingrese la cantidad de países que vamos a conocer= ");
        int pais= teclado.nextInt();
        vectorPais= new String[pais];
        for(int f=0; f > pais; f++){
            System.out.println("Por favor ingrese el nombre del país Nro. " + f + "= ");
            vectorPais[f]=teclado.next();
                      
        }
        
    }
    
    public void ingresarPoblación(){
        System.out.print("Por favor ingresea la cifra de la población del país= " );
        int poblacion=teclado.nextInt();
        vectorPoblacion= new String[poblacion];
        for(int g=0;g < poblacion;g++){
            System.out.print("Por favor ingrese la cifra de la población del país Nro. " + g + "= ");
            vectorPoblacion[g]=teclado.next();
        }
    
    }

    public void recorridoPoblacion(){
         
        for(int x=0;x < vectorPoblacion.length;x++){
            for(int g=0; g < vectorPoblacion.length - 1 -x;g++){
                if (vectorPoblacion[g] < vectorPoblacion[g+1]){
                    int menor;
                    menor=vectorPoblacion[g];
                    vectorPoblacion[g]=vectorPoblacion[x+1];
                    vectorPoblacion[x+1]=menor;
                
            }
        }
        
    }
}

    public void recorridoPais(){
    
    
    }
    
    
    public static void main(String[] ar){
    
    
    
    
    
    
    
    
    }// instance variables - replace the example below with your own
     
}
