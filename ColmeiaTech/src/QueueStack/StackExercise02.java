package QueueStack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        byte op;
        String book;

        do {
            System.out.println("""
                    **************************************
                    1 - Adicionar Livro na Pilha
                    2 - Listar todos os Livros
                    3 - Retirar Livro da Pilha
                    0 - Sair              
                    **************************************
                    Entre com a opção desejada:
                    """);
            System.out.println("Digite uma opção: ");
            op = sc.nextByte();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    book = sc.nextLine();
                    stack.add(book);
                    Iterator<String> iterator1 = stack.iterator();
                    while (iterator1.hasNext()) {
                        System.out.println(iterator1.next());
                    }
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Livros na Pilha: ");
                    Iterator<String> iterator2 = stack.iterator();
                    while (iterator2.hasNext()) {
                        System.out.println(iterator2.next());
                    }
                    break;
                case 3:
                    if (stack.isEmpty()){
                        System.out.println("A Pilha está vazia! ");
                    } else {
                        stack.pop();
                        Iterator<String> iterator3 = stack.iterator();
                        while (iterator3.hasNext()) {
                            System.out.println(iterator3.next());
                        }
                        System.out.println("\nO livro foi retirado da pilha!");
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

