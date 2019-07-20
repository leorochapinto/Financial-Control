
import javax.swing.JOptionPane;
import java.io.*;

public class Trabalho3 {

    static final double VER_SOFT = 1.0;
    static final double ALIQUOTA_0 = 0;
    static final double ALIQUOTA_1 = 7.5;
    static final double ALIQUOTA_2 = 15;
    static final double ALIQUOTA_3 = 22.5;
    static final double ALIQUOTA_4 = 27.5;
    static final String FILE = "/home/thivieira/unisul/alg2/trab2/database.txt";

    static class MeuDinheiro {

        static double armazenaDespesas[][];
        static double balanco;
        static double despesas;
        static double salario;
        static String meta;
        static double metaVal;
    }

    public static String lerInfo() {
        String info = "";
        MeuDinheiro d = new MeuDinheiro();
        info = "Sistema de Gerenciamento de Finanças Pessoais ver " + VER_SOFT + "\n\nSalario: " + d.salario
                + "\n Despesas: " + d.despesas + "\n Balanco: " + d.balanco + "\n";
        return info;
    }

    public static double calculaAliquota(double salario, double aliquota) {
        return salario = salario * (100 - aliquota) / 100;
    }

    public static double impostoDeRenda(double salario) {
        double mostra;
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
        int pergunta;
        MeuDinheiro d = new MeuDinheiro();
        while (menu > 0 && menu < 7) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(lerInfo() + "\n" + "MENU de insercao de gastos \n"
                    + "1 - Gastos com alimentacao:\n" + "2 - Gastos com festas:\n" + "3 - Gastos com estudos:\n"
                    + "4 - Gastos com transporte:\n" + "5 - Gastos com saude:\n" + "6 - Insira seu salario:\n"
                    + "7 - Voltar para o menu principal \n\n"));

            switch (menu) {
            case 1:
                d.armazenaDespesas[0][0] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite os gastos com alimentacao: "));
                atualizaMeuDinheiro();
                break;
            case 2:
                d.armazenaDespesas[0][1] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite os gastos com festas: "));
                atualizaMeuDinheiro();
                break;
            case 3:
                d.armazenaDespesas[0][2] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite os gastos com estudos: "));
                atualizaMeuDinheiro();
                break;
            case 4:
                d.armazenaDespesas[1][0] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite os gastos com transporte: "));
                atualizaMeuDinheiro();
                break;
            case 5:
                d.armazenaDespesas[1][1] = Double
                        .parseDouble(JOptionPane.showInputDialog("Digite os gastos com saude: "));
                atualizaMeuDinheiro();
                break;
            case 6:
                d.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario liquido: "));
                mostrar = impostoDeRenda(d.salario);
                JOptionPane.showMessageDialog(null, "Seu salario apos o desconto do imposto de renda e: " + mostrar);
                if (d.salario != mostrar) {

                    pergunta = Integer.parseInt(JOptionPane.showInputDialog(
                            "Deseja adicionar ao calculo do balanco? \n Digite 1 para adicionar ao calculo \n Digite 2 para continuar"));
                    if (pergunta == 1) {
                        d.salario = mostrar;
                    }
                }
                atualizaMeuDinheiro();
                break;
            case 7:
                menu = 0;
                break;
            default:
                menu = 0;
            }
        }
    }

    public static boolean calculaMeta(double digitePreco, double digiteEconomia) {
        double calculo = digitePreco - digiteEconomia;
        if (calculo > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void lerDespesas() {
        MeuDinheiro d = new MeuDinheiro();
        JOptionPane.showMessageDialog(null, "\n Suas despesas sao " + d.despesas + "\n");
    }

    public static void lerSalario() {
        MeuDinheiro d = new MeuDinheiro();
        JOptionPane.showMessageDialog(null, "\n Seu salario e " + d.salario + "\n");
    }

    public static void atualizaMeuDinheiro() {
        MeuDinheiro d = new MeuDinheiro();
        double total = 0.0;
        for (int row = 0; row < d.armazenaDespesas.length; row++) {
            for (int column = 0; column < d.armazenaDespesas[row].length; column++) {
                total -= d.armazenaDespesas[row][column];
            }
        }
        d.despesas = total;
        d.balanco = d.salario - d.despesas;
    }

    public static void saveToDisk() {

        try {
            BufferedWriter file = null;
            file = new BufferedWriter(new FileWriter(new File(FILE)));
            MeuDinheiro d = new MeuDinheiro();
            double total = 0.0;
            for (int row = 0; row < d.armazenaDespesas.length; row++) {
                for (int column = 0; column < d.armazenaDespesas[row].length; column++) {
                    total -= d.armazenaDespesas[row][column];
                }
            }
            d.despesas = total;
            d.balanco = d.salario - d.despesas;

            file.write("gastosAlimentacao=" + d.armazenaDespesas[0][0]);
            file.newLine();
            file.write("gastosFestas=" + d.armazenaDespesas[0][1]);
            file.newLine();
            file.write("gastosEstudo=" + d.armazenaDespesas[0][2]);
            file.newLine();
            file.write("gastosTransporte=" + d.armazenaDespesas[1][0]);
            file.newLine();
            file.write("gastosSaude=" + d.armazenaDespesas[1][1]);
            file.newLine();

            file.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Nao abriu arquivo para escrita!");
        }
    }

    public static void main(String args[]) {
        MeuDinheiro d = new MeuDinheiro();
        d.armazenaDespesas = new double[3][3];
        int opcao = 1;
        while (opcao > 0 && opcao < 5) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(lerInfo() + "\n" + "Menu Principal \n"
                    + "1) Inserir dados financeiros \n" + "2) Ler as informacoes de gestao financeira\n"
                    + "3) Consultar suas despesas \n" + "4) Consultar seu Salario \n"
                    + "5) Descubra se você pode realizar sua proxima meta \n" + "6) Salvar Progresso \n" + "7) Sair \n"));

            if (opcao == 1) {
                submenu();
                atualizaMeuDinheiro();
            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null, lerInfo());
            } else if (opcao == 3) {
                lerDespesas();
            } else if (opcao == 4) {
                lerSalario();
            } else if (opcao == 5) {
                if (d.balanco == 0.0) {
                    JOptionPane.showMessageDialog(null, "No momento voce nao tem condicoes de atingir metas.");
                    opcao = 1;
                    return;
                }
                d.meta = JOptionPane.showInputDialog("Digite sua meta para 2018 (Ex: carro, viajar e etc...");
                d.metaVal = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto custara para " + d.meta));
                if (calculaMeta(d.metaVal, d.balanco)) {
                    JOptionPane.showMessageDialog(null, "Voce tem condicoes de atingir sua meta!");
                } else {
                    JOptionPane.showMessageDialog(null, "No momento voce nao tem condicoes de atingir sua meta.");
                }
            } else if (opcao == 6) {
                saveToDisk();
            } else {
                opcao = 0;
            }

        }

    }
}
