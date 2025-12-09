package br.com.dio.exercicios.arrays.loops;

import java.io.NotActiveException;
import java.util.Scanner;

/*
Faça um programa que peça uma nota,entre zero e dez.
Mostre uma mensagem caso o valor seja invalido
e continue pedindo
até que o usuário informe um valor valido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite uma nota: ");
        int nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.printf("Digite novamente, nota invalida: ");
            nota = scan.nextInt();
        }
        System.out.println("OK, nota Valida!!");

    }
}
