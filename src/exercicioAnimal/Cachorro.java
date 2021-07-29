package exercicioAnimal;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, int qtdPata) {
        super(nome, raca, som, qtdPata);
    }

    public Cachorro(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom(){
        return super.getSom()  ;
    }
}
