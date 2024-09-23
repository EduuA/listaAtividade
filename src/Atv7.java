public class Atv7 {

    public static void main(String[] args) {
        String exemplo = "A man a plan a canal Panama";
        boolean resultado = isPalindromo(exemplo);
        System.out.println("\"" + exemplo + "\" é um palíndromo? " + resultado);
    }

    public static boolean isPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindromo(str.substring(1, str.length() - 1));
    }

}
