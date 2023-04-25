package OOP.Atividade01;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client((byte) 27,2,"Lucas Reck", true, 'b');
        Client client2 = new Client((byte) 35,1,"Reck Lucas", false, 'a');

        client1.infoPrint();
        client2.infoPrint();

    }

}
