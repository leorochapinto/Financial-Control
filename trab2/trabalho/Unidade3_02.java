/*

2 - Faça um algoritmo que possui uma sub-rotina para ler um vetor A de N elementos reais.
 O valor de N devera ser lido. Após a utilização da sub-rotina de leitura,
 chame outra sub-rotina que mostre a soma dos elementos do vetor A.


 */

import javax.swing.*;
public class Unidade3_02{

        // variaveis globais
        static int TAMANHO = 1000;
        static double A[] = new double[TAMANHO];
        static double soma;
        static int i;

        // sub-rotina para solicitar números
        public static void SolicitaNumeros(){
            for (i=0; i<TAMANHO; i++){
                    A[i]    = Double.parseDouble(JOptionPane.showInputDialog("Informe um número."));
            }
        }

        // sub-rotina para mostrar a soma dos números
        public static void MostraSoma(){
            for (i=0; i<TAMANHO; i++){
                    soma = soma + A[i];
            }
            JOptionPane.showMessageDialog(null,"Soma: " + soma);
        }


   // rotina principal
   public static void main(String args[])   {       
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog(" Informe o tamanho do Vetor. "));
        SolicitaNumeros();
        MostraSoma();
   }
}





