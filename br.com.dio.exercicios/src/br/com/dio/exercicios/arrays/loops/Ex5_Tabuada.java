package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

/*
       Desenvolva um gerador de tabuada de qualquer numero inteiro entre 1 a 10.
       O usuário deve informar de qual numero ele deseja ver a tabuada.
       A saida deve ser conforme exemplo abaixo:

       Tabuada do? 5
       5 X 0 = 0 ...
       5 x 10 = 50
        */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a tabuada você deseja ver? ");
        int tabuada = scan.nextInt();

        for (int i = 0; i <=10; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
