package br.com.fiap;

import javax.swing.*;

public class Exercicio2JOP {
    //main
    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano de Nascimento");
            anoNascimento = Integer.parseInt(auxiliar);

            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Formato de número incorreto!");
        }
    }
}
