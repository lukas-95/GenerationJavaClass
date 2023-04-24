package QueueStack;

import java.util.Iterator;
import java.util.*;

public class QueueFiFo1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int i;
        for (i = 0; i <= 10; i++) {
            queue.add(i);
        }

        System.out.println("\nElementos da fila " + queue);
        System.out.println("\nRemovendo elemento " + queue.remove());
        System.out.println("Elementos depois de REMOVER " + queue);
        System.out.println("\nAdicionando elemento 11 " + queue.add(11));
        System.out.println("Elementos depois de ADICIONAR o " + queue);
        System.out.println("\nPEGar ELEMENTO da fila " + queue.peek());
        System.out.println("\nPEGar TAMANHO da fila: " + queue.size());
        System.out.println("\nVERIFICAR um elemento da fila: " + queue.contains(5));
        System.out.println("\nExibir e Retirar PRIMEIRO elemento: "+ queue.poll());
        System.out.println("Fila atual " + queue);
        Iterator<Integer> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n LIMPAR a fila: ");
        queue.clear();
        System.out.println(queue);
        System.out.println("Verificar se a fila está vaiza: " + queue.isEmpty());

    }
}
