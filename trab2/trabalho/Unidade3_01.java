/*

1 - Faça um algoritmo que possui uma sub-rotina para ler um vetor A de N elementos inteiros.
 O valor de N deverá ser lido. Após a utilização da sub-rotina de leitura,
 chame outra sub-rotina que mostre os elementos do vetor A.

 */

import javax.swing.*;
public class Unidade3_01{

        // variaveis globais
        static int TAMANHO = 1000;
        static int A[] = new int[TAMANHO];
        static int i;

        // sub-rotina para solicitar números
        public static void SolicitaNumeros(){
            for (i=0; i<TAMANHO; i++){
                    A[i]    = Integer.parseInt(JOptionPane.showInputDialog("Informe um número."));
            }
        }

        // sub-rotina para mostrar os números
        public static void MostraNumeros(){
            for (i=0; i<TAMANHO; i++){
                    JOptionPane.showMessageDialog(null,"Número: " + A[i]);
            }
        }


   // rotina principal
   public static void main(String args[])   {       
        TAMANHO = Integer.parseInt(JOptionPane.showInputDialog(" Informe o tamanho do Vetor. "));
        SolicitaNumeros();
        MostraNumeros();
   }
}





