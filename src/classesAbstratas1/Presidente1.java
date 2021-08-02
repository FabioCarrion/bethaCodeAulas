package classesAbstratas1;

public class Presidente1 extends Funcionario1 {

    public Presidente1(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao(){
        return super.getBonificacao() * 1.10 ;
    }
}
