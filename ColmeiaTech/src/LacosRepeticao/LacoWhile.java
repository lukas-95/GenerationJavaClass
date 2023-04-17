package LacosRepeticao;

import java.util.Scanner;

public class LacoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,evenCount=0,oddSum=0;

        System.out.println("Entre com um número: ");
        num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {

                evenCount++;

            }else {
                oddSum += num;
            }
            System.out.println("Digite o número:");
            num = sc.nextInt();
        }
        System.out.println("Quantidade de números PARES:" + evenCount);
        System.out.println("Somatório dos números ÍMPARES:" + oddSum);


    }
}

