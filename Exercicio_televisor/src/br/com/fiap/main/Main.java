package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv= new Televisor();
        tv.canal = 5;
        tv.volume = 7;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        System.out.printf("Volume atual: %d\nCanal atual: %d", tv.volume, tv.canal);

        ArCondicionado ar = new ArCondicionado();
        ar.temperatura = 25;
        ar.modo = "ventilar";
        ar.trocarModo("resfriar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        String mensagem = String.format("\nTemperatura atual: %d°C\nModo atual: %s", ar.temperatura, ar.modo);
        System.out.println(mensagem);
    }
}
