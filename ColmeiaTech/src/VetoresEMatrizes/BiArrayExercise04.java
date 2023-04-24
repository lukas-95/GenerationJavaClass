package VetoresEMatrizes;

import java.util.Scanner;

public class BiArrayExercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[][] notas = new float[10][4];
        float[] media = new float[10];
        float sum = 0;
        int row, column;

        for (row = 0; row < notas.length; row++) {
            for (column = 0; column < notas[0].length; column++) {
                System.out.printf("\nDigite a nota na posição[%d][%d]", row, column);
                notas[row][column] = sc.nextFloat();
                sum += notas[row][column];
            }
            media[row] = sum / notas[0].length;
            sum = 0;
        }
        System.out.println("vetor");
        for (row = 0; row < media.length; row++) {
            System.out.printf(" %.1f |", media[row]);
        }
    }
}
