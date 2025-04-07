package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    //main
    public static void main(String[] args) {

        //demonstrando sem o construtor
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setAnoNascimento(2070);
        int idade = pessoa1.calcularIdade(2025);

        //demonstrando a vantagem do construtor
        Pessoa pessoa2 = new Pessoa("José", 2100);

        System.out.printf("Pessoa 1\nNome: %s\nIdade %d anos", pessoa1.getNome(), idade);
        System.out.printf("Pessoa 2\nNome: %s\nIdade %d anos", pessoa2.getNome(), pessoa2.calcularIdade(2025));

    }
}
