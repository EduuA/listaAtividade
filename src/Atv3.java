public class Atv3 {

    public static void main(String[] args) {
        String original = "Hello";
        String invertida = inverter(original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverter(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + inverter(str.substring(0, str.length() - 1));
    }

}
