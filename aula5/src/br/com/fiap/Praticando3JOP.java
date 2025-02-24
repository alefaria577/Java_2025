package br.com.fiap;

import javax.swing.*;

public class Praticando3JOP {
    //Calcule a área de um trapézio
    public static void main(String[] args) {
        double base, altura, area, baseMaior;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o valor da base:");
            base = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o valor da altura:");
            altura = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o valor da baseMaior:");
            baseMaior = Double.parseDouble(auxiliar);

            area = ((base + baseMaior) * altura)/2;

            JOptionPane.showMessageDialog(null, "A área é: " + area);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
