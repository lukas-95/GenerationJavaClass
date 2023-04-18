package LacosRepeticao;

import java.util.Scanner;

public class WhileExercise04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age, gender, cat, cBackend = 0, cWomanFront = 0, cManMobile40 = 0, cWomanFull30 = 0;
        String choice = "s";


        while (choice.equalsIgnoreCase("s")) {
            System.out.println("Digite a Idade");
            age = sc.nextInt();
            while (age < 0 || age > 140) {
                System.out.println("Idade inválida digite sua Idade");
                age = sc.nextInt();
            }
            System.out.println("Digite o seu Gênero: ");
            System.out.println("1--Masculino\n2--Feminino\n3--Não se aplica");
            gender = sc.nextInt();
            while (gender < 1 || gender > 3) {
                System.out.println("Gênero inexistente, digite o seu Gênero: ");
                System.out.println("1--Masculino\n2--Feminino\n3--Não se aplica");
                gender = sc.nextInt();
            }

            System.out.println("Digite a Categoria: ");
            System.out.println("1--BackEnd\n2--FrontEnd\n3--Mobile\n4--FullStack");
            cat = sc.nextInt();

            while (cat < 1 || cat > 4) {
                System.out.println("Categoria inexistente, digite a Categoria: ");
                System.out.println("1--BackEnd\n2--FrontEnd\n3--Mobile\n4--FullStack");
                cat = sc.nextInt();
            }
            System.out.println("Deseja continuar (S/N): ");
            choice = sc.next();

            if (cat == 1) {
                cBackend++;
            }
            if (gender == 2 && cat == 2) {
                cWomanFront++;
            }
            if (age > 40 && gender == 1 && cat == 3) {
                cManMobile40++;

            }
            if (age < 30 && gender == 2 && cat == 4) {
                cWomanFull30++;
            }

        }

        System.out.println("Total de pessoas Backend: " + cBackend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + cWomanFront);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + cManMobile40);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + cWomanFull30);

    }


}
