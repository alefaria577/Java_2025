package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    // atributos
    private String nome;
    private int anoNascimento;


    // construtores
    //para gerar automático --> Botão direito --> Generate --> Construtor
    public Pessoa() {
    }
    // Shift ou ctrl --> atalhos para selecionar os atributos ao criar o construtor
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        //this.anoNascimento = anoNascimento;
        setAnoNascimento(anoNascimento);
    }

    //métodos getters/setters

    //para gerar automático --> Botão direito --> Generate --> Getter and Setter
    //obs: está minimizado com toggle
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try {
            //ifn
            if (anoNascimento >= 1900 && anoNascimento <= dataAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Valor inválido ( min= 1900,  max= Ano Atual)");

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //métodos da classe (particulares)
    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }




}