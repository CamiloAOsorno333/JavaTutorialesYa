import java.util.Scanner;

/**
 Desarrolar un programa que dado un vector 
 -Invertir los componentes de vector
 -Multiplicar los componentes del vector por 2 cada segundo digito del vector
 -Si el producto de alguno de estos es mayor a 9, se debe sumar sus digitos
 -Sumar todos los digitos y si el resultado es multiplo de 10 imprimir es correcto
 */
public class Luhn{

    private Scanner teclado;
    private int[] vector;
    private long union;
    private int prod;
    private int[] digs;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos que tendra el vector= ");
        int c=teclado.nextInt();
        vector=new int[c];
        for(int f=0; f < vector.length; f++){
            System.out.println("Ingrese los componentes del vector");
            vector[f]=teclado.nextInt();
        }
    }
    
    public void imprimir(){
        for(int f=0; f < vector.length;f++){
            System.out.print(vector[f] + " - ");
        }
    }
    
    public void invertir(){
         
        for(int f=0; f < vector.length/2; f++){
            int aux=vector[f];
            vector[f]=vector[vector.length-1-f];
            vector[vector.length-1-f]=aux;
            aux=vector[f];
        }
        System.out.println();
        
    }
    
    public void multiplicar(){
        
        for(int f=0; f < vector.length;f=f+2){
            prod= vector[f] * 2;
            System.out.print(prod + " -");
        }
        System.out.println();
    }
    
    
    public void separar(){
          
        String div="";
        digs= new int[2];
        int suma=0;
        
        for(int i=0; i < vector.length; i++){
            
            if(prod > 9){
                div += digs[i];
                for(int f=0; f < 2; f++){
                    suma= digs[0] + digs[1];
                    
                }
            } System.out.println(suma);
            
            
            
        
        } 
        
        //union=Long.parseLong(unionString);
        //System.out.println(union);
    }
    
    public void convString(){
        String unionString="";
        union=0;
         
        for(int i=0; i < vector.length; i++){
            unionString += vector[i];
             
        }
        
        union=Long.parseLong(unionString);
        System.out.println(union);
    }
    
    
    public void dividirDig(){
        long num=union;
        long residuo;
        double suma=0;
        double mult=1;
        //System.out.println("El número obtenido del vector es= ");
        int x=0;
        
        while(num > 0){
            //num=union; 
            residuo=num%10;
            mult=residuo * 2;
            suma=0;
            if(mult > 9){
                //double u2=mult;
                //String reString=Double.toString(res);
                /*for(int f=0;f < 2;f++){
                    double res=u2%10;
                    System.out.println("resultado es " + res);
                    suma=suma + res;
                    u2=u2/10;
                }*/
                
            } 
            num=num/10;
            x=x+2;
        }
        //System.out.println("La suma= " + suma);
    } 
    
    
    public static void main(String[] ar){
        Luhn lu= new Luhn();
        lu.cargar();
        lu.imprimir();
        lu.invertir();
        lu.multiplicar();
        lu.separar();
        lu.imprimir();
        //lu.convString();
        
        
    }
}
