package atv1;

import javax.swing.*;

public class VetorMedia {
    public static void main(String[] args) {

        String qtNotasString = JOptionPane.showInputDialog("Quantas notas possuem");
        int qtdNotas = Integer.parseInt(qtNotasString);

        double[] notas = new double[qtdNotas];

        for(int i=0; i<qtdNotas; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota nº"+i));

        }
        double soma=0;
        for (int i=0; i<qtdNotas; i++) {
            soma+=notas[1];
        }

        JOptionPane.showMessageDialog(null, "A média é: "+(soma/qtdNotas));
        }

    }


