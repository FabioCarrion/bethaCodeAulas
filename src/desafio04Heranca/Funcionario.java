package desafio04Heranca;

public class Funcionario {
    private Double salarioBruto = 20000.00;
    private Double salarioLiquido ;
    private Double dissidio;

    public Funcionario(Double salarioBruto, Double salarioLiquido, Double dissidio) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.dissidio = dissidio;
    }


    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return this.salarioLiquido = salarioBruto -(salarioBruto * 0.27);
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Double getDissidio() {
        return dissidio  ;
    }

    public void setDissidio(Double dissidio) {
        this.dissidio = dissidio;
    }

    void aplicaDissidio(){
        salarioBruto += salarioBruto*dissidio;
    }
}
