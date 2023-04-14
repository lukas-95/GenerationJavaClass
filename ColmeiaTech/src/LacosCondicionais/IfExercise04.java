package LacosCondicionais;

import java.util.Scanner;

public class IfExercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1, word2, word3;


        System.out.println("Entre com a primeira palavra");
        word1 = sc.nextLine();
        System.out.println("Entre com a segunda palavra");
        word2 = sc.nextLine();
        System.out.println("Entre com a terceira palavra");
        word3 = sc.nextLine();

        if (word1.equalsIgnoreCase("Vertebrado")) {
            if (word2.equalsIgnoreCase("Ave")) {
                if (word3.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("Águia");
                } else {
                    System.out.println("Pomba");
                }
            } else {
                if (word3.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Homem");
                } else {
                    System.out.println("Vaca");
                }
            }

        } else {
            if (word2.equalsIgnoreCase("inseto")) {
                if (word3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else {
                    System.out.println("Lagarta");
                }
            } else {
                if (word3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                } else {
                    System.out.println("Minhoca");
                }
            }
        }
    }
}
