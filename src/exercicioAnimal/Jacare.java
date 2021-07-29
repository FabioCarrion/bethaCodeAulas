package exercicioAnimal;

public class Jacare extends Animal{

    public Jacare(String nome, String raca, String som, int qtdPata) {
        super(nome, raca, som, qtdPata);
    }

    public Jacare(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Jacare(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom(){
        return super.getSom() ;
    }
}
