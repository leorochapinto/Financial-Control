/*

3 - Fa�a um algoritmo que possui uma sub-rotina para ler uma matriz de ordem 2x4 de n�meros inteiros
 e outra sub-rotina para imprimir os elementos da matriz.



 */

import javax.swing.*;
public class Unidade3_03{

        // variaveis globais
        static int A[][] = new int[2][4];
        static int i,j;

        // sub-rotina para solicitar n�meros
        public static void SolicitaNumeros(){
            for(i=0; i<2; i++){
                for (j=0; j<4; j++){
                    A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Informe um n�mero para a linha " +i+ " e coluna " + j +" ."));
                }
            }
        }

        // sub-rotina para mostrar os n�meros
        public static void MostraNumeros(){
            for(i=0; i<2; i++){
                for (j=0; j<4; j++){
                    JOptionPane.showMessageDialog(null, "N�meros: " + A[i][j]);
                }
            }
        }


   // rotina principal
   public static void main(String args[])   {       
        SolicitaNumeros();
        MostraNumeros();
   }
}





