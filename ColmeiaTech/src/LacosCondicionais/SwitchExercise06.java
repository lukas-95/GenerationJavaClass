package LacosCondicionais;

import java.util.Scanner;

public class SwitchExercise06 {
    public static void main(String[] args) {

        int codigoCargo;
        String name, cargo;
        float oldSalary, adjustment, newSalary;


        Scanner sc = new Scanner(System.in);

        System.out.println("Tabela: ");
        System.out.println("1 - Gerente ---------10%");
        System.out.println("2 - Vendedor --------7%");
        System.out.println("3 - Supervisor ------9%");
        System.out.println("4 - Motorista -------6%");
        System.out.println("5 - Estoquista ------5%");
        System.out.println("6 - Tecnico de TI ---8%");

        System.out.println("Qual o seu nome: ");
        name = sc.nextLine();

        System.out.println("Qual o código do seu Cargo: ");
        codigoCargo = sc.nextInt();

        System.out.println("Qual o seu salário: ");
        oldSalary = sc.nextFloat();

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.10f);
                System.out.printf("Salário: %.2f", newSalary);
                break;
            case 2:
                cargo = "Vendedor";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.07f);
                System.out.printf("Salário: %.2f ", newSalary);
                break;
            case 3:
                cargo = "Supervisor";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.09f);
                System.out.printf("Salário: %.2f ", newSalary);
                break;
            case 4:
                cargo = "Motorista";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.06f);
                System.out.printf("Salário: %.2f ", newSalary);
                break;
            case 5:
                cargo = "Estoquista";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.05f);
                System.out.printf("Salário: %.2f ", newSalary);
                break;
            case 6:
                cargo = "Tecnico de TI";
                System.out.println("Nome do colaborador: " + name);
                System.out.println("Cargo: " + cargo);
                newSalary = oldSalary + (oldSalary * 0.08f);
                System.out.printf("Salário: %.2f ", newSalary);
                break;
            default:
                System.out.println("CÓDIGO INVÁLIDO");

        }
    }
}