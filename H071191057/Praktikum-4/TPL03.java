import java.util.Scanner;
class TPL03{
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int m = alk.nextInt();
        int n = alk.nextInt();
        int arr[][] = new int[m][n];

        //matriks
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = alk.nextInt();
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose matriks");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        } 
    }
}