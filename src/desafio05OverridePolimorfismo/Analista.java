package desafio05OverridePolimorfismo;

public class Analista  extends Funcionario{
    public Analista(Integer id, String nome, String CPF, Double salarioBruto) {
        super(id, nome, CPF, salarioBruto);
    }

    public Analista(Integer id, String nome, String CPF) {
        super(id, nome, CPF);
    }

    public Analista(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
        return super.getSalarioBruto() * 1.10;
    }
}
