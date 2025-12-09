package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

/*
Faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantDeNumero;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Digite a Quantidade de Numeros para calculo: ");
        quantDeNumero = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                quantPares++;
            }else {
                quantImpares++;
            }
            count++;
        } while (count < quantDeNumero);

        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);
    }
}
