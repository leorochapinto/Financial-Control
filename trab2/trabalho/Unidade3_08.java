/*

4 - Fa�a uma sub-rotina do tipo fun��o que receba dois n�meros inteiros positivos por par�metro
 e retorne a soma dos N n�meros existentes entre eles.
 Fa�a um algoritmo para utilizar a fun��o e mostrar a soma.
 *
 * EXEMPLO primeiro = 1 e segundo = 5
 * deve somar 2 + 3 + 4

 */

import javax.swing.*;

public class Unidade3_08{


    public static int SomaIntervalo(int primeiro, int segundo){
        int resultado = 0;
        int a = primeiro + 1;
        int i;
        for(i=a; i < segundo; i++){
            resultado = resultado + i;
        }
        return resultado;

    }

   // rotina principal
   public static void main(String args[])   {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Informe o primeiro n�mero do intervalo: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Informe o segundo n�mero do intervalo: "));

        JOptionPane.showMessageDialog(null, "A soma do intervalo �: " + SomaIntervalo(a,b));
        
   }
}





