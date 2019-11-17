import java.util.Scanner;

class TPM01 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int a = alk.nextInt();
        int b = alk.nextInt();
        // nilaiFPB(a, b);
        System.out.println("FPB dari " + a + " dan " + b + " = " + cariFPB(a, b));
    }

    static int cariFPB(int a, int b) {
        int fpb = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                fpb = i;
            }
        }
        return fpb;
    }
}