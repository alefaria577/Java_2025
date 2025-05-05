package br.com.fiap.bean;

public class Vendedor extends Funcionario{

    //atributos
    private float adicionalNoturno;

    //construtores
    public Vendedor(){

    }
    public Vendedor(String nome, float valorHoraTrabalho, float horasTrabalhadas, float adicionalNoturno ){
        super(nome);
        super(valorHoraTrabalho);
        super(horasTrabalhadas);
        this.adicionalNoturno = adicionalNoturno;
    }

    //método getters e setters
    public float getAdicionalNoturno(){
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno){
        this.adicionalNoturno = adicionalNoturno;
    }

    // métodos da classe (particulares)
    public float calcularSalario() {
        return super.getValorHoraTrabalho() * super.getHorasTrabalhadas() * (1 + adicionalNoturno / 100);
    }




}
