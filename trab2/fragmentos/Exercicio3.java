import javax.swing.JOptionPane;

public class Exercicio3 {
    static final double ALIQUOTA_0 = 0;
    static final double ALIQUOTA_1 = 7.5;
    static final double ALIQUOTA_2 = 15;
    static final double ALIQUOTA_3 = 22.5;
    static final double ALIQUOTA_4 = 27.5;

    public static double calculaAliquota(double salario, double aliquota) {
        return salario = salario * (100 - aliquota) / 100;
    }

    public static void impostoDeRenda(double salario) {
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

        JOptionPane.showMessageDialog(null, "Seu salario apos o desconto do imposto de renda e: " + mostra);
    }

    public static void main(String args[]) {
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));
        impostoDeRenda(salario);
    }
}