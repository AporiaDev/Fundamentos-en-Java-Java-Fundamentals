import java.util.Scanner;

public class EstructurasControl{

    public static void main ( String args []){
        Scanner scanner = new Scanner(System.in);

        //Ejemplo operadores relacionales
        int numero1;
        int numero2;
        System.out.print("ingrese el primer valor: ");
            numero1 = scanner.nextInt();
        System.out.print("ingrese el segundo valor: ");
            numero2 = scanner.nextInt();
        System.out.println("El numero 1 es mayor que el numero 2? " + Boolean.toString(numero1 > numero2));

        //Ejemplo operadores logicos
        System.out.println(true||false);

        //Ejemplo sentencia if, if-else en Java
        int edad;
        System.out.print("ingrese su edad: ");
            edad = scanner.nextInt();
        if ( edad >= 18 ){
            System.out.print("Usted es mayor de edad");
        }else {
            System.out.print("Usted no es mayor de edad\n");
        }

        //Ejemplo switch
        System.out.print("Ingrese un numero de mes: ");
            int mes = scanner.nextInt();
        
        switch (mes) {
            case 1: System.out.print("Enero");
                break;
            case 2: System.out.print("Febrero");
                break;
            case 3: System.out.print("Abril");
                break;
            case 4: System.out.print("Junio");
                break;        
            default: System.out.print("Numero no valido");
                break;
        }
        
        //Ejemplo de else if 
        System.out.print("Ingrese un numero de mes: ");
            int mes1 = scanner.nextInt();
        if (mes1 == 1){
            System.out.print("Enero"); 
        }else if (mes1 == 2) {
            System.out.print("Febrero");
        }else{
            System.out.print("Numero no valido"); 
        }     
        
        //Ejemplo sentencia while
        int num = 0;
        while(num <= 10){
            System.out.print("\nTexto " + num);
            num ++;
        }
        //Ejemplo sentecia for
        for (int num2 = 0; num2 <=10; num2++){
            System.out.print("\nTexto " + num2); 
        }
    }
 }

/*Estructuras de control
 * Estructuras secuenciales : leen cada linea de codigo de forma secuencial
 * Estructuras de repeticion : Se ejecuta un conjunto de funciones de forma repetitiva 
 * 
*/

/*Operadores relacionales y de igualdad
 * > mayor que
 * < menor que
 * >= mayor o igual que
 * <= menor o igual que
 * == igual que
 * != Distinto de
*/

/*Operadores logicos
 * && es and
 * || or
 * ! not 
 */

/*Sentencia if, if - else, switch, if-else-if
 * De la forma if (Condicion){Sentencias a realizar}
    funciona como condicional de ordenes
 * De la forma if (condicion){Sentencias a realizar} else{Sentencias a realizar}
 * De la forma switch (valor entero){
    caso  1: sentencias;
                break;
    default : sentencias;
                break;}
 *Casi lo mismo que switch, se ejecuta de la siguiente forma
    De la forma if (Condicion){Sentencias a realizar} else if (condicio){sentencia}    
*/

/*Sentencia de repeticion while, hace parte de las estructuras de condicion
 * While(condicion){Sentencias a realizar hasta que se cumpla la condicion}
 */

/*Sentencia for
 * for ( VARIABLE DE CONTROL ; CONDICIÓN ; MODIFICADOR ){
    SENTENCIAS A REALIZAR}
 */

/*Sentencia do-while
 * do{Sentencia}while(Condicion);
 */

/*Break and continue
 * Break: Permite terminar un bucle por completo
 * Continue : Interrumpe el ciclo momentaneo pero continua el bucle
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Salta el número 5
            }
        System.out.println(i);
 */