package OOP.Atividade01;

public class PessoaFisica extends Client{

    String gender;
    byte weight;

    public PessoaFisica(byte age, String branch, String name, boolean faithful, char socialRank, String gender, byte weight) {
        super(age, branch, name, faithful, socialRank);
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public void getInfo(){
        System.out.println("\n"+getName()+" is "+getAge()+" and is a "+getGender()
                +" and have "+getWeight()+"kg.");

    }
}
