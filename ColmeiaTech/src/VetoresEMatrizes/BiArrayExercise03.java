package VetoresEMatrizes;

import java.util.Scanner;

public class BiArrayExercise03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] num = new int[3][3];
        int row,column,firstDiagonalSum=0,secondDiagonalSum=0;
        String firstDiagonalValue="", secondDiagonalValue="";


        for (row=0;row<3;row++){
            for (column=0;column<3;column++){
                System.out.printf("\nDigite um número na posição[%d][%d]",row,column);
                num[row][column] = sc.nextInt();

                if (row == column){
                    firstDiagonalSum += num[row][column];
                    firstDiagonalValue += num[row][column]+" ";
                }

                if(row+column == 2){
                    secondDiagonalSum += num[row][column];
                    secondDiagonalValue += num[row][column]+ " ";

                }

            }
        }

        System.out.println("Elementos da diagonal principal: " + firstDiagonalValue);
        System.out.println("Elementos da diagonal secundária: " + secondDiagonalValue);
        System.out.println("Soma dos Elementos da Diagonal Principal: " + firstDiagonalSum);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + secondDiagonalSum);


    }
}
