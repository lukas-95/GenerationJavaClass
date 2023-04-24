package QueueStack;

public class StackAulaAssincrona {
        private int maxSize;
        private int [] stack;
        private int top;

        public StackAulaAssincrona(int s) {
            maxSize = s;
            stack = new int[s];
            top = -1;
        }

        public void push (int item){
            if (top == maxSize - 1){
                System.out.println("A pilha está cheia, nao posso adicionar mais nada");
            } else {
                top++;
                stack[top] = item;
            }
        }
        public void pop ( ){
            if (top == -1){
                System.out.println("A pilha está vazia, nem tem mais oque tirar daqui");
            } else {
                System.out.println("Elemento retirado da pilha: " + stack[top]);
            }
        }

        public int peek(){
            return stack[top];
        }

}
