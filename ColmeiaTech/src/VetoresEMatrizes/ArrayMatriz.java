package VetoresEMatrizes;

import java.util.Scanner;

public class ArrayMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[3][3];
        int row, column, numberSum = 0, userRow, userColumn;

        for (row = 0; row < 3; row++) {

            for (column = 0; column < 3; column++) {
                System.out.println("Entre com um número: ");
                numbers[row][column] = sc.nextInt();
                numberSum += numbers[row][column];
            }
        }
        System.out.println("Valor da linha 1 e coluna 2: " + numbers[1][2]);

        System.out.println("Qual a LINHA que deseja ver a informação: ");
        userRow = sc.nextInt();
        System.out.println("Qual a COLUNA que deseja ver a informação: ");
        userColumn = sc.nextInt();

        System.out.println("Informação da linha" + userRow + " e na coluna "
                + userColumn + " tem o valorde : " + numbers[userRow][userColumn]);
        System.out.println("Somat'roio dos números da matriz é de: " + numberSum);


    }

}
