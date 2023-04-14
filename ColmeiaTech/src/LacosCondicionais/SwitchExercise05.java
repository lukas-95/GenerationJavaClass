package LacosCondicionais;

import java.util.Scanner;

public class SwitchExercise05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte item;
        int quantity;
        String product;
        float price;

        System.out.println("Esse é o nosso cardápio: ");
        System.out.println("1 - Cachorro Quente ----R$10.00");
        System.out.println("2 - X-Salada -----------R$15.00");
        System.out.println("3 - X-Bacon ------------R$18.00");
        System.out.println("4 - Bauru --------------R$12.00");
        System.out.println("5 - Refrigerante -------R$8.00");
        System.out.println("6 - Suco de laranja ----R$13.00");
        System.out.println("Escolha o código do produto que deseja: ");
        item = sc.nextByte();


        switch (item) {
            case 1:
                System.out.println("Quantos Cachorro Quentes deseja?");
                quantity = sc.nextInt();
                product = "Cachorro Quente";
                price = 10;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;

            case 2:
                System.out.println("Quantos X-Saladas deseja?");
                quantity = sc.nextInt();
                product = "X-Salada";
                price = 15;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;

            case 3:
                System.out.println("Quantos X-Bacon deseja?");
                quantity = sc.nextInt();
                product = "X-Bacon";
                price = 18;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;
            case 4:
                System.out.println("Quantos Bauru deseja?");
                quantity = sc.nextInt();
                product = "Bauru";
                price = 12;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;
            case 5:
                System.out.println("Quantos Refrigerante deseja?");
                quantity = sc.nextInt();
                product = "Refrigerante";
                price = 8;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;
            case 6:
                System.out.println("Quantos Suco deseja?");
                quantity = sc.nextInt();
                product = "Suco de Laranja";
                price = 13;
                System.out.println("Produto: " + product);
                System.out.printf("Valor total : %.2f", quantity * price);
                break;
            default:
                System.out.println("CÓDIGO INVÁLIDO");

        }
    }
}
