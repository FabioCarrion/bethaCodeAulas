package desafio02Java;
/*Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.*/
import  java.util.Scanner;
public class Exercicio01 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7:");
        int i = s.nextInt();
        switch (i) {
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Não é um dia de semana");
        }
    }
}
