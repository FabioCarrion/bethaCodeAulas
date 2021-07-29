package desafio03JavaArray;

import java.util.Scanner;

//Desenvolva um programa que receba 10 parametros, inverta todas as posições e imprima o resultado
public class Exercicio05 {
    public static void main (String [] args) {
       String[] parametros = new String[10];
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro :");
        parametros [0] = s.nextLine();
        System.out.print("Digite o segundo parametro :");
        parametros [1] = s.nextLine();
        System.out.print("Digite o terceiro parametro :");
        parametros [2] = s.nextLine();
        System.out.print("Digite o quarto parametro :");
        parametros [3] = s.nextLine();
        System.out.print("Digite o quinto parametro :");
        parametros [4] = s.nextLine();
        System.out.print("Digite o sexto parametro :");
        parametros [5] = s.nextLine();
        System.out.print("Digite o setimo parametro :");
        parametros [6] = s.nextLine();
        System.out.print("Digite o oitavo parametro :");
        parametros [7] = s.nextLine();
        System.out.print("Digite o nono parametro :");
        parametros [8] = s.nextLine();
        System.out.print("Digite o decimo parametro :");
        parametros [9] = s.nextLine();

       String[] dadosInvertidos = new String[10];
        for (int x = parametros.length - 1 ; x >=  0; x--) {
            int aux = (parametros.length - 1 )  - x ;
            dadosInvertidos[aux] = parametros[x];
            System.out.println(dadosInvertidos[aux] + " na posição  " + aux);
        }

    }
}
