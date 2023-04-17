package LacosRepeticao;

import java.util.Scanner;

public class ForExercise01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numIni, numFin, i, multiple1=3, multiple2=5;

        System.out.println("Escreva o PRIMEIRO número");
        numIni = sc.nextInt();
        System.out.println("Escreva o SEGUNDO número");
        numFin = sc.nextInt();

        if (numIni<numFin){

            for (i= numIni; i<= numFin ; i++ ) {

                if (i % multiple1 == 0 && i % multiple2 ==0 )

                    System.out.println(i + " é múltiplo de "+multiple1+ " e "+multiple2);

            }


        } else {
            System.out.println("Intervalo Invávlido");
        }










    }
}
