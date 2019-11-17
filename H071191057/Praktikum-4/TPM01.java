import java.util.Scanner;

class TPM01 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int n = alk.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = alk.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                int fpb = 0;
                for (int k = a < b ? a : b; k > 0; k--) {
                    if (a % k == 0 && b % k == 0) {
                        fpb = k;
                        break;
                    }
                }
                if (fpb == 1) {
                    System.out.printf("%d %d\n", a, b);
                }

            }
        }
    }
}