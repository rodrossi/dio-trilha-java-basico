public class TiposVariaveis {
    public static void main(String[] args) {
        // tipos primitivos

        String meuNome = "Rodrigo Rossi";

        // o ponto flutuante normalmente fica nos centavos(R$ 2.500,00)
        double salarioMinimo = 2500.00;
        System.out.println("R$ " + salarioMinimo);

        //Tomar cuidado com os tipos de atribuições
        short mumeroCurto = 1;
        int numeroNormal = mumeroCurto;
        short numereoCurto2 = (short) numeroNormal;


        //variaveis podem sofrer mudanças
        int numero = 5;
        numero = 10;

        System.out.println(numero);

        //Constantes precisam estar com a palavra reservada "final"
        final double VALOR_DE_PI = 3.14;
    }
}