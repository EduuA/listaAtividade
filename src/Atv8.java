public class Atv8 {
    public static void main(String[] args) {
        // Exemplo da sequência de Fibonacci
        System.out.println("Fibonacci(5): " + fibonacci(5));

        // Exemplo de soma de vetor
        int[] vetorSoma = { 1, 2, 3, 4, 5 };
        System.out.println("Soma do vetor: " + soma(vetorSoma, vetorSoma.length));

        // Exemplo de inversão de string
        String strInverter = "hello";
        System.out.println("String invertida: " + inverter(strInverter));

        // Exemplo de maior valor em vetor
        int[] vetorMaior = { 3, 5, 2, 9, 1 };
        System.out.println("Maior valor: " + encontrarMaior(vetorMaior, vetorMaior.length));

        // Exemplo de potência
        System.out.println("2^3: " + potencia(2, 3));

        // Exemplo de PA
        System.out.println("5º termo da PA (a1=2, razão=3): " + termoPA(2, 3, 5));

        // Exemplo de palíndromo
        String palindromo = "A man a plan a canal Panama";
        System.out.println("\"" + palindromo + "\" é um palíndromo? " + isPalindromo(palindromo));
    }

    public static int fibonacci(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int soma(int[] vetor, int n) {
        if (n <= 0)
            return 0;
        return vetor[n - 1] + soma(vetor, n - 1);
    }

    public static String inverter(String str) {
        if (str.isEmpty())
            return str;
        return str.charAt(str.length() - 1) + inverter(str.substring(0, str.length() - 1));
    }

    public static int encontrarMaior(int[] vetor, int n) {
        if (n == 1)
            return vetor[0];
        return Math.max(vetor[n - 1], encontrarMaior(vetor, n - 1));
    }

    public static double potencia(double b, int e) {
        if (e == 0)
            return 1;
        if (e < 0)
            return 1 / potencia(b, -e);
        return b * potencia(b, e - 1);
    }

    public static int termoPA(int a1, int razao, int n) {
        if (n == 1)
            return a1;
        return termoPA(a1, razao, n - 1) + razao;
    }

    public static boolean isPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        if (str.length() <= 1)
            return true;
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindromo(str.substring(1, str.length() - 1));
    }

}
