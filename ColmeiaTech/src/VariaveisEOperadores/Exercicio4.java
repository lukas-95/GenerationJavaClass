package VariaveisEOperadores;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        float n1, n2, n3, n4, dif;

        Scanner leia = new Scanner(System.in);

        System.out.println("Nota 1: ");
        n1 = leia.nextFloat();
        System.out.println("Nota 2: ");
        n2 = leia.nextFloat();
        System.out.println("Nota 3: ");
        n3 = leia.nextFloat();
        System.out.println("Nota 4: ");
        n4 = leia.nextFloat();

        dif = ((n1 * n2) - (n3 * n4));
        System.out.printf("\n Calculo: %.1f ", dif);

    }
}
