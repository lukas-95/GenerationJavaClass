package LacosCondicionais;

import java.util.Scanner;

public class IfExercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte age;
        String name;
        boolean firstTime;

        System.out.println("Digite seu nome: ");
        name = sc.next();
        System.out.println("Digite sua idade: ");
        age = sc.nextByte();
        System.out.println("É a primeira doação de Sangue? " + name);
        firstTime = sc.nextBoolean();

        if (age >= 18 && age <= 69) {
            if (age >= 60 && age <= 69 && firstTime == true) {
                System.out.println("Vocé não pode doar sangue");
            } else {
                System.out.println("Vocé pode doar sangue");
            }
        } else {
            System.out.println("Vocé não pode doar sangue");
        }
    }
}
