//Exemplo de Sobrecarga de metodos

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Àrea de quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Àrea do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Àrea do trapézio: " + ((baseMaior+baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2){
        System.out.println("Àrea do losango: " + (diagonal1 * diagonal2) / 2);
    }
}
