package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String auxiliar, mensagem;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite salário bruto");
            salarioBruto = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite número de dependentes");
            numeroDeDependentes = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite desconto de INSS");
            descontoINSS = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o valor do plano de saúde");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            mensagem = String.format("Salário Bruto R$ %.2f \nNúmero de Dependentes: %d \nDesconto de INSS: %.1f%% \n" +
                    "Plano de Saúde: R$ %.2f \n Salário Líquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null, mensagem);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Formato incorreto");

        }
    }
}
