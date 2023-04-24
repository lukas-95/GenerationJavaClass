package QueueStack;

public class QueueAulaAssincrona {
    private  int maxSize;
    private  int[] queue;
    private  int start;
    private  int end;
    private int sum;

    public QueueAulaAssincrona(int s) {
        maxSize =s;
        queue = new int[s];
        start = 0;
        end =-1;
        sum =0;
    }

    public int getStart() {
        return queue[start];
    }

    public int getEnd() {
        return queue[end];
    }
    public boolean verifyFull(){
        return sum == maxSize;
    }
    public boolean verifyEmpty(){
        return sum ==0;
    }
    public void enqueue(int item){
        if (verifyFull()){
            System.out.println("A fiila ja está cheia, nao consigo colocar nadar aqui");
        } else {
            end++;
            queue[end] = item;
            sum++;
        }
    }



    public void dequeue (){
        if (verifyEmpty()){
            System.out.println("a fila esta vazia, não temos nada para remover");
        }else {
            System.out.println("Item removido da fila: " + queue[start]);
            start++;
            sum--;
        }
    }





}
