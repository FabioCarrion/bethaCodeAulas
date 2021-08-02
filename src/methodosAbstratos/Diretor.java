package methodosAbstratos;

public class Diretor extends Funcionario {
    public Diretor(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao(){

        return super.getBonificacao() * 1.20 ;
    }

}
