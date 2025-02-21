package ClaseString;

public class MetodosString {

    /*La clase String está orientada a manejar cadenas de caracteres. Hasta este momento hemos utilizado algunos
    métodos de la clase String (equals, compareTo)

    Ahora veremos otro conjunto de métodos de uso común de la clase String:

    Métodos

    boolean equals(String s1)
    Como vimos el método equals retorna true si el contenido de caracteres del parámetro s1 es exactamente igual a
    la cadena de caracteres del objeto que llama al método equals.

    boolean equalsIgnoreCase(String s1)
    El funcionamiento es casi exactamente igual que el método equals con la diferencia que no tiene en cuenta
     mayúsculas y minúsculas (si comparamos 'Ana' y 'ana' luego el método equalsIgnoreCase retorna true)

    int compareTo(String s1)
    Este método retorna un 0 si el contenido de s1 es exactamente igual al String contenido por el objeto que llama
    al método compareTo. Retorna un valor >0 si el contenido del String que llama al método compareTo es mayor alfabéticamente al parámetro s1.

    char charAt(int pos)
    Retorna un caracter del String, llega al método la posición del caracter a extraer.

    int length()
    Retorna la cantidad de caracteres almacenados en el String.


    String substring(int pos1,int pos2)
    Retorna un substring a partir de la posición indicada en el parámetro pos1 hasta la posición pos2 sin incluir
    dicha posición.

    int indexOf(String s1)
    Retorna -1 si el String que le pasamos como parámetro no está contenida en la cadena del objeto que llama al método.
    En caso que se encuentre contenido el String s1 retorna la posición donde comienza a repetirse.

    String toUpperCase()
    Retorna un String con el contenido convertido todo a mayúsculas.

    String toLowerCase()
    Retorna un String con el contenido convertido todo a minúsculas.*/


}
