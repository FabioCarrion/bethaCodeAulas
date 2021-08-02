package classesAbstratas1;

public class Gerente1 extends Funcionario1 {

    public Gerente1(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao(){
        return super.getBonificacao() * 1.15 ;
    }
}
