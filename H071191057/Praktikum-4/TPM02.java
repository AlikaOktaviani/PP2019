import java.util.Scanner;
class TPM02{
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int i = alk.nextInt();
        int j = alk.nextInt();
        int k = alk.nextInt();

        int matriksA[][] = new int[i][j];
        int matriksB[][] = new int[j][k];

        //matriks A
        for (int a = 0; a < i; a++){
            for (int b = 0; b < j; b++){
                matriksA[a][b] = alk.nextInt();
            }
        }
        //matriks B
        for (int b = 0; b < j; b++){
            for (int c = 0; c < k; c++){
                matriksB[b][c] = alk.nextInt();
            }
        }
        System.out.println();

        //perkalian matriks A dan matriks B
        for (int a = 0; a < i; a++){
            for (int c = 0; c < k; c++){
                int sum = 0;
                for (int b = 0; b < j; b++){
                    sum += matriksA[a][b]*matriksB[b][c];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

         
    }
}