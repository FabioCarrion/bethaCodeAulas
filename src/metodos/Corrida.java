package metodos;

class Corrida {
    public static void main(String[] args) {

        CarroCorrida carroEquipeVelocidade = new CarroCorrida();
        CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

        Piloto pilotoEquipeVelocidade = new Piloto();
        Piloto pilotoEquipeTrapaceiros = new Piloto();

        pilotoEquipeVelocidade.nomePiloto = "Piloto 1";
        pilotoEquipeVelocidade.idadePiloto = 25;
        pilotoEquipeVelocidade.habilidadePiloto = 75;

        pilotoEquipeTrapaceiros.nomePiloto = "Piloto 2";
        pilotoEquipeTrapaceiros.idadePiloto = 27;
        pilotoEquipeTrapaceiros.habilidadePiloto = 65;

        carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
        carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

        carroEquipeVelocidade.numeroIdentificacao = 1;
        carroEquipeTrapaceiros.numeroIdentificacao = 2;

        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiros.ligar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.velocidadeAtual = 200.0;

        System.out.println("Velocidade trapaceiros " + carroEquipeTrapaceiros.velocidadeAtual);
        System.out.println("Velocidade velocidade " + carroEquipeVelocidade.velocidadeAtual);

    } ;


};

class Piloto {
    String nomePiloto;
    Integer idadePiloto;
    Integer habilidadePiloto;

};

class CarroCorrida {
    //Estado
    Integer numeroIdentificacao;
    Double velocidadeAtual = 0.0;
    Double velocidadeMaxima = 100.0;
    Piloto piloto;


    //Comportamento...

    void ligar() {
        System.out.println("VRUUUMmmmmmmmmmmmm");
    }

    void desligar() {
        System.out.println("MMMmmmmmmmmmmmmmmmm");
    }

    void acelerar() {
        velocidadeAtual += 10 + piloto.habilidadePiloto * 0.1;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    void frear(Integer intensidadeFreada) {
        if (intensidadeFreada > 100) {
            intensidadeFreada = 100;
        } else if (intensidadeFreada < 0) {
            intensidadeFreada = 0;
        }

        velocidadeAtual -= intensidadeFreada * 0.25;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0.0;
        }

    }


}



