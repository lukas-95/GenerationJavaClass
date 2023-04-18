package VetoresEMatrizes;

import java.util.Scanner;

public class ArrayExercise01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                        //0/1/2/3/4/5/6/7/8/9
        int[] intArray = {2,5,1,3,4,9,7,8,10,6};
        int num,i;
        boolean found = false;

        System.out.println("Digite o número que você deseja encontrar: ");
        num = sc.nextInt();

        for (i=0;i < intArray.length; i++) {

            if (intArray[i] == num){
                found = true;
                break;

            }
        }
        if (found){
            System.out.println("O número "+ num + " está localizado na posição " + i);
        }else {
            System.out.println("O número "+ num + " NÃO FOI ENCONTRADO");
        }
    }
}

