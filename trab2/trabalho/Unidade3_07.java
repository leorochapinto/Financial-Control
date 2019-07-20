/*

3 - Faça uma sub-rotina do tipo função que retorne 1 se o número inteiro passado por parâmetro for positivo e 0 se o número for negativo.
 Leia um número e passe para função e diga se o mesmo é positivo ou negativo.




 */

import javax.swing.*;

public class Unidade3_07{


    public static int VerificaNumero(int numero){

        if(numero < 0){
            return 0;
        }else{
            return 1;
        }
    }

   // rotina principal
   public static void main(String args[])   {
        int numeroqualquer = Integer.parseInt(JOptionPane.showInputDialog(" Informe um número: "));

        if(VerificaNumero(numeroqualquer) == 1){
            JOptionPane.showMessageDialog(null, "O número é positivo! ");
        }else{
            JOptionPane.showMessageDialog(null, "O número é negativo! ");
        }
        
   }
}





