package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionListExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nList = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
        int num, i;

        System.out.println("Digite o número: ");
        num = sc.nextInt();

        String result = ((nList.contains(num)) ? "O número " + num + " está na posição: " + nList.indexOf(num) : "O número " + num + " não foi encontrado!");
        System.out.println(result);

    }
}
