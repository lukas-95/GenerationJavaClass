package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estoque = new ArrayList();
        int op;

        do {
            System.out.println("\n\t\tMenu Estoque");
            System.out.println("(1) deseja ADICIONAR produtos ao estoque?");
            System.out.println("(2) deseja REMOVER  produtos ao estoque?");
            System.out.println("(3) deseja ATUALIZAR  produtos ao estoque?");
            System.out.println("(4) deseja VISUALIZAR  produtos ao estoque?");
            System.out.println("(0) deseja SAIR do programa");
            System.out.println("Digite sua opção: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o produto para ADICIONAR: ");
                    String prdAdd = sc.nextLine();
                    estoque.add(prdAdd);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Digite o produto para REMOVER: ");
                    String prdRmv = sc.nextLine();
                    if (estoque.contains(prdRmv)){
                        estoque.remove(prdRmv);
                    }else {
                        System.out.println("Produto não existe no estoque !!!");
                    }
                    System.out.println(estoque);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite o nome do produto para ATUALIZAR");
                    String verify = sc.nextLine();
                    System.out.println("Digite o nome do produto no lugar do"+ verify);
                    String update = sc.nextLine();

                    if (estoque.contains(verify)){
                        estoque.remove(verify);
                        estoque.add(update);
                    }else {
                        System.out.println("Produto não existe no estoque !!!");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Produtos no estoque");
                    System.out.println(estoque);
                    break;
                case 0:
                    System.out.println("Muito obrigado por utilizar nosso programa");
                    break;

                default:
                    System.out.println("Opção Inválida !!!");
            }
        } while (op != 0);







    }
}
