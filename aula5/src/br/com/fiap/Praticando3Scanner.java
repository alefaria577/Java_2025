package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Praticando3Scanner {
    //Calcule a área de um trapézio
    public static void main(String[] args) {
        double base, altura, area, baseMaior;
        Scanner scan;

        try {

            scan = new Scanner(System.in);

            System.out.println("Digite o valor da base:");
            base = scan.nextDouble();

            System.out.println("Digite o valor da altura:");
            altura = scan.nextDouble();

            System.out.println("Digite o valor da baseMaior:");
            baseMaior = scan.nextDouble();

            area = ((base + baseMaior) * altura)/2;

            System.out.println("A area é: "+ area);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
