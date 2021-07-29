package desafio03JavaArray;
//Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.swing.JOptionPane;
public class Exercicio06 {
    public static void main (String [] args){

        String resultado ;

       String peso = JOptionPane.showInputDialog("Digite o seu peso :");
       String altura= JOptionPane.showInputDialog("Digite a sua altura :");

        double calculaPeso = Double.parseDouble(peso);
        double calculaAltura = Double.parseDouble(altura);

        double imc = calculaPeso / (Math.pow(2,calculaAltura));

        if (imc < 18.30){
             resultado = "Abaixo do peso" ;
        }else if (imc > 18.30 && imc < 90){
             resultado = "Peso Ideal" ;
        } else {
             resultado = " Acima do Peso " ;
        };


        JOptionPane.showMessageDialog(null, "IMC : " +imc + "Resultado: " + resultado );
    }
}
