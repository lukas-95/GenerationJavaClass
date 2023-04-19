package Collections;

import java.util.*;

public class CollectionAulaAssincrona {


    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();


        notas.add(7.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);

        // Mostra na tela todas as notas inseridas
        System.out.println("Notas cadastradas: " + notas.toString());
        // Mostra uma determinada nota existe na lista?
        System.out.println("A nota 5 existe na lista ? " + notas.contains(5d));

        notas.set(1, 6.0d);
        System.out.println("A nota 5 foi alterada para 6: " + notas.toString());

        notas.remove(1);
        System.out.println("Anota 4 foi apagada: " + notas.toString());

        // Checa se a lista está vaiza
        System.out.println("A lista esta vazia ? " + notas.isEmpty());
        // Exibe o tamanho da lista
        System.out.println("O tamanho da lista é ? " + notas.size());
        // Exibe o maior da lista
        System.out.println("O maior valor da lista é ? " + Collections.max(notas));
        // Exibe o menor da lista
        System.out.println("O maior valor da lista é ? " + Collections.min(notas));
        // Limpa a lista
        notas.clear();
        System.out.println("A lista está vazia: " + notas.toString());

    }
}
