import java.util.Scanner;

class TPL01 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int sum = 0;

        int m = alk.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = alk.nextInt();
            sum += arr[i];
        }

        int n = alk.nextInt();
        int arr1[] = new int[n];
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = alk.nextInt();
            boolean isSame = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr1[j] == arr[i]) {
                    isSame = true;
                    break;
                }
            }
            sum += isSame ? 0 : arr1[j];
        }
        System.out.println("Jumlah " + sum);
    }
}