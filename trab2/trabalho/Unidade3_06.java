/*

2- Fa�a um algoritmo que possui uma sub-rotina tipo fun��o que calcule um valor A inteiro elevado a um expoente B tamb�m inteiro.
 N�o usar A** B e sim uma estrutura de repeti��o.
 A sub-rotina n�o dever� mostrar o resultado do calculo, isto ficar� a cargo do algoritmo principal. 
 (use passagem de par�metro por refer�ncia)



 */

import javax.swing.*;

public class Unidade3_06{

    //vari�veis globais
    static int A;
    static int B;

    public static int CalculaExpoente(){
        int resultado = 1;
        int i;
        for(i=1; i<=B; i++){
            resultado = resultado * A;
        }
        return resultado;
    }

   // rotina principal
   public static void main(String args[])   {
        A = Integer.parseInt(JOptionPane.showInputDialog(" Informe um n�mero: "));
        B = Integer.parseInt(JOptionPane.showInputDialog(" Informe um expoente: "));
        JOptionPane.showMessageDialog(null, "Resultado: " + CalculaExpoente());
   }
}





