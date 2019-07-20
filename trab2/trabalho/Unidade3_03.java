/*

3 - Faça um algoritmo que possui uma sub-rotina para ler uma matriz de ordem 2x4 de números inteiros
 e outra sub-rotina para imprimir os elementos da matriz.



 */

import javax.swing.*;
public class Unidade3_03{

        // variaveis globais
        static int A[][] = new int[2][4];
        static int i,j;

        // sub-rotina para solicitar números
        public static void SolicitaNumeros(){
            for(i=0; i<2; i++){
                for (j=0; j<4; j++){
                    A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Informe um número para a linha " +i+ " e coluna " + j +" ."));
                }
            }
        }

        // sub-rotina para mostrar os números
        public static void MostraNumeros(){
            for(i=0; i<2; i++){
                for (j=0; j<4; j++){
                    JOptionPane.showMessageDialog(null, "Números: " + A[i][j]);
                }
            }
        }


   // rotina principal
   public static void main(String args[])   {       
        SolicitaNumeros();
        MostraNumeros();
   }
}





