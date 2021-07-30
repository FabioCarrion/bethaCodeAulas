package desafio05OverridePolimorfismo;

class Estagiario extends Funcionario {

    public Estagiario(Integer id, String nome, String CPF, Double salarioBruto) {

        super(id, nome, CPF, salarioBruto);
    }

    public Estagiario(Integer id, String nome,String CPF){
        super(id,nome,CPF);
    }

    public Estagiario(Integer id, String nome ){
        super(id,nome);
    }
    @Override
    public Double getSalarioBruto(){
        return super.getSalarioBruto() * 1.05;
    }
}
