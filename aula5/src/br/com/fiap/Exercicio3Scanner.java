package br.com.fiap;

import java.util.Scanner;

public class Exercicio3Scanner {
    //main
    public static void main(String[] args) {

        {
            final double PI = 3.1416;
            double raio, area;
            Scanner scan;


            try {
                scan = new Scanner(System.in);
                System.out.println("Digite o valor do raio: ");
                raio = scan.nextDouble();
                //area = PI * (raio * raio);
                area = Math.PI * Math.pow(raio, 2);
                System.out.println("A area do círculo é: " + area);



            } catch (Exception e){
                System.out.println("Formato incorreto de número");
            }

        }


    }



    }


