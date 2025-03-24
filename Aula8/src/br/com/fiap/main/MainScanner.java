package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            // leitura das informações
            System.out.print("Digite seu salário bruto: R$ ");
            salarioBruto = scan.nextDouble();
            System.out.print("Digite número de dependentes: ");
            numeroDeDependentes = scan.nextInt();
            System.out.print("Digite desconto de INSS: ");
            descontoINSS = scan.nextDouble();
            System.out.print("Digite valor de plano de saúde: R$ ");
            valorPlanoDeSaude = scan.nextDouble();
            // atribuir o valores ao objeto folha
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            // Exibindo as informações
            System.out.printf("Salário Bruto R$ %.2f \nNúmero de Dependentes: %d \nDesconto de INSS: %.1f%% \n" +
                    "Plano de Saúde: R$ %.2f \n Salário Líquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());




        }catch (Exception e){
            System.out.println("Formato incorreto");
        }

    }
}
