package LacosRepeticao;

import java.util.Scanner;

public class LacoFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        float n1, n2, n3, average, averageSum=0, generalAverage;

        for (x=1; x<=4;x++) {
            System.out.println("Entre com a primeira nota: ");
            n1 = sc.nextFloat();
            System.out.println("Entre com a segunda nota: ");
            n2 = sc.nextFloat();
            System.out.println("Entre com a terceira nota: ");
            n3 = sc.nextFloat();

            average = (n1+n2+n3)/3;
            System.out.printf("Média do alune %d: foi de %.2f", x, average);
            System.out.println();

            averageSum += average;
        }

        generalAverage = averageSum / 4;
        System.out.printf("\nMédia geral foi de : %.2f", generalAverage);




    }

}