package desafio05OverridePolimorfismo;

public class Estagiario extends Funcionario {

    public Estagiario(Integer id, String nome, String CPF, Double salarioBruto) {
        super(id, nome, CPF, salarioBruto);
    }

    @Override
    public Double getSalarioBruto(){
        return super.getSalarioBruto() * 1.05;
    }
}
