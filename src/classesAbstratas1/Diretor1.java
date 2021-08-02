package classesAbstratas1;

public class Diretor1 extends Funcionario1 {
    public Diretor1(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao(){

        return super.getBonificacao() * 1.20 ;
    }

}
