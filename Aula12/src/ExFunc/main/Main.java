package ExFunc.main;

import ExFunc.bean.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Andre");
        funcionario1.setValorHoraTrabalho(100);

        int salario = funcionario1.calcularSalario();
        System.out.printf("Pessoa 1\nNome: %s\nIdade %d anos", funcionario1.getNome(), salario);
    }
}
