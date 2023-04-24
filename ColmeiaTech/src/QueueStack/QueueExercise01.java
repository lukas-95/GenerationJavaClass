package QueueStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        byte op;
        String name;


        do {
            System.out.println("""
                    **************************************
                    1 - Adicionar Cliente na Fila
                    2 - Listar todos os Clientes
                    3 - Retirar Cliente da Fila
                    0 - Sair              
                    **************************************
                    Entre com a opção desejada:
                    """);
            System.out.println("Digite uma opção: ");
            op = sc.nextByte();

            switch (op){
                case 1:
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    queue.add(name);
                    Iterator<String> iterator1 = queue.iterator();
                    while (iterator1.hasNext()) {
                        System.out.println(iterator1.next());
                    }
                    break;

                case 2:
                    System.out.println("Lista de Clientes na Fila: ");
                    Iterator<String> iterator2 = queue.iterator();
                    while (iterator2.hasNext()) {
                        System.out.println(iterator2.next());
                    }
                    break;
                case 3:
                    if (queue.isEmpty()){
                        System.out.println("A fila está vazia! ");
                    } else {
                        queue.remove();
                        Iterator<String> iterator3 = queue.iterator();
                        while (iterator3.hasNext()) {
                            System.out.println(iterator3.next());
                        }
                        System.out.println("O cliente foi chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

    }
}
