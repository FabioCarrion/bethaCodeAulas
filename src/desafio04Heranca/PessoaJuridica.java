package desafio04Heranca;

public class PessoaJuridica extends Pessoa{
    private String cnpj ;
    private String inscricaoEstadual ;
    private String cnae ;

    public PessoaJuridica() {};
    public PessoaJuridica(String cnpj, String inscricaoEstadual, String cnae) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    @Override
    public String getDocumentoPrincipal(){
        return getCnpj();
    }
}
