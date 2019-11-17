import java.util.Scanner;
class TPL02{
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int banyak = alk.nextInt();
        boolean sama = false;

        int arr[] = new int[banyak];

        for (int i = 0; i < banyak; i++){
            arr[i] = alk.nextInt();
        }
        for (int i = 0; i < banyak; i++){
            for (int j = i+1; j < banyak; j++){
                if (arr[i]==arr[j]){
                    sama = true;
                    System.out.println("Tedapat angka yang sama yaitu " + arr[i] + " yang terletak di indeks " + i + "," + j);
                }
            }
        }
        if (!sama){
            System.out.println("Tidak ada nilai yang sama");
        }
    }
}