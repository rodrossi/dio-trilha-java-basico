public class Emprestimo {

    public static int getDuasParcelsa(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double taxaDuasPArcelas(){
        return 0.3;
    }

    public static double taxaTresPArcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * taxaDuasPArcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * taxaTresPArcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }
}
