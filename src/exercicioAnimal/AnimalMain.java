package exercicioAnimal;

public class AnimalMain {
    public static void main(String [] args){
        Animal animal = AnimalBuilder.criaAnimal("GATO","Tony","Gato","Miau", 4);
         System.out.println("Animal : " + animal.getSom());
        System.out.println("Som a mais : " + animal.getSom("hiii" ));
    }
}
