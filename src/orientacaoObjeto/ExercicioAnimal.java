package orientacaoObjeto;

 public class ExercicioAnimal {

     public static void main(String[] args) {
         Animal animal = new Animal();
         animal.nome = "Toni";
         animal.altura = 0.30;
         animal.peso = 3.5;
         animal.som = "Au Au";
         animal.alturaPula = 2.56 ;

         animal.emitirSom();
         animal.AlturaPula();
     }
      public static class Animal {
          String nome;
          Double altura;
          Double peso;
          String som ;
          Double alturaPula;

       public void emitirSom(){
       System.out.println(" Emitir som  " + som);
          }

       public void AlturaPula(){
              System.out.println(" Animal pula  " + alturaPula);
         }

      }
 }
