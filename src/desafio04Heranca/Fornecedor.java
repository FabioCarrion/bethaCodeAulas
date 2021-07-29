package desafio04Heranca;

public class Fornecedor {
    private String responsavel;
    private String observacao ;


    public Fornecedor(String responsavel, String observacao) {
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
