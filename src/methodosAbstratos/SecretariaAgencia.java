package methodosAbstratos;

public class SecretariaAgencia extends Secretaria{

    public SecretariaAgencia(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao(){
        return super.getBonificacao() * 1.25 ;
    }

}
