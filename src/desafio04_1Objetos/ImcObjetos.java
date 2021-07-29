package desafio04_1Objetos;

class ImcObjetos {

    public static void main(String[] args) {
        DadosIMC defineIMC = new DadosIMC();
        defineIMC.calculaIMC();
        System.out.println("IMC " + defineIMC.imc);
    }

}

class DadosIMC {
    Double altura = 1.74;
    Double peso = 108.23;
    Double imc;

    void calculaIMC() {
        imc = peso / (Math.pow(2, altura));
    }
}

