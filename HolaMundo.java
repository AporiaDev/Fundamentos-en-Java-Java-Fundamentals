//Fundamentos de java
/*Primer "Hola mundo en Java"*/

import java.util.Scanner;

public class HolaMundo{
    public static void main( String args []) {

        Scanner inside = new Scanner(System.in);

        String nombre = "Bryan";
        String apellido = "Silva";
        int a = 2;
        int b = 4;

        System.out.println("Hola mundo");

        /*Secuencias de escape*/
        System.out.println("Linea 1 \n Linea 2");
        System.out.println("Linea 1 \t Linea 2");
        System.out.println("Linea 1 \r Linea 2");
        System.out.println("Linea 1 \" Linea 2");
        System.out.println("Linea 1 \\ Linea 2");
    
        //Tipos de datos y variables
        byte byteDato = 100;
        System.out.println(byteDato);
        
        //Concatenar texto
        System.out.println("Su nombre con apellido es:" + nombre +" "+ apellido);

        //Operacion
        System.out.println(a + b);

        //Ejemplo de ingreso de datos
        System.out.print("Ingrese su nombre");
            String nombree = inside.nextLine();

        System.out.print("Ingrese su edad: ");
            int edad = inside.nextInt();

        System.out.println(nombree + " " + edad);
 
   

        
    }   
}

/*Si planeo reutilizar codigo utilizo "Public class"
pero si quiero encapsular mejor mi logia de programacion, lo mejor
sera utiliar "class"*/

/*Tipo de comentario:
 * 1)/* Colección
 * 2)// Una linea
*/
/*Secuencias de escape
 * \t inserta un espacio de tabulacion en el texto
 * \n Salto de linea
 * \r Inserta lo siguiente
 * \\ Inserta (\)
 * \" Inserta (")
 * print imprime en la misma linea y println hace salto de linea
*/

/*Tipos de datos y variables
  * En java se tienen dos tipos de datos; 
    datos simples y datos por referencia
    En este aso solo hablaremos de los datos primitivos.
  *Algunos de estos datos simples son: Byte, short,int, long, float
    double,float, boolean y char(Char se utiliza para almacenar una letra ''
    Mientras que string almacena cadenas de caracteres"")
  *Los tipos de datos byte, short, int y long permiten trabajar con números enteros. Los tipos float y double, se usan
    para trabajar con valores con punto decimal. El tipo de dato
    boolean, se utiliza para trabajar con valores de verdad, los
    únicos valores de tipo boolean son false y true. El tipo
    de dato char es un carácter Unicode. Unicode es un estándar que define los caracteres necesarios para poder escribir
    la mayoría de los idiomas.

 */

/*Concatenaccion de textos
 * Podemos contenar string con +
 */

/*Operadores aritmeticos
 * Suma +
 * Resta -
 * Multiplicacion *
 * Division / 
 * Residuo o modulo %
 */

/*Leer valores de entrada
 * Para poder leer valores de entrada en java vamos a necesitar importar "import java.util.Scanner;"
    con la finalidad de permitir el ingreso de datos
 * Tenemos que crear un objeto Scanner para poder ingresar valores de entradad con Scanner scanner = new Scanner(System.in);
  

 */

 


