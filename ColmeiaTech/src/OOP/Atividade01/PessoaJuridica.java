package OOP.Atividade01;

public class PessoaJuridica extends Client{

    long cnpj;
    String field;

    public PessoaJuridica(byte age, String branch, String name, boolean faithful, char socialRank, long cnpj, String field) {
        super(age, branch, name, faithful, socialRank);
        this.cnpj = cnpj;
        this.field = field;
    }
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void getInfo(){
        System.out.println("\nOur beloved client "+getName()+" under the CNPJ of "+getCnpj()+" from the field of "+getField()
                +" and have a branch on "+getBranch()+" are they a faithful client? "+isFaithful());

    }

}
