package LacosDeDecisao;

public class IfElse {
    public static void main(String[] args) {
        int estoque = 50;

        if (estoque >= 100) {
            System.out.println("produto suficiente");
        } else if (estoque < 100 && estoque > 50) {
            System.out.println("alerta : avaliar possibilidade de novo pedido");
        } else {
            System.out.println("atenção faca um novo pedido");
        }
    }
}
