public class Atv6 {

    public static void main(String[] args) {
        int primeiroTermo = 2;
        int razao = 3;
        int n = 5;
        int resultado = termoPA(primeiroTermo, razao, n);
        System.out.println("O " + n + "º termo da PA é: " + resultado);
    }

    public static int termoPA(int a1, int razao, int n) {
        if (n == 1) {
            return a1;
        }
        return termoPA(a1, razao, n - 1) + razao;
    }

}
