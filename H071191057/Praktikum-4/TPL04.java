import java.util.Scanner;

class TPL04 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int n = alk.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = alk.nextInt();
            }
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (arr[i][j] == 0 && arr[i][j] != arr[i - 1][j] && arr[i][j] != arr[i + 1][j]) {
                    if (arr[i][j] != arr[i][j - 1] && arr[i][j] != arr[i][j + 1]) {
                        System.out.println(i + " , " + j);
                    }
                }
            }
            System.out.println();
        }

    }
}
