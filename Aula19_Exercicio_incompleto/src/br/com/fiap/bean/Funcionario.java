package br.com.fiap.bean;

public class Funcionario {

    //atributos
    private String nome;
    private float valorHoraTrabalho;
    private float horasTrabalhadas;


    // construtores
    public Funcionario() {
    }
    public Funcionario(String nome, float valorHoraTrabalho, float horasTrabalhadas ) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho(){
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // métodos da classe (particulares)
    public float calcularSalario() {
        return valorHoraTrabalho * horasTrabalhadas;
    }



}
