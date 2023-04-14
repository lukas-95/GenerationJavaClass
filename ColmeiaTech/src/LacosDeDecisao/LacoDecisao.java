package LacosDeDecisao;

import java.util.Scanner;

public class LacoDecisao {

    public static void main(String[] args) {

        float n1,n2,n3,media;
        int op;


        Scanner ler = new Scanner(System.in);


        System.out.println( "Entre com a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println( "Entre com a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println( "Entre com a terceira nota: ");
        n3 = ler.nextFloat();


        media = (n1+n2+n3)/3;
        System.out.printf("Média aritmética: %.2f", media);

        if (media >=7 && media<=10) {
            System.out.println("\nAlune Aprovade!!!");
        } else if (media>= 5 && media<7) {
            System.out.println("\nAlune de EXAME!!!");
        } else if (media>=0 && media<5) {
            System.out.println("\nAlune Reprovade!!!");
        }
        else {
            System.out.println("\nMédia fora do intervalo!!!");
        }

        System.out.println("Esoclha um elogio para a Turma");
        System.out.println("====================");





    }

}
