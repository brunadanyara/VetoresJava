package atv3;

import java.util.Scanner;

public class VetorReajusute {
    //Faça um programa que leia 10 salários
    //Informe um percentual de reajuuste e aplique aos 10 salários

    public static void main(String[] args) {

        final int QTD_SALARIOS=3;
        double[] salarios = new double[QTD_SALARIOS];

        for (int i = 0; i < QTD_SALARIOS ; i++) {
            System.out.println("Informe o percentual a posição "+i);
            Scanner scanner = new Scanner(System.in);
            salarios[i]= scanner.nextDouble();
        }

        System.out.println("Informe o percentual de reajuste");
        Scanner scanner = new Scanner(System.in);
        double percentualReajuste = scanner.nextDouble();

        for (int i = 0; i < QTD_SALARIOS ; i++) {
            salarios[i]=salarios[i]*(percentualReajuste/100);
        }

        for (int i = 0; i < QTD_SALARIOS; i++) {
            System.out.println("Salário na posição "+i+": "+salarios[i]);

        }


    }
}
