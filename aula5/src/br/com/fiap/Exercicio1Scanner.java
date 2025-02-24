package br.com.fiap;

import java.util.Scanner;

public class Exercicio1Scanner {
    //main
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite 1° nota: ");
            p1 = scan.nextFloat();
            System.out.println("Digite 2° nota: ");
            p2 = scan.nextFloat();
            System.out.println("Digite 3° nota: ");
            p3 = scan.nextFloat();
            System.out.println("Digite 4° nota: ");
            p4 = scan.nextFloat();
            media = (p1+p2+p3+p4) / 4;
            //sout
            System.out.println("Sua média é: "+ media) ;


        } catch (Exception e){
            System.out.println("Formato de número incorreto!");
        }
    }


}
