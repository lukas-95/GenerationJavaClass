package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetExercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();
        int n;
        boolean verify;
        num.add(2);
        num.add(5);
        num.add(1);
        num.add(3);
        num.add(4);
        num.add(9);
        num.add(7);
        num.add(8);
        num.add(9);

        System.out.println("Digite o número: ");
        n = sc.nextInt();
        verify = num.contains(n);

        System.out.println(verify ? "O número " + n + " foi encontrado " : "O número " + n + " foi encontrado ");










    }
}
