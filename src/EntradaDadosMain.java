import  java.util.Scanner;
public class EntradaDadosMain {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("digite uma linha :");
        String linha  = s.nextLine();
        System.out.print("digite um numero :");
        int i = s.nextInt();
        System.out.print("digite um numero : ");
        double d = s.nextDouble();

        System.out.println("Imprime : linha :" + linha + " inteiro " + i + "double " + d);

    }
}
