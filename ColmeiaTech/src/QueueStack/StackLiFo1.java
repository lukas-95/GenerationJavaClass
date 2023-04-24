package QueueStack;

import java.util.Iterator;
import java.util.Stack;

public class StackLiFo1 {
    public static void main(String[] args) {
        Stack<String> lifo = new Stack<>();
        int i;

        lifo.push("Green book");
        lifo.push("Yellow book");
        lifo.push("Pink book");
        lifo.push("Red book");
        lifo.push("Black book");


        System.out.println("Elementos da pilha " + lifo);
        System.out.println("Retirar elemento: " + lifo.pop());
        System.out.println("Elemento no topo da pilha: "+ lifo.peek());
        System.out.println("Adicionar um elemento específico na pilha: " + lifo.push("White book"));
        System.out.println("Ver a pilha: " + lifo);
        System.out.println("Tamanho da pilha: "+ lifo.size());
        System.out.println("Verificar se o Silver book está na pilha " + lifo.contains("Pink book"));
        System.out.println("Exibir elemntos a pilha usando o ITERATOR..... ");

        Iterator<String> iterator = lifo.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        lifo.clear();

        System.out.println(lifo);
        System.out.println("Verificar se a pilha está vazia " + lifo.isEmpty());





    }
}
