package desafio05OverridePolimorfismo;

public class Coordenador extends Funcionario {
    public Coordenador(Integer id, String nome, String CPF, Double salarioBruto) {
        super(id, nome, CPF, salarioBruto);
    }

    public Coordenador(Integer id, String nome, String CPF) {
        super(id, nome, CPF);
    }

    public Coordenador(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
    return super.getSalarioBruto() * 1.20;
    }

}
