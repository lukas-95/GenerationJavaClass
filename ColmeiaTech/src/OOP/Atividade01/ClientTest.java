package OOP.Atividade01;
public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client((byte) 27,"Linux","Lucas Reck", true, 'B');
        Client client2 = new Client((byte) 35,"MacOS","Reck Lucas", false, 'A');
        PessoaFisica clientePF1 = new PessoaFisica((byte) 27,"Linux","Lucas Reck", true, 'B',"male", (byte)90);
        PessoaFisica clientePF2 = new PessoaFisica((byte) 27,"MacOS","Reck Lucas", false, 'A',"X", (byte)79);
        PessoaJuridica clienteCNPJ1 = new PessoaJuridica((byte)80, "Scranton", "Lucas Company",true, 'B', 546541314,"GAS");
        PessoaJuridica clienteCNPJ2 = new PessoaJuridica((byte)25, "Utica", "Reck Company",false, 'A', 674123714,"Technology");

        client1.getInfo();
        client2.getInfo();
        clientePF1.getInfo();
        clientePF2.getInfo();
        clienteCNPJ1.getInfo();
        clienteCNPJ2.getInfo();



    }

}
