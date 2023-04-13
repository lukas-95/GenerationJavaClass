package VariaveisEOperadores;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        float oldSalary, abono, newSalary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Salário: ");
        oldSalary = sc.nextFloat();
        System.out.println("Digite o Abono: ");
        abono = sc.nextFloat();

        newSalary = oldSalary + abono;

        System.out.printf("Novo Salário: %.2f", newSalary);



    }
}


