import java.util.Scanner;

public class JavaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columna = scanner.nextInt();
        String[][] matriz = new String[fila][columna];

        for (int i = 0; i<matriz.length ; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if (j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");}
            }
         System.out.println("\n");           
        }
        for (int i = 0; i<matriz.length ; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if (j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");}
            }
            System.out.println("\n");     
        }         
        
    }
}