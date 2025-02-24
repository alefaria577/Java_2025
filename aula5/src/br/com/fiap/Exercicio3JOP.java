package br.com.fiap;

import javax.swing.*;

public class Exercicio3JOP {
    //main
    public static void main(String[] args) {
        double raio, area;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite o valor do raio");
            raio = Double.parseDouble(auxiliar);
            area = Math.PI * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "A area é: " + area);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Formato de número incorreto!");
        }
    }
}
