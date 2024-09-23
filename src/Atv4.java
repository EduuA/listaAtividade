public class Atv4 {

    public static void main(String[] args) {
        int[] vetor = { 3, 5, 2, 9, 1 };
        int maior = encontrarMaior(vetor, vetor.length);
        System.out.println("Maior valor: " + maior);
    }

    public static int encontrarMaior(int[] vetor, int n) {
        if (n == 1) {
            return vetor[0];
        }
        return Math.max(vetor[n - 1], encontrarMaior(vetor, n - 1));
    }

}
