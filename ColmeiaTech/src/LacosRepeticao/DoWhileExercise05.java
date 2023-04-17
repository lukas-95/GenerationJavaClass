package LacosRepeticao;

import java.util.Scanner;

public class DoWhileExercise05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0, sum = 0;

        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num >= 0){
                sum += num;
            }

        } while (num != 0);

        System.out.println("A soma dos números positivos é: " + sum);


    }
}
