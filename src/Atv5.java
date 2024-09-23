public class Atv5 {

    public static void main(String[] args) {
        double base = 2;
        int expoente = 3;
        double resultado = potencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado);
    }

    public static double potencia(double b, int e) {
        if (e == 0) {
            return 1;
        }
        if (e < 0) {
            return 1 / potencia(b, -e);
        }
        return b * potencia(b, e - 1);
    }

}
