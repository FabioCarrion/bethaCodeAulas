package exercicioAnimal;

public class Gato extends Animal {
    public Gato(String nome, String raca, String som, int qtdPata) {
        super(nome, raca, som, qtdPata);
    }

    public Gato(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return super.getSom() ;
    }
}
