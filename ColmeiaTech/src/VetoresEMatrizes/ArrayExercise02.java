package VetoresEMatrizes;

import java.util.Scanner;

public class ArrayExercise02 {

    public static void main(String[] args) {

        Scanner door = new Scanner(System.in);
        int[] intArray = new int[10];
        int i, sum = 0;
        float avg;

        for (i = 0; i < intArray.length; i++) {
            System.out.println("Digite o número: ");
            intArray[i] = door.nextInt();
        }

        System.out.println("Elementos nos índices ímpares: ");
        for (i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + intArray[i] + " ");
            }
        }

        System.out.println("\nElementos pares: ");
        for (i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.print(" " + intArray[i] + " ");
            }
        }

        for (i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        avg = (float) sum / intArray.length;

        System.out.println("\nSoma: " + sum);

        System.out.printf("Média: %.2f",avg);
    }
}
