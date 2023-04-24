package QueueStack;

public class TesteFilaAssincrona {
    public static void main(String[] args) {
        QueueAulaAssincrona queue = new QueueAulaAssincrona(3);

        queue.enqueue(10);
        System.out.println("Item adicionado na fila: " + queue.getEnd());
        queue.enqueue(20);
        System.out.println("Item adicionado na fila: " + queue.getEnd());
        queue.enqueue(30);
        System.out.println("Item adicionado na fila: " + queue.getEnd());
        queue.enqueue(40);
        queue.dequeue();




    }
}
