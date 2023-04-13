package VariaveisEOperadores;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        float grade1, grade2, grade3, grade4, average;

        Scanner leia = new Scanner(System.in);

        System.out.println("Nota 1: ");
        grade1 = leia.nextFloat();
        System.out.println("Nota 2: ");
        grade2 = leia.nextFloat();
        System.out.println("Nota 3: ");
        grade3 = leia.nextFloat();
        System.out.println("Nota 4: ");
        grade4 = leia.nextFloat();
        average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.printf("\n Média final: %.1f ", average);

    }

}
