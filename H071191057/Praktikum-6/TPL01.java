import java.util.Scanner;

class TPL01 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        System.out.println("Masukkan Inputan");
        String input = alk.nextLine();
        int panjang = input.length();
        String part1, part2;

        if (panjang % 2 != 0) {
            part1 = input.substring(0, ((panjang / 2) + 1));
            part2 = input.substring(panjang / 2) + 1;
        } else {
            part1 = input.substring(0, (panjang / 2));
            part2 = input.substring(panjang / 2);
        }

        // untuk membalik kata part2
        String balikPart2 = "";
        for (int i = part2.length() - 1; i >= 0; i--) {
            balikPart2 = balikPart2 + part2.charAt(i);
        }

        // part1 digeser ke kanan sebanyak 3 kali
        char c[] = part1.toCharArray();
        for (int i = 0; i < part1.length(); i++) {
            c[i] += 3;
        }
        String str = String.valueOf(c); // konversi char ke string

        System.out.println((balikPart2 + str).toUpperCase());

    }
}