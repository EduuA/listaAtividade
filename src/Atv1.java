public class Atv1 {

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5 };
        int resultado = soma(vetor, vetor.length);
        System.out.println("Soma dos elementos: " + resultado);
    }

    public static int soma(int[] vetor, int n) {
        if (n <= 0) {
            return 0;
        }
        return vetor[n - 1] + soma(vetor, n - 1);
    }

}
