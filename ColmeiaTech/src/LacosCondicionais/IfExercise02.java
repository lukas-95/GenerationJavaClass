package LacosCondicionais;

import java.util.Scanner;

public class IfExercise02 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();


        if (num % 2 == 0 && num > 0) {
            System.out.println("O Número " + num + " é par e positivo!");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("O Número " + num + " é par e negativo!");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("O Número " + num + " é ímpar e positivo!");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println("O Número " + num + " é ímpar e negativo!");
        } else {
            System.out.println("O Número é 0 e é sempre PAR!");
        }
    }
}