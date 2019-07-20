import javax.swing.JOptionPane;
    public class Exercicio1{
        public static void Menu(double controle) {
            int i;
            for (i=0; i<5; i++){
                controle=Doble.parseDouble(JOptionPane.showInputDialog("1- Digite seu gasto com alimentação:"));
                controle=Double.parseDouble(JOptionPane.showInputDialog("2- Digite seus gastos cachaça:"));
                controle=Double.parseDouble(JOptionPane.showInputDialog("3- Informe seus gastos com transporte:"));
                controle=Double.parseDouble(JOptionPane.showInputDialog("4- Informe seus gastos com estudos:"));
                controle=Double.parseDouble(JOptionPane.showInputDialog("5- Digite 0 para Sair !"));


              


                }


            }

        }
        public static void main(String args[]){
            Menu(controle);

        }
    }