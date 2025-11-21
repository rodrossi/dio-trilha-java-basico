public class Operadores {
    public static void main(String[] args) {
       /* int numero = 5;

        //x repetição
        numero++; // incrementa +1 ao numero

        System.out.println(numero);*/

       /* boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);*/

        //operações ternario
        /*int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);*/

        //Operadores relacionais
        String nomeUm = "Rodrigo";
        String nomeDois = new String("Rodrigo");
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        if (numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior de numeroDois? " + simNao);
        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor de numeroDois? " + simNao);



    }
}
