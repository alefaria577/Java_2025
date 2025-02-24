package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Praticando4JOP {
    //Calcular uma equação do segundo grau
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o valor do a:");
            a = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o valor do b:");
            b = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o valor do c:");
            c = Double.parseDouble(auxiliar);


            delta = (b*b) - (4*a*c);

            x1 = (- b + Math.sqrt(delta)) / 2*a;

            x2 = (- b - Math.sqrt(delta)) / 2*a;


            JOptionPane.showMessageDialog(null, "O delta é: " + delta);
            JOptionPane.showMessageDialog(null, "O x1 é: " + x1);
            JOptionPane.showMessageDialog(null, "O x2 é: " + x2);




        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
