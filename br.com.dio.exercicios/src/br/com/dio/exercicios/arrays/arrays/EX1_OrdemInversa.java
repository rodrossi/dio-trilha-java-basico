package br.com.dio.exercicios.arrays.arrays;

public class EX1_OrdemInversa {
    public static void main(String[] args) {

        System.out.println("Vetor:");
        int[] vetor = {-5, -6, 15, 50, 8, 4 };
        int count = 0;
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Inverso:");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
