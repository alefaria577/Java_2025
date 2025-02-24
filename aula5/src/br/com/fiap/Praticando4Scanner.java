package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Praticando4Scanner {
    //Calcular uma equação do segundo grau
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scan;

        try {

            scan = new Scanner(System.in);

            System.out.println("Digite o valor do a:");
            a = scan.nextDouble();

            System.out.println("Digite o valor do b:");
            b = scan.nextDouble();

            System.out.println("Digite o valor do c:");
            c = scan.nextDouble();

            delta = (b*b) - (4*a*c);

            x1 = (- b + Math.sqrt(delta)) / 2*a;

            x2 = (- b - Math.sqrt(delta)) / 2*a;

            System.out.println("O delta é: " + delta);
            System.out.println("O x1 é: " + x1);
            System.out.println("O x2 é: " + x2);



        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido!");
        }
    }
}
