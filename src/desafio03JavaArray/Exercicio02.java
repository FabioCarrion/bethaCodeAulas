package desafio03JavaArray;
//Escreva um programa que some todos valores contidos em um array de inteiros e cálcule a média
public class Exercicio02 {
    public static void main (String [] args) {
        int [] numerosInteiros = {10,9,9,8};
        int quantidadeNumeros =  numerosInteiros.length;
        int soma = 0 ;
        for(int i = 0 ;i < quantidadeNumeros;i++){
            soma = soma + numerosInteiros[i];
        }

        System.out.println("Média : " + soma + " / " + quantidadeNumeros + " = " + (soma/quantidadeNumeros));

    }
}
