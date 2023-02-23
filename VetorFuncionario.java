package atv2;

import javax.swing.*;

public class VetorFuncionario {
    //Registrar nome, salário,e o nome de dependentes
    //No final exiba as informações e um acrescimo de R$20,00 por dependente ao salário

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o nome do Funcionário");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe Salário do Funcionário"));
        int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade Dependentes"));

        String[] nomeDependentes = new String[qtdDependentes];
        double salarioFamilia=0;

        for (int i = 0; i < qtdDependentes; i++) {
            nomeDependentes[i] = JOptionPane.showInputDialog("Informe o nome do "+(i+1)+"º dependente");
            salarioFamilia+=20;
        }

        System.out.println("Funcionario: "+ nome);

        for (int i = 0; i < qtdDependentes; i++) {
            System.out.println("Dependente "+i+": "+ nomeDependentes[i]);
        }
        System.out.println("Salário: R$"+(salario+salarioFamilia));
    }
}
