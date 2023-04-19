package Collections;

import java.util.ArrayList;
import java.util.*;


public class CollectionListExercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> colorList = new ArrayList<>();
        int i;
        String color;

        for (i = 0; i < 5; i++) {
            System.out.println("Digite a cor para adicionar: ");
            color = sc.nextLine();
            colorList.add(color);
        }

        // feito pelo professor
        Iterator<String> iterator = colorList.iterator();
        System.out.println("Listar todas as cores: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(colorList);
        System.out.println("Cores ordenadas: ");
        for (String colors : colorList) {
            System.out.println(colors);
        }
        // feito por mim
        /*
        System.out.println("Listar todas as cores: ");
        for (String colors : colorList) {
            System.out.println(colors);
        }
        System.out.println("\n");
        System.out.println("Ordenar as cores: ");
        Collections.sort(colorList);
        for (String colors : colorList) {
            System.out.println(colors);
        }
        */

    }
}
