import java.util.Scanner;

class TPM01 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        String kata = alk.nextLine();
        int panjang = kata.length();

        String kata1 = kata.replace(" ", "").toUpperCase();
        String kata2 = kata1.substring(0, (panjang - 1) / 2);

        // palindrom
        String kataBalik = "";
        for (int i = 0; i < kata2.length() - 1; i++) {
            kataBalik = kata2.charAt(i) + kataBalik;
        }
        // hexa
        int hexa = panjang * panjang;
        String hex = String.format("%x", hexa);
        char simbol;
        // ?=huruf !=angka
        if (hex.charAt(0) > 64 && hex.charAt(0) < 91 || hex.charAt(0) > 96 && hex.charAt(0) < 123) {
            simbol = '?';
        } else {
            simbol = '!';
        }
        // %x=hexa %o=octal
        System.out.printf("#%x%s%s%o%c", hexa, kata2, kataBalik, panjang, simbol);
    }
}