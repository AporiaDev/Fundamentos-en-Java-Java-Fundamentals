# Primera sesión en Java

## Primer "hola mundo" en Java

Para inicializarnos en el contexto de un lenguaje de programación, nunca esta de más empezar con nuestro primer **"Hola mundo"**, los lenguajes debido a su sintaxis en la mayoría de los casos tienen estructuras distintas, en el caso de Java nosotros inicializamos nuestro **hola mundo** de la siguiente forma: 

```Java
public class HolaMundo{
   public static void main (String args[]){
      System.out.println("Hola Mundo");
   }
}
```
De esta manera podemos hacer nuestro primer **"Hola mundo"** en Java, y vamos a poder imprimir mensajes en Java.

**Formas de imprimir un mensaje:**
*  **System.out.print():** Imprime sin salto de línea.
*  **System.out.println():** Imprime con salto de línea.
*  **System.out.printf():** Imprime con formato.
*  **System.out.format():** Similar a printf, imprime con formato.

**Secuencias de escape en java:**
*  **\t** inserta un espacio de tabulación en el texto.
*  **\n** Salto de linea.
*  **\r** Inserta lo siguiente.
*  **\\** Inserta (\).
*  **\"** Inserta (").

```Java
public class HolaMundo{
   public static void main (String args[]){

        System.out.println("Linea 1 \n Linea 2");
        System.out.println("Linea 1 \t Linea 2");
        System.out.println("Linea 1 \r Linea 2");
        System.out.println("Linea 1 \" Linea 2");
        System.out.println("Linea 1 \\ Linea 2");  
   }
}
```
Para facilitar la comprensión de lo que esta sucediendo se invita al lector a trabajar esta wiki en conjunto de Visual Studio Code, todo esto con finalidades practicas.

## Tipos de datos o varibles en Java
Los tipos de datos son las categorías por las cuales yo puedo identificar un elemento o variable con el cual será identificado en el sistema ejecutado en nuestra secuencia de programación. En java por excelencia hay dos tipos de datos; **los primitivos o simples y los que son por referencia**.

**Datos primitivos**

