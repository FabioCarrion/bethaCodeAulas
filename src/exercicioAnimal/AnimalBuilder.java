package exercicioAnimal;

public class AnimalBuilder {

    public static Animal criaAnimal(String tipo ,String nome,String raca, String som, int qtdPata){
        if (tipo.equals("GATO")) {
            return new Gato(nome, raca,som, qtdPata);
        }
        if (tipo.equals("CAHORRO")) {
            return new Gato(nome, raca,som, qtdPata);
        }
        if (tipo.equals("JACARE")) {
            return new Gato(nome, raca,som, qtdPata);
        }

        return new Animal(nome,raca);

    }



}
