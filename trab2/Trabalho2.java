
import javax.swing.JOptionPane;

public class Trabalho2 {

    static final double VER_SOFT = 1.0;
    static final double ALIQUOTA_0 = 0;
    static final double ALIQUOTA_1 = 7.5;
    static final double ALIQUOTA_2 = 15;
    static final double ALIQUOTA_3 = 22.5;
    static final double ALIQUOTA_4 = 27.5;

    static class MeuDinheiro {

        static double balanco;
        static double despesas;
        static double salario;
    }

    public static void lerInfo() {
        MeuDinheiro d = new MeuDinheiro();
        if (d.balanco > 0.0) {

            String info = "";
            info = "Sistema de Gerenciamento de Finanças Pessoais ver" + VER_SOFT + "\nSalario: " + d.salario
                    + "\n Despesas: " + d.despesas + "\n " + d.balanco;
            JOptionPane.showMessageDialog(null, info);
        } else {
            JOptionPane.showMessageDialog(null, "Balanco ainda não foi inserido, por favor inserir o balanco primeiro.");
        }
    }

    public static double calculaAliquota(double salario, double aliquota) {
        return salario = salario * (100 - aliquota) / 100;
    }

    public static double impostoDeRenda(double salario) {
        double mostra = 0.0;
        if (salario <= 1903.98) {
            mostra = calculaAliquota(salario, ALIQUOTA_0);
        } else if (salario >= 1903.99 && salario < 2826.65) {
            mostra = calculaAliquota(salario, ALIQUOTA_1);
        } else if (salario >= 2826.65 && salario < 3751.05) {
            mostra = calculaAliquota(salario, ALIQUOTA_2);
        } else if (salario >= 3751.05 && salario < 4664.68) {
            mostra = calculaAliquota(salario, ALIQUOTA_3);
        } else {
            mostra = calculaAliquota(salario, ALIQUOTA_4);
        }

        return mostra;
    }

    public static void submenu() {
        int menu = 1;
        Double mostrar;
        String resumoMenu;
        while (menu > 0 && menu < 6) {
            if (MeuDinheiro.balanco != 0.0) {
                resumoMenu = "Seu balanco: " + Double.toString(MeuDinheiro.balanco);
            } else {
                resumoMenu = "";
            }
            ;
            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU de insercao de gastos \n\n" + resumoMenu + "\n"
                    + "1 - Gastos com alimentacao:\n" + "2 - Gastos com festas:\n" + "3 - Gastos com estudos:\n"
                    + "4 - Gastos com transporte:\n" + "5 - Gastos com saude:\n" + "6 - Voltar para o menu principal"));

            switch (menu) {
                case 1:
                    double gasto_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com alimentacao:"));
                    break;

                case 2:
                    double gasto_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com festas:"));
                    break;

                case 3:
                    double gasto_3 = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com estudos:"));
                    break;

                case 4:
                    double gasto_4 = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com transporte:"));
                    break;

                case 5:
                    double gasto_5 = Double.parseDouble(JOptionPane.showInputDialog("Digite os gastos com saude:"));
                    break;
                default:
                    menu = 0;
            }
        }
    }

    public static double calculaMeta(int digitePreco, int digiteEconomia) {
        double calculo = digitePreco / digiteEconomia;
        return calculo;
    }

    public static void main(String args[]) {

        int opcao = 1;
        while (opcao > 0 && opcao < 5) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU \n\n" + "1) Ler as informacoes de gestao financeira\n" + "2) Consultar o imposto de renda \n"
                    + "3) Inserir dados financeiros \n" + "4) Digite sua meta para 2018.\n" + "5) - Sair"));

            if (opcao == 1) {
               
                lerInfo();
            } else if (opcao == 2) {
               
                MeuDinheiro d = new MeuDinheiro();
                double mostrar2 = 0.0;
                d.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));
                mostrar2 = impostoDeRenda(d.salario);
                JOptionPane.showMessageDialog(null, "Seu salario apos o desconto do imposto de renda e: " + mostrar2);
            } else if (opcao == 3) {
             
                submenu();
            } else if (opcao == 4) {
                int digiteEconomia, digitePreco;
                String Meta;
                Meta = JOptionPane.showInputDialog("Digite sua meta para 2018 (Ex: carro, viajar e etc...");
                digitePreco = Integer.parseInt(JOptionPane.showInputDialog("Digite o quanto custara para " + Meta));
                digiteEconomia = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salario liquido"));
                JOptionPane.showMessageDialog(null,
                        "Voce atingirá sua meta em " + calculaMeta(digitePreco, digiteEconomia) + " meses!");
            } else {
                opcao = 0;
            }

        }

    }
}