![image](https://github.com/user-attachments/assets/52f4c1af-5e01-47fd-bb06-0bda66f50052)
 
Los tipos de datos byte, short, int y long permiten trabajar con números enteros. Los tipos float y double, se usan para trabajar con valores con punto decimal. El tipo de dato boolean, se utiliza para trabajar con valores de verdad, los únicos valores de tipo boolean son false y true. El tipo de dato char es un carácter Unicode. Unicode es un estándar que define los caracteres necesarios para poder escribir la mayoría de los idiomas.

**Datos referencia**

![image](https://github.com/user-attachments/assets/a4a628dd-6484-4a2e-9a71-9d6498e638d6)

## ¿Cómo hacer una concatenación de texto?
Una concatenación en java con Strings se hace de la siguiente forma:
```Java
public class Concatenacion{
   public static void main(String args []){
      int num = 1;
      System.out.print("El numero es: " + num);
   }
}
```
Hay que tener en cuenta que puntualmente se deben hacer entre strings, por ejemplo, si tengo un dato booleano debe tener un cambio a String para poder ser concatenado un booleano se pasa a string de con el siguiente comando **Bolean.toString(Valor que se desea cambiar)**.

## Operadores aritméticos

Los operadores aritméticos en Java son muy similares a los de la mayoría de lenguajes de programación, para aclarar de una mejor forma los operadores en Java son los siguientes:
*  Suma +
*  Resta -
*  Multiplicación *
*  División / 
*  Residuo o modulo %

## Lectura de valores desde el terminal

En Java se pueden importar varias librerías cuya funcionalidad es permitir la entrada de valores, en esta lectura se enseña el ingreso de valores desde la terminal con **Scanner** la cual se importa con **"import java.util.Scanner"**, se hace de la siguiente manera:

```Java
\\Importante importar
import java.util.Scanner;

public class Concatenacion{
   public static void main(String args []){
\\crear el objeto
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese su numero: ");
         int num = scanner.nextInt();
   }
}
```
1. **next()** - Lee el siguiente token de entrada como una cadena (String).
   - Ejemplo: `String texto = scanner.next();`

2. **nextLine()** - Lee una línea completa de texto como una cadena (String).
   - Ejemplo: `String linea = scanner.nextLine();`

3. **nextInt()** - Lee el siguiente token de entrada como un entero (int).
   - Ejemplo: `int numeroEntero = scanner.nextInt();`

4. **nextDouble()** - Lee el siguiente token de entrada como un número decimal (double).
   - Ejemplo: `double numeroDecimal = scanner.nextDouble();`

5. **nextFloat()** - Lee el siguiente token de entrada como un número decimal (float).
   - Ejemplo: `float numeroFlotante = scanner.nextFloat();`

6. **nextLong()** - Lee el siguiente token de entrada como un número entero largo (long).
   - Ejemplo: `long numeroLargo = scanner.nextLong();`

7. **nextShort()** - Lee el siguiente token de entrada como un número entero corto (short).
   - Ejemplo: `short numeroCorto = scanner.nextShort();`

8. **nextBoolean()** - Lee el siguiente token de entrada como un valor booleano (true o false).
   - Ejemplo: `boolean valorBooleano = scanner.nextBoolean();`

## Comentarios de sesión finales
**Tipo de comentario en Java :**
 * 1)/* Colección
 * 2)// Una linea

Con esto que se ha enseñado se lleva a cabo una gran parte de fundamentos en java, en la próxima sesión hablaremos de las estructuras repetitivas y secuenciales en Java. Es muy importante tener claro el concepto de secuencia y de buble para poder comprender de una forma más rápida la sesión que ya viene.


# Segunda sesión en Java

# Estructuras de control

En esta sección trabajaremos con estructuras de tipo **secuencial** y de **repetición** 

## Estructuras secuenciales 

leen cada sentencia de código de forma secuencial, antes de entrar de lleno a hablar sobre los tipos de estructura secuencial debemos tocar los **operadores relacionales** y **operadores lógicos**, los cuales ayudaran a que la estructura secuencial tome un camino más lógico y de entendimiento en las variables, entre los tipos de estructura secuencial se encuentran las sentencias; **if-else, if-else-if y switch.**

**Operadores relacionales y de igualdad**
*  (>) mayor que.
*  (<) menor que.
*  (>=) mayor o igual que.
*  (<=) menor o igual que.
*  (==) igual que.
*  (!=) Distinto de.

**Operadores lógicos**
 * && es and.
 * || or.
 * ! not.

Si el lector necesita ejemplos de ejecución de estos operadores en la sección de archivo, se encuentra "Estructuras de control" que cuenta con ejemplos de usos de estos operadores.

**Sentencias**

* Sentencia if-else: esta sentencia, toma el caso condicional " si sucede esto debo hacer esto, pero si no ocurre la condición hago esto"  y si se quiere comprender en orden se debe tener en cuenta lo siguiente:

```Java

1 import java.util.Scanner;

2 public class SentenciaIf{
   3 public static void main(String args []){
      4 int edad;
      5 System.out.print("ingrese su edad: ");
         6  edad = scanner.nextInt();
      7 if ( edad >= 18 ){
          8 System.out.print("Usted es mayor de edad");
      9 }else {
         10 System.out.print("Usted no es mayor de edad\n");
        }
   }
}
```
Con los números en cada linea de código se indica el orden de ejecución 

* Sentencia if-else: esta sentencia, toma el caso condicional " si sucede esto debo hacer esto, en otra forma si no se cumple el condicional anterior hago esto, pero si no ocurre la condición hago esto"  y si se quiere comprender en orden se debe tener en cuenta lo siguiente:

```Java

1 import java.util.Scanner;

2 public class SentenciaIf{
   3 public static void main(String args []){
      4 System.out.print("Ingrese un numero de mes: ");
          5 int mes1 = scanner.nextInt();
      6 if (mes1 == 1){
          7 System.out.print("Enero"); 
     8  }else if (mes1 == 2) {
     9      System.out.print("Febrero");
     10 }else{
     11     System.out.print("Numero no valido"); 
        }  
   }
}
```

* Sentencia switch: esta sentencia, toma el caso condicional por medio de casos  y si se quiere comprender en orden se debe tener en cuenta lo siguiente:

```Java

1 import java.util.Scanner;

2 public class SentenciaIf{
   3 public static void main(String args []){
      4 System.out.print("Ingrese un numero de mes: ");
      5     int mes = scanner.nextInt();
        
      6 switch (mes) {
      7     case 1: System.out.print("Enero");
      8         break;
      9     case 2: System.out.print("Febrero");
      10         break;
      11    case 3: System.out.print("Abril");
      12         break;
      13    case 4: System.out.print("Junio");
      14         break;        
      15    default: System.out.print("Numero no valido");
      16         break;
        } 
   }
}
```
## Estructuras de repetición
Se ejecuta un conjunto el cual será repetido hasta cumplir cierta condición, algunas de las sentencias que se dan aquí son sentencias de tipo; **while, do-while, y for**

**Sentencias**

Estas sentencias que son repetitivas, hay que entender que van a hacer una tarea hasta cumplir la condición dada, o en algunos casos hasta que no se cumpla la condición dada, maneras diferente sintaxis pero al fin y al cabo son bucles

**Comprensión de un bucle**

```Java
import java.util.Scanner;

public class Bucle{
   public static void main (String args[]){
        for (int num2 = 0; num2 <=10; num2++){
            System.out.print("\nTexto " + num2); 
        }//Vuelve a probar  for cada que hace un intento

   }
}

```
* for ( VARIABLE DE CONTROL ; CONDICIÓN ; MODIFICADOR ){
    SENTENCIAS A REALIZAR}
* do-while
    do{Sentencia}while(Condicion);
*  while
    While(condicion){Sentencias a realizar hasta que se cumpla la condicion}
 
**Break and continue**
* Break: Permite terminar un bucle por completo, no importa si quedan repeticiones.
* Continue : Interrumpe el ciclo momentáneo, pero continua el bucle.

```Java
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Salta el número 5
            }
        System.out.println(i);
```
***Try-Catch***
* Maneja errores en tiempo de ejecución, hace que la ejecución continue sin importar el error evitando que se detenga abruptamente

```Java
   try {
    // Código que puede causar una excepción
   } catch (ExceptionTipo ex) {
    // Código que maneja la excepción
   }
```
* Try: contiene la sentencia que puede generar un error o excepción, si ocurre algun error dentro de "try" la sentencia se detiene en ese punto y pasa a la instrucción "catch"
* Catch: Puede manejar distintos tipos de excepciones

# Tercera sesión
## Metodos(Funciones)


