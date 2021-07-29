package array;

public class ArrayVetor {
    public static void main(String[] args) {
        int [] jogoSena; //Declaração
        jogoSena = new int [6] ; //Criação
        jogoSena[0] = 23; //Inicialização da posição 0
        jogoSena[1] = 12; //Inicialização da posição 1
        jogoSena[2] = 55; //Inicialização da posição 2
        jogoSena[3] = 02; //Inicialização da posição 3
        jogoSena[4] = 07; //Inicialização da posição 4
        jogoSena[5] = 19; //Inicialização da posição 5

        int [] outroJogoSena = {23,12,55,05,07,19};

        for (int x = 0 ; x <= 5 ; x++){
            System.out.print(jogoSena[x]);
        }

    }
}
