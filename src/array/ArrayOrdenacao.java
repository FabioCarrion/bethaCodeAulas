package array;

import java.util.Arrays;

public class ArrayOrdenacao {
    public static void main (String [] args){
        //criação do array de 10.000 posiçoes
        int [] arrayInteiros = new int[10000];
        //Atribuindo os valores a cada posição
        for (int i = 10000 ; i > 0; i--){
            arrayInteiros[arrayInteiros.length - i ] = i ;
        }
        //inicio do algoritmo de ordenação - implementação
        boolean estaOrdenado = false ;
        //armazena o tempo de  inicio da ordenação
        long inicio = System.currentTimeMillis();
        while(!estaOrdenado){
            estaOrdenado = true;
            for(int i=1; i < arrayInteiros.length;i++){
                if (arrayInteiros[i-1] > arrayInteiros[i]){
                    estaOrdenado = false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[i-1];
                    arrayInteiros[i-1] = aux;

                }

            }
        }
        //armazena o tempo fim da ordenação
        long fim = System.currentTimeMillis();
        //imprime o tempo total de ordenação
        System.out.println("Tempo ordenar 1:" + (fim -inicio )+ "ms");
        //atribuindo os valores a cada posição
        for(int i = 10000; i>0;i--){
            arrayInteiros[arrayInteiros.length - i] = i ;
        }
        //armazena o tempo de inicio da ordenação
        inicio = System.currentTimeMillis();
        //Ordena utilizando a classe arrays
        Arrays.sort(arrayInteiros);
        //armazena o tempo fim da ordenação
        fim = System.currentTimeMillis();
        //imprime o tempo total de ordenação
        System.out.println("Tempo ordenar 2 : " + (fim-inicio)+ "ms");
    }
}
