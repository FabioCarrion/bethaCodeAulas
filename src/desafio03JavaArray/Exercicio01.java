package desafio03JavaArray;

//Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.

public class Exercicio01 {

    public static void main (String [] args){
        String [] nomes = new String[] {"João","Miguel","Elis","Fabio","Maria","Tania","Guilherme","Rita","Joao Guilherme","Alan"};
        for(int i = 0 ;i < nomes.length;i++){
            System.out.println(" Nome na posição " + i + " :  " + nomes[i]);
        }
    }
}
