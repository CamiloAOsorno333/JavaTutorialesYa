import java.util.Scanner;

/**
 Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 */
public class Vector2{
    
    private float[] alturas; 
    private float promedio;
    private int altas, bajas;
    private Scanner teclado;
    
    public void inicializar(){
        teclado= new Scanner(System.in);
        alturas= new float[5];
        for(int f=0; f<5;f++){
            System.out.println("Por favor ingrese la altura de la persona No. " + " " + f );
            alturas[f]=teclado.nextFloat();
        }
    }
    
    public void promedio(){
        float suma=0;
        for(int f=0;f<5;f++){
            suma= suma + alturas[f];
        }
        promedio=suma/5;
        System.out.println("El promedio de la estatura de las personas ingresadas es " + " " + promedio);
    }
    
    public void altasBajas(){
        altas=0;
        bajas=0;
        for(int f=0; f<5;f++){
            if(alturas[f]>promedio){
                altas++;
            }else{
                if(alturas[f]<promedio){
                bajas++;
                }
            }      
    
    }
    
    System.out.println("Cantidad de personas mayores al promedio= " + altas);
    System.out.println("Cantidad de personas menores al promedio= " + bajas);
      
}

    public static void main(String[] args){
        Vector2 estatura= new Vector2();
        estatura.inicializar();
        estatura.promedio();
        estatura.altasBajas();    
    }


}
