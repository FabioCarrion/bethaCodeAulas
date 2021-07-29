package exercicioAnimal;

public class Animal {
    private String nome;
    private String raca;
    private String som ;
    private int qtdPata ;

    public Animal(String nome, String raca, String som, int qtdPata) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
        this.qtdPata = qtdPata;
    }

    public Animal(String nome, String raca, String som) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public int getQtdPata() {
        return qtdPata;
    }

    public void setQtdPata(int qtdPata) {
        this.qtdPata = qtdPata;
    }

    public String getSom(String somAMais){
        return this.som + somAMais ;

    }
}
