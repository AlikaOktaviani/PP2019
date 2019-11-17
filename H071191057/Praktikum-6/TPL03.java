import java.util.Scanner;

class TPL03 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int n = alk.nextInt();

        // tengah
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // kanan
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= n; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // kiri
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}