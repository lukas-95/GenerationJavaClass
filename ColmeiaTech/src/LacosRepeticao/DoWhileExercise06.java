package LacosRepeticao;

import java.util.Scanner;

public class DoWhileExercise06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum=0, count = 0, multi = 3;
        double avg;


        do {
            System.out.println("Digite um número: ");
            num  = sc.nextInt();



            if (num != 0 && num % multi == 0){
                count ++;
                sum += num;
            }

        } while (num != 0);

        avg = (double) sum / count;

        System.out.printf("A média de todos os números múltiplos" +
                " de %d é: %.2f ",multi,avg );
    }
}
