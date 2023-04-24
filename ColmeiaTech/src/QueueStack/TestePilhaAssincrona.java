package QueueStack;

public class TestePilhaAssincrona {

    public static void main(String[] args) {
        StackAulaAssincrona stack = new StackAulaAssincrona(3);

        stack.push(10);
        System.out.println("Elemento adicionado ao topo: " + stack.peek());
        stack.push(20);
        System.out.println("Elemento adicionado ao topo: " + stack.peek());
        stack.push(30);
        System.out.println("Elemento adicionado ao topo: " + stack.peek());
        stack.push(40);
        System.out.println("Elemento adicionado ao topo: " + stack.peek());
        stack.pop();
    }
}
