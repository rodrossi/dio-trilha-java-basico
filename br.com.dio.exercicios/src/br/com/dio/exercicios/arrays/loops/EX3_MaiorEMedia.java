package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 numeros
e informe o maior numero
e a media desses numeros
 */
public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maiorNumero = 0;
        double soma = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNumero){
                maiorNumero = numero;
            }
            count++;
        } while (count < 5);

        System.out.println("O maior numero é o: " + maiorNumero);
        System.out.println("Soma: " + soma);
        System.out.println("A media é: " +  soma / 5);
    }
}
