package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Praticando1Scanner {
    //Calular area do retangulo
    public static void main(String[] args) {
        double base, altura, area;
        Scanner scan;

        try {

            scan = new Scanner(System.in);

            System.out.println("Digite o valor da base:");
            base = scan.nextDouble();

            System.out.println("Digite o valor da altura:");
            altura = scan.nextDouble();

            area = base * altura;

            System.out.println("A area é: "+ area);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
