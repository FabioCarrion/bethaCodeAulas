public class ControleFluxoIfMain {

    public static void main(String[] args) {
        int ano = 2012;
        double altura = 1.4;
        double salario = 15000;

        /*Verifica Bissexto*/
        if (ano < 0) {

            System.out.println("Não é um ano !");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto");

        } else {
            System.out.println("Não é bissexto !");
        }

        /*Inicio numeros*/

        if (10 == 20) {
            System.out.println("é igual");
        } else {
            System.out.println("Não é igual");
        }

        /*Inicio altura*/

        if (altura == 1.4) {
            System.out.println("Baixinho");
        } else {
            System.out.println("Alto");
        }

        /*Inicio Salario*/

        if (salario >= 15000) {
            System.out.println("Carrion");
        } else {
            System.out.println("Bruno");
        }

    }

}




