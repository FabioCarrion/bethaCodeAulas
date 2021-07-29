package desafio03JavaArray;
//Faça um programa que inverta as posições de um array com 10 elementos

public class Exercicio03 {
    public static void main(String[] args) {
        int[] numerosInteiros = {30, 40, 50,79, 86, 95, 104, 203, 402, 501};
        int[] numerosInteirosInvertidos = new int[10];

        for (int x = numerosInteiros.length - 1 ; x >=  0; x--) {
            int aux = (numerosInteiros.length -1)  - x ;
            numerosInteirosInvertidos[aux] = numerosInteiros[x];
            System.out.println(numerosInteirosInvertidos[aux] + " na posição  " + aux);
        }
    }
}

