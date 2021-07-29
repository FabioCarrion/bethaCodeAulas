package desafio02Java;

public class Exercicio06 {
    public static void main(String [] args){
         int resto ;
         for (int i = 15  ;  i <= 35; i++){
          resto = ( i % 2) ;
          if (resto == 0 ) {
              System.out.println("O quadrado de " + i + "  =  " + Math.pow(i,2));
          }

        }
    }
}
