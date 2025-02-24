package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio1JOP {
    //main
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite a 1° nota");
            p1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a 2° nota");
            p2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a 3° nota");
            p3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a 4° nota");
            p4 = Float.parseFloat(auxiliar);
            media = (p1+p2+p3+p4) / 4;
            JOptionPane.showMessageDialog(null, "A média é: " + media);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Formato de número incorreto!");
        }
    }
}
