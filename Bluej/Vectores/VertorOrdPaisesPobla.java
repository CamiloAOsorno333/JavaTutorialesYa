import java.util.Scanner;

/**
 Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo.
 Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes
 (de mayor a menor) e imprimir nuevamente.
 */
public class VertorOrdPaisesPobla{
   
   
    private Scanner teclado; 
    private String[] vectorPais;
    private int[] vectorPoblacion;
   
    public void ingresarPais(){
        teclado= new Scanner (System.in);
        System.out.println("Por favor ingrese la cantidad de países que vamos a conocer= ");
        int pais= teclado.nextInt();
        vectorPais= new String[pais];
        //int poblacion=teclado.nextInt();
        vectorPoblacion= new int[pais];
        
        for(int f=0; f < pais; f++){
            System.out.println("Por favor ingrese el nombre del país Nro. " + f + "= ");
            vectorPais[f]=teclado.next();
            System.out.print("Por favor ingrese la cifra de la población del país Nro. " + f + "= ");
            vectorPoblacion[f]=teclado.nextInt();   
        }
        
        
        /*for(int g=0;g < poblacion;g++){    
            System.out.print("Por favor ingrese la cifra de la población del país Nro. " + g + "= ");
            vectorPoblacion[g]=teclado.nextInt();         
        */
       
    }
   
    
    
    public void recorridoPoblacion(){
        for(int x=0;x < vectorPoblacion.length;x++){
            for(int g=0; g < vectorPoblacion.length - 1 -x;g++){
                if (vectorPoblacion[g] < vectorPoblacion[g+1]){
                    int menor;
                    menor=vectorPoblacion[g];
                    vectorPoblacion[g]=vectorPoblacion[x+1];
                    vectorPoblacion[x+1]=menor;
                    String auxpais;
                    auxpais=vectorPais[g];
                    vectorPais[g]=vectorPais[g + 1];
                    vectorPais[g + 1]=auxpais;
            }
        }
       
    }
}

    public void ordenarPais(){
        for(int x=0; x < vectorPais.length; x++){
            for(int f=0; f < vectorPais.length - 1- x; f++){
                if (vectorPais[f].compareTo(vectorPais[f +1])>0){
                String auxpais;
                auxpais=vectorPais[f];
                vectorPais[f]=vectorPais[f + 1];
                vectorPais[f + 1]=auxpais;
                int auxpob;
                auxpob=vectorPoblacion[f];
                vectorPoblacion[f]=vectorPoblacion[f +1];
                vectorPoblacion[f + 1]= auxpob;
        
            }
        
            }
        
        }
   
    }
   
   public void imprimir(){
       
       for (int x=0; x < vectorPais.length;x++ ) 
           System.out.println(vectorPais[x] + "= " + vectorPoblacion[x]);
           
    }
    
    
    public static void main(String[] ar){
   
        VertorOrdPaisesPobla pv= new VertorOrdPaisesPobla();
        pv.ingresarPais();
        //pv.ingresarPoblacion();
        pv.ordenarPais();
        pv.imprimir(); 
        System.out.println("-----------------------------------");
        pv.recorridoPoblacion();
        pv.imprimir();
        
        
           
    }
     
}