import java.util.Scanner;
import java.util.Random;

class TPM02 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int n = alk.nextInt();
        int m = alk.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);

    }

    public static String generateSerial(int n, int m) {
        String str = "";
        String pisah = "-";
        Random nmr = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int acak = nmr.nextInt(10);
                str += acak;
            }
            if (i < n - 1) {
                str += pisah;
            }
        }
        return str;
    }
}