/*

2- Faça um algoritmo que possui uma sub-rotina tipo função que calcule um valor A inteiro elevado a um expoente B também inteiro.
 Não usar A** B e sim uma estrutura de repetição.
 A sub-rotina não deverá mostrar o resultado do calculo, isto ficará a cargo do algoritmo principal. 
 (use passagem de parâmetro por referência)



 */

import javax.swing.*;

public class Unidade3_06{

    //variáveis globais
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
        A = Integer.parseInt(JOptionPane.showInputDialog(" Informe um número: "));
        B = Integer.parseInt(JOptionPane.showInputDialog(" Informe um expoente: "));
        JOptionPane.showMessageDialog(null, "Resultado: " + CalculaExpoente());
   }
}





