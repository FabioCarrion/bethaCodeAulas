package desafio04Heranca;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private Character sexo;


    public PessoaFisica(){ };

    public PessoaFisica (String cpf, String rg, Character sexo) {
        super();
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.getId();
      }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getDocumentoPrincipal(){
        return getCpf();
    }
}
