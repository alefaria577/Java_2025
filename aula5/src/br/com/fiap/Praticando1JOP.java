package br.com.fiap;

import javax.swing.*;

public class Praticando1JOP {
    //Calular area do retangulo
    public static void main(String[] args) {
        double base, altura, area;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o valor da base:");
            base = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o valor da altura:");
            altura = Double.parseDouble(auxiliar);

            area = base * altura;

            JOptionPane.showMessageDialog(null, "A área é: " + area);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
