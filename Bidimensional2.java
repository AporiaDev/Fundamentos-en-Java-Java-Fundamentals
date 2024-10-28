import java.util.Scanner;

public class Bidimensional2 {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);
        // Declarar la matriz
        int calificaciones [][] = new int[2][3];
        int calificacioness [][] = new int[3][3];
        //Cargar valores
        calificaciones[0][0] = 34;
        calificaciones[0][1] = 42;
        calificaciones[0][2] = 12;
        calificaciones[1][0] = 12;
        calificaciones[1][1] = 7;
        calificaciones[1][2] = 98;

        //Listar el contenido
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("Calificación del estudiante " + (i+1) + " en la materia " + (j+1) + ": " + calificaciones[i][j]);
            }
        }
        for (int i = 0; i < calificacioness.length; i++) {
            for (int j = 0; j < calificacioness[i].length; j++) {
                System.out.print("Elemento [" +i + "]["+j+"]:");
                calificacioness[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < calificacioness.length; i++) {
            for (int j = 0; j < calificacioness[i].length; j++) {
                System.out.print(calificacioness[i][j] + "\t");
                
            }
            System.out.println();
        }
    }

}