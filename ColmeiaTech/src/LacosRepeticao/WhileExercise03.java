package LacosRepeticao;

import java.util.Scanner;

public class WhileExercise03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0, c21 = 0, c50 = 0;


        while (age >= 0) {

            System.out.println("Digite uma idade: ");
            age = sc.nextInt();

            if (age < 21 && age >= 0) {

                c21++;
            } if (age > 50){
                c50++;
            }

        }
        System.out.println("Total de pessoas menores de 21 anos: " + c21);
        System.out.println("Total de pessoas maiores de 50: " + c50);


    }
}
