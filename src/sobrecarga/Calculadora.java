package sobrecarga;


 class CalculadoraMain { // somente Porque está em pacote

    public static void main(String[] args){
        CalculadoraMain calculadora = new CalculadoraMain();

        calculadora.calcular (10, 10);

        calculadora.calcular (10.5, 10.6);

        calculadora.calcular ("10", "10");
    }

    //Métodos
    public void calcular(int a, int b){
        System.out.println("Soma: " + (a + b));
    }

    public void calcular(double a, double b){
        System.out.println("Soma: " + (a + b));
    }

    public void calcular(String a, String b){
        System.out.println("Soma: " + (a + b));
    }

}




/*public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(10, 10);
    }

}

  public static class Calculadora {

    public void calcular (int a, int b){
        System.out.println("soma  : "+ (a+b));
    }

    public void calcular(double a, double b){
        System.out.println("soma  : "+ (a+b));
    }

  }*/

