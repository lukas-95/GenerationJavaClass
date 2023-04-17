package LacosRepeticao;

import java.util.Scanner;

public class ForExercise02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count, num, evenCount = 0, oddCount = 0;

        for (count = 1; count <= 10; count++) {
            System.out.println("Digite o " + count + "º número: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total de números pares: " + evenCount);

        System.out.println("Total de números pares: " + oddCount);

    }
}
