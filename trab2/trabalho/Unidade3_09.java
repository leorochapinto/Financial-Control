/*

5 – Faça uma sub-rotina que receba um parâmetro
 inteiro(peso em Kg)
 outro double (altura em metros)
 e uma string(para o nome).
 Calcule o índice de massa corporal (IMC)  que é igual ao peso dividido pela altura ao quadrado.
 No programa principal solicite estes parâmetros ao usuário e chame a sub- rotina.
 A sub-rotina deve mostrar o resultado com o nome e IMC calculado (double).



 */

import javax.swing.*;

public class Unidade3_09{


    public static void CalculaIMC(int peso, double altura, String nome){
        double resultado = 0.0;
        resultado = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "O IMC de " + nome + " é " + resultado);

    }

   // rotina principal
   public static void main(String args[])   {
        String nome = JOptionPane.showInputDialog(" Informe o seu nome: ");
        double a = Double.parseDouble(JOptionPane.showInputDialog(" Informe a sua altura(m): "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Informe o seu peso(Kg): "));

        CalculaIMC(b,a,nome);
        
   }
}





