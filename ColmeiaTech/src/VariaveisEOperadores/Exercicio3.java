package VariaveisEOperadores;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        float grossSalary, workOvertime, netSalary, nightShift, salaryDeduction;

        Scanner sc = new Scanner(System.in);

        System.out.println("Salário Bruto: ");
        grossSalary = sc.nextFloat();
        System.out.println("Adicional Noturno: ");
        nightShift = sc.nextFloat();
        System.out.println("Horas Extras: ");
        workOvertime = sc.nextFloat();
        System.out.println("Descontos: ");
        salaryDeduction = sc.nextFloat();


        netSalary = grossSalary + nightShift + (workOvertime * 5) - salaryDeduction;
        System.out.printf("Salário Líquido: %.2f", netSalary);


    }
}
