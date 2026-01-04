import sobrecarga.retorno.QuadrilateroRetorno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Quadrilatero
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);


        System.out.println("Exercicio Quadrilatero com retorno");
        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("Àrea do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5,5);
        System.out.println("Àrea do retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(7,8,9);
        System.out.println("Àrea trapezio: " + areaTrapezio);
    }
}