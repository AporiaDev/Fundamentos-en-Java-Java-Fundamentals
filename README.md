# Java

## Primer "hola mundo" en Java

Para inicializarnos en el contexto de un lenguaje de programación, nunca esta de más empezar con nuestro primer **"Hola mundo"**, los lenguajes debido a su sintaxis en la mayoría de los casos tienen estructuras distintas, en el caso de Java nosotros inicializamos nuestro **"Hola mundo"** de la siguiente forma: 

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
Para facilitar la comprensión de lo que esta sucediendo se invita al lector a trabajar esta wiki en conjunto de un entorno de desarrolo o editor de código, todo esto con finalidades practicas.

## Ciclo de Vida de un Programa en Java

Cuando se ejecuta un programa en Java, ocurren una serie de procesos internos que el ser humano no ve a simple vista. Estos procesos permiten que el código interactúe correctamente con la computadora a través de la Máquina Virtual de Java (JVM).

---

### 1. Escritura del Código Fuente
Se escribe el algoritmo en un archivo de texto con extensión `.java`. Este archivo contiene el código fuente escrito en lenguaje Java, legible por humanos.

---

### 2. Compilación
Se utiliza el compilador de Java (`javac`) para traducir el archivo `.java` a un archivo `.class`.

- El archivo `.class` contiene **bytecode**, un código intermedio optimizado que **no depende del sistema operativo**.
- Este bytecode puede ser interpretado por cualquier sistema que tenga instalada la JVM.

---

## 3.Carga de Clases
La JVM inicia el programa y utiliza un componente llamado **Class Loader** para cargar todas las clases necesarias desde los archivos `.class`.

---

## 4. Verificación de Seguridad
Antes de ejecutar el bytecode, la JVM realiza una verificación de seguridad. Esta asegura que el código:

- No intente acceder a memoria no permitida.
- Cumpla con las reglas del lenguaje Java.

Esto garantiza que el bytecode es **seguro para ejecutarse**.

---

## 5. Inicialización de Memoria
La JVM reserva espacio en memoria para ejecutar el programa. En esta etapa:

- Se crean las áreas de memoria: **stack**, **heap**, **metaspace**, etc.
- Se inicializan los **bloques estáticos** de las clases antes de ejecutar el método `main`.

---

## 6. Ejecución del Programa
La JVM ejecuta el código empezando desde el método `main`. Durante la ejecución:

- Se crean objetos.
- Se hacen llamadas a métodos.
- La JVM administra la memoria de forma dinámica.

---

### 7. Recolección de Basura (Garbage Collection)
El **Garbage Collector** se encarga de eliminar de la memoria los objetos que ya no están en uso. Esto:

- Optimiza el rendimiento.
- Evita fugas de memoria.

---

### 8. Finalización
Cuando el método `main` termina su ejecución:

- Se finalizan todos los hilos activos (si los hay).
- Se libera la memoria utilizada.
- La JVM se apaga y finaliza el proceso.

---
## Variables en Java

Las **variables** son espacios de memoria reservados para almacenar datos durante la ejecución de un programa.  
Cada variable tiene un **tipo de dato** que determina el tipo de información que puede contener (por ejemplo: `int`, `double`, `String`, etc.).

Según el contexto donde se declaren, las variables en Java se clasifican en: Variables de instancia (Fuera de los metodos pero dentro de las clases, son para cada objeto),  Variables de clase(Son las variables estaticas), Variables locales(Son estas que se declaran dentro de los metodos), Variables Parametros(Son estas variables que se retornan en un metodo).

## Tipos de datos o varibles en Java
Los tipos de datos son las categorías por las cuales yo puedo identificar un elemento o variable con el cual será identificado en el sistema ejecutado en nuestra secuencia de programación. En java por excelencia hay dos tipos de datos; **los primitivos o simples y los que son por referencia**.

**Datos primitivos**


![image](https://github.com/user-attachments/assets/52f4c1af-5e01-47fd-bb06-0bda66f50052)
 
Los tipos de datos byte, short, int y long permiten trabajar con números enteros, los tipos float y double, se usan para trabajar con valores con punto decimal. El tipo de dato boolean, se utiliza para trabajar con valores de verdad, los únicos valores de tipo boolean son false y true. El tipo de dato char es un carácter Unicode. Unicode es un estándar que define los caracteres necesarios para poder escribir la mayoría de los idiomas.

**Datos referencia**

En Java, las **variables de tipo referencia** son aquellas que **no almacenan directamente un valor**, sino **una dirección de memoria** que apunta a un **objeto** ubicado en el **heap** (memoria dinámica).

![image](https://github.com/user-attachments/assets/a4a628dd-6484-4a2e-9a71-9d6498e638d6)

### ¿Cómo hacer una concatenación de texto?
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

### Operadores aritméticos

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

**Tipo de comentario en Java :**
 * 1)/* Colección
 * 2)// Una linea

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


## Metodos(Funciones)

Los metodos en Java son aquellos comportamientos que podemos inferir de unas variables, o en esta sección como van a interactuar estas con las demas variables.

```Java
    public class PruebaMetodo{
         public static void main(String arg[]){
            int resultado = sumaNumeros(1,2);
            System.out.println(resultado);
         }
         public static int sumaNumeros(int numberOne, numberTwo){
               return numberOne + numberTwo;
         }
   }
```

Usamos static porque estamos llamando sin crear un objeto

# Arreglos y Listas en Java

En Java, los arreglos y listas son estructuras de datos utilizadas para almacenar múltiples elementos. A continuación, se explican sus características y diferencias.

##  Arreglos en Java
Un **arreglo (array)** es una estructura de datos que almacena un conjunto de elementos del mismo tipo en posiciones contiguas de memoria.

### Características:
- Tamaño fijo (se define al momento de su creación).
- Acceso rápido a los elementos mediante índices.
- Almacenan datos homogéneos.

###  Declaración y uso de arreglos:
```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Declaración de un arreglo de tamaño 5
        numeros[0] = 10; // Asignación de valores
        numeros[1] = 20;
        
        // Recorrido del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + numeros[i]);
        }
    }
}
```

###  Declaración e inicialización en una sola línea:
```java
int[] numeros = {1, 2, 3, 4, 5};
```

###  Arreglos multidimensionales:
```java
int[][] matriz = {{1, 2}, {3, 4}};
System.out.println(matriz[0][1]); // Salida: 2
```

---

##  Listas en Java
Una **lista (List)** es una estructura de datos dinámica proporcionada por la API de Java a través de la interfaz `List` en el paquete `java.util`.

###  Características:
- Tamaño dinámico (se puede agregar o eliminar elementos sin preocuparse por la capacidad).
- Permite almacenar datos heterogéneos con genéricos (`List<Object>`).
- Forma parte del **framework de colecciones de Java**.

### Implementaciones de List:
1. **ArrayList**: Basado en un arreglo dinámico (rápido en acceso pero lento en inserciones/eliminaciones).
2. **LinkedList**: Basado en una lista doblemente enlazada (rápido en inserciones/eliminaciones, más lento en acceso).

###  Uso de ArrayList:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Luis");
        
        // Recorrer lista con for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
```

###  Uso de LinkedList:
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.addFirst(5); // Agregar al inicio
        numeros.addLast(30); // Agregar al final
        
        System.out.println(numeros); // Salida: [5, 10, 20, 30]
    }
}
```


### Uso de Void
Void se utiliza o es necesario cuando no queremos devolver ningun dato, puede ser utilizado para mostrar un mensaje o modificar un valor dentro de los datos con los que estamos trabajando.

### Funcionamiento Heap y Stack

En Java, las referencias de objetos se almacenan en el stack, mientras que los objetos a los que apuntan viven en el heap. En el caso de los String, los literales como "Ana" se guardan en el String Pool, a menos que se cree una nueva instancia con new, lo cual genera un objeto nuevo en el heap

### Type casting
# Conversión de Tipos (Casting) en Java

La **conversión de tipos** en Java es el proceso mediante el cual se transforma un valor de un tipo de dato a otro.  
Este proceso puede ser:

- **Automático** (Widening)
- **Manual** (Narrowing o casting explícito)
##  Conversión Automática (Widening Casting)

- Se realiza **automáticamente** cuando se convierte un tipo más pequeño a uno más grande.
- No hay pérdida de información.

| De         | A           |
|------------|-------------|
| `byte`     | `short`     |
| `short`    | `int`       |
| `int`      | `long`      |
| `long`     | `float`     |
| `float`    | `double`    |

### Ejemplo:
```java
int i = 10;
double d = i; // conversión automática (int → double)
double j = (double) i;  // conversión Manual (int → double)
System.out.println(d); // 10.0
```

