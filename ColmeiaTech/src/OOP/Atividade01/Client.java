package OOP.Atividade01;

public class Client {

    private byte age;
    private String branch;
    private String name;
    private boolean faithful;
    private char socialRank;

    public Client(byte age, String branch, String name, boolean faithful, char socialRank) {
        this.age = age;
        this.branch = branch;
        this.name = name;
        this.faithful = faithful;
        this.socialRank = socialRank;
    }
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFaithful() {
        return faithful;
    }

    public void setFaithful(boolean faithful) {
        this.faithful = faithful;
    }

    public char getSocialRank() {
        return socialRank;
    }

    public void setSocialRank(char socialRank) {
        this.socialRank = socialRank;
    }

    public void getInfo(){
        System.out.printf("\n\nO %s tem %d anos, é da filial %s, pertence a classe %C e ele é fiel ? %B", name,age,branch,socialRank,faithful );

    }

}
