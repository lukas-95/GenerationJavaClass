package VetoresEMatrizes;

import java.util.Scanner;

public class ArrayVetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] avg = new float[4];
        float n1, n2, n3, avgSum = 0, generalAvg = 0, highAvg = 0;
        int x;

        for (x = 0; x < 4; x++) {

            System.out.println("Entre com a primeira nota: ");
            n1 = sc.nextFloat();
            System.out.println("Entre com a segunda nota: ");
            n2 = sc.nextFloat();
            System.out.println("Entre com a terceira nota: ");
            n3 = sc.nextFloat();

            avg[x] = (n1 + n2 + n3) / 3;
            avgSum += avg[x];

            if (highAvg < avg[x]) {

                highAvg = avg[x];
            }
        }

        generalAvg = avgSum / 4;

        System.out.println("A média geral foi de: " + generalAvg);
        System.out.println("A MIOR média foi de: " + highAvg);

        for (x=0;x<4;x++){

            System.out.println("a média do aluno "+(x+1)+" foi de : " +avg[x]);

        }

    }

}
