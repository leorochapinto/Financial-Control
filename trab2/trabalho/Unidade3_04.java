/*

4 - Faça um algoritmo para armazenar na memória as informações de N alunos, tais como: Nome, idade e sexo.
 Construa um menu de opções para chamar sub-rotinas que deverão executar as seguintes operações:
a)	Ler as informações de um aluno; // leia-se todos os alunos do vetor
b)	Emitir um relatório dos dados ordenado crescentemente pelo Nome;
c)	Emitir um relatório ordenado dos dados decrescentemente pela idade;
d)	Informar qual o percentual de alunos do sexo feminino.

 */

import javax.swing.*;
import java.util.*;
public class Unidade3_04{

        // classe interna
        static class Aluno {
            String nome;
            int idade;
            char sexo;
        }

        // variaveis globais
        static int TAMANHO = 3; // N alunos, aqui escolhi 3
        static Aluno A[] = new Aluno[TAMANHO]; // vetor do tipo Aluno
        static String Alunos[] = new String[TAMANHO];
        static int opcao,i;



        // a) Ler as informações de um aluno;
        public static void opcao_1(){
            for(i=0; i<TAMANHO; i++){
                    A[i] = new Aluno();
                    A[i].nome = JOptionPane.showInputDialog(" Informe o nome. ");
                    A[i].idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a idade de " + A[i].nome));
                    A[i].sexo = JOptionPane.showInputDialog(" Informe o sexo de " + A[i].nome + ": M - Masculino | F - Feminino").charAt(0);
            }
        }



         // b)	Emitir um relatório dos dados ordenado crescentemente pelo Nome;
        public static void opcao_2(){
            for(i=0; i<TAMANHO; i++){
                Alunos[i] = ""
                        + "Nome: " + A[i].nome + "\n"
                        + "Idade: " + A[i].idade + "\n"
                        + "Sexo: " + A[i].sexo + "\n";
            }

            // ordena
            Arrays.sort(Alunos);

            //mostra ordenado
            JOptionPane.showMessageDialog(null, "b) Emitir um relatório dos dados ordenado crescentemente pelo Nome. \n ");
            for(i=0; i<TAMANHO; i++){
                JOptionPane.showMessageDialog(null, Alunos[i]);
            }
            
        }



         // c)	Emitir um relatório ordenado dos dados decrescentemente pela idade;
        public static void opcao_3(){

        Aluno mais_velho;
        Aluno B[] = new Aluno[TAMANHO];
        B = A;

        for (int i = B.length; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                if (B[j].idade > B[j-1].idade)
                {
                    mais_velho = B[j];
                    B[j] = B[j - 1];
                    B[j - 1] = mais_velho;
                }
            }
        }
            

            for(i=0; i<TAMANHO; i++){
                Alunos[i] = " Ordenado decrescentemente por idade. \n"
                        + "Nome: " + B[i].nome + "\n"
                        + "Idade: " + B[i].idade + "\n"
                        + "Sexo: " + B[i].sexo + "\n";
            }

            //mostra ordenado
            for(i=0; i<TAMANHO; i++){
                JOptionPane.showMessageDialog(null, Alunos[i]);
            }

        }


        // d)	Informar qual o percentual de alunos do sexo feminino.
        public static void opcao_4(){
            int contador = 0;
            double porcento = 0.0;
            for(i=0; i<TAMANHO; i++){
                if(A[i].sexo == 'F' || A[i].sexo == 'f'){
                    contador++;
                }
            }


            porcento = (contador * 100) / TAMANHO;
            JOptionPane.showMessageDialog(null, "d) Informar qual o percentual de alunos do sexo feminino.\n " + porcento + " %");


        }




   // rotina principal
   public static void main(String args[])   {       
            int opcao = 1;
            while (opcao > 0 && opcao < 5) {

                // MENU de opções
                opcao = Integer.parseInt(JOptionPane.showInputDialog( "MENU \n\n"
                                                + "1) Ler as informações de um aluno;\n"
                                                + "2) Emitir um relatório dos dados ordenado crescentemente pelo Nome;\n"
                                                + "3) Emitir um relatório ordenado dos dados decrescentemente pela idade;\n"
                                                + "4) Informar qual o percentual de alunos do sexo feminino.\n"
                                                + "5) - Sair"));

                // verifica a opção escolhida

                if(opcao == 1){
                    opcao_1();

                }else if(opcao == 2){
                    opcao_2();

                }else if(opcao == 3){
                    opcao_3();

                }else if(opcao == 4){
                    opcao_4();

                }else{
                    opcao = 0;
                }

            } // fim do while
   }
}






