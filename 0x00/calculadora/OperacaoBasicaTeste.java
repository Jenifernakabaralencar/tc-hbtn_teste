public class OperacaoBasicaTeste {

    public static boolean testar_soma() {
        double somar = OperacaoBasica.somar(5, 3);
        if (somar == 8) {
            return true;
        }
        return false;
    }
    public static boolean testar_subtracao() {
        double subtrair = OperacaoBasica.subtrair(5,3);
        if (subtrair == 2) {
            return true;
        }
        return false;
    }
    public static boolean testar_multiplicacao() {
        double multiplicar = OperacaoBasica.multiplicar(5,3);
        if (multiplicar == 15) {
            return true;
        }
        return false;
    }
    public static boolean testar_divisao() {
        double testar_divisao = OperacaoBasica.dividir(9,3);
        if (testar_divisao == 3) {
            return true;
        }
        return false;
    }
}
