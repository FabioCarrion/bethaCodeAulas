public class breakContinueMain {
    public static void main(String[] args) {
        boolean terminando = false;
        int a = 0;
        int b = 0;

        while (!terminando) {
            a++;
            System.out.println("Indice a :" + a);
            if (a == 10) {
                System.out.println("Indice a:" + a);
                break;
            }
        }
   //comando continue
        while (!terminando) {
            b++;
            if (b % 2 != 0) {
                continue;
            }
            System.out.println("Indice b: " + b);
            if (b == 20) {
                break;
            }
        }
    }

}
