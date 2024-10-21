import java.util.Scanner;

public class Arreglos{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

    //Ejemplo de arreglos en Java
        String[] arregloTextos = new String[7];

    // Asignar valores al arreglo
        arregloTextos[0] = "Juan";
        arregloTextos[1] = "María";
        arregloTextos[2] = "Carlos";
        arregloTextos[3] = "Ana";
        arregloTextos[4] = "Luis";
        arregloTextos[5] = "Laura";
        arregloTextos[6] = "Pedro";

    // Imprimir los valores del arreglo
        System.out.println("Nombres en el arreglo:");
        for (int i = 0; i < arregloTextos.length/*Length sirve para saber el numero de indices del arreglo */; i++) {
            System.out.println(arregloTextos[i]);
        }
    

    //Crear arreglo con los valores desde un inicio
        int [] numeros = {10,20,30,40};

        for (int indice = 0; indice < numeros.length; indice ++){
            System.out.print("Numero: " + numeros[indice]+ " en la posicion: " + (indice + 1) + "\n");
        }
        
        for (String nombre : arregloTextos){
            System.out.print(nombre + "\n");
        }
    }
}


/*Arreglos o vectores
 * Sirven para guardar datos de forma temporal, los datos tienen que ser de el mismo tipo
 * El primer valor o dato, toma un indice el cual va a ser cero, partiendo como, primer valor con indice cero
 * Una de las formas para definir un arreglo es la siguiente; String[] arregloTextos = new String[7 "Numero de indices 0-6"]
    // Asignar valores al arreglo
        arregloTextos[0] = "Juan";
        arregloTextos[1] = "María";
        arregloTextos[2] = "Carlos";
        arregloTextos[3] = "Ana";
        arregloTextos[4] = "Luis";
        arregloTextos[5] = "Laura";
        arregloTextos[6] = "Pedro";
*/

/*Inicializacion por defecto de los arreglos
 * int[]
 * double[]
 * char[]
 * boolean[]
 * String[]
 */


 /* Sentencia for mejorado
    for (variable : arreglo){
        senttencia a realizar}
  * 
  */