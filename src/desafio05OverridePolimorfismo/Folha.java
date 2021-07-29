package desafio05OverridePolimorfismo;

public class Folha {
    private int id;
    private Funcionario funcionario;
    private Desconto[] descontos;
    private String data ;
    private Double salarioliquido ;

    public Folha(int id, Funcionario funcionario, String data) {
        this.id = id;
        this.funcionario = funcionario;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Desconto[] getDescontos() {
        return descontos;
    }

    public void setDescontos(Desconto[] descontos) {
        this.descontos = descontos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getSalarioliquido() {
        return salarioliquido;
    }

    public void setSalarioliquido(Double salarioliquido) {
        this.salarioliquido = salarioliquido;
    }
}
