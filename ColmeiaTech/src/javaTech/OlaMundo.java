package javaTech;

import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {

        String nome = "Lucas";
        int idade = 27;
        double altura = 1.82;
        float nota1, nota2, nota3, media;

        Scanner leia = new Scanner(System.in);

        System.out.println("Nome participante: " + nome);
        System.out.println("Idade participante: " + idade + " anos.");
        System.out.println("Altura participante: " + altura + " metros.");
        System.out.println("Entre com a primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Entre com a terceira nota: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n Média Aritmética: " + media);
        System.out.printf("\n Média Aritmética: %.2f ", media);


    }

}