package desafio03JavaArray;
import javax.swing.JOptionPane;
import  java.util.Scanner;

//Faça um programa que receba entrada de dados e informe ao usuário através de uma caixa de diálogo qual foi os dados passados

public class Exercicio04 {
    public static void main (String [] args ){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma frase :");
        String mensagem = s.nextLine();
        System.out.print("Digite seu nome  :");
        String nome = s.nextLine();
        System.out.print("Digite seu sobrenome  :");
        String sobrenome = s.next();
       JOptionPane.showMessageDialog(null,mensagem + "." + nome + " " +  sobrenome);
    }
}

// Resultado fica atrás da tela do intelij