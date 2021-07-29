import javax.swing.JOptionPane;

public class ImporaClasseSwing {
    public static void main(String [] args ){

        String nome ;
        nome = JOptionPane.showInputDialog("Digite o seu nome :");
        String mensagem  = nome  + "está  fazendo o curso java Iniciante" ;
        JOptionPane.showMessageDialog(null,mensagem);

    }

}
