/*

3 - Fa�a uma sub-rotina do tipo fun��o que retorne 1 se o n�mero inteiro passado por par�metro for positivo e 0 se o n�mero for negativo.
 Leia um n�mero e passe para fun��o e diga se o mesmo � positivo ou negativo.




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
        int numeroqualquer = Integer.parseInt(JOptionPane.showInputDialog(" Informe um n�mero: "));

        if(VerificaNumero(numeroqualquer) == 1){
            JOptionPane.showMessageDialog(null, "O n�mero � positivo! ");
        }else{
            JOptionPane.showMessageDialog(null, "O n�mero � negativo! ");
        }
        
   }
}





