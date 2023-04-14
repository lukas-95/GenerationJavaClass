package LacosCondicionais;

import java.util.Scanner;

public class IfExercise01 {


    public static void main(String[] args) {
        int numA, numB, numC, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        numA = sc.nextInt();

        System.out.println("Digite o número B: ");
        numB = sc.nextInt();

        System.out.println("Digite o número C: ");
        numC = sc.nextInt();

        sum = numA + numB;

        if (sum > numC) {
            System.out.println(numB + " + " + numA + " = " + sum + " > " + numC);
            System.out.println("A de A + B é Maior do que C");
        } else if (sum < numC) {
            System.out.println(numB + " + " + numA + " = " + sum + " < " + numC);
            System.out.println("A de A + B é Menor do que C");
        } else {
            System.out.println(numB + " + " + numA + " = " + sum + " = " + numC);
            System.out.println("A de A + B é Igual a C");
        }
    }
}
