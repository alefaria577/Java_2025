package br.com.fiap;

import java.util.Scanner;

public class Exercicio2Scanner {
    //main
    public static void main(String[] args) {

        {
            int anoAtual, anoNascimento, idade;
            Scanner scan;
            try {
                scan = new Scanner(System.in);
                System.out.println("Digite o ano atual:");
                anoAtual = scan.nextInt();
                System.out.println("Digite o ano de nascimento: ");
                anoNascimento = scan.nextInt();
                idade = anoAtual - anoNascimento;
                System.out.println("Sua idade é:" + idade);

            } catch (Exception e){
                System.out.println("Formato incorreto de número");
            }

        }


    }



    }


