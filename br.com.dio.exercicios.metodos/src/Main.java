//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // chamada dos métodos da classe calculadora

        System.out.println("Os resultados das chamadas dos métodos da classe Calculadora são: ");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Chamada do obterMensagem

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);
        Mensagem.obterMensagem(34);

        //Empréstimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelsa());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }
}