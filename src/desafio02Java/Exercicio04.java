package desafio02Java;
import  java.util.Scanner;

/*Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número. */
public class Exercicio04 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("digite um numero de no maximo 4 digitos :");
        int i = s.nextInt();
        String digitos =  String.valueOf(i) ;
        int qtdCaracter  = digitos.length();

        if (qtdCaracter > 4){
            System.out.println("Esse numero tem mais do que 4 digitos, quantidade =  " + qtdCaracter);
        } else {
          char[] digitosInvertidos =  digitos.toCharArray() ;

           for (int x = (qtdCaracter - 1 ); x >= 0 ; x--){

                System.out.print(digitosInvertidos[x]);
             }
        }
    }

}
