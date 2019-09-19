import java.util.Scanner;
import java.util.InputMismatchException;
class Modul1{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        try{
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        genap = (a % 2 == 0 ? 1 : 0) + (b % 2 == 0 ? 1 : 0) + (c % 2 == 0 ? 1 : 0) + (d % 2 == 0 ? 1 : 0) + (e % 2 == 0 ? 1 : 0);
        ganjil = (a % 2 == 1 ? 1 : 0) + (b % 2 == 1 ? 1 : 0) + (c % 2 == 1 ? 1 : 0) + (d % 2 == 1 ? 1 : 0) + (e % 2 == 1 ? 1 : 0);
        positif = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) + (d > 0 ? 1 : 0) + (e > 0 ? 1 :0); 
        negatif = (a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0) + (d < 0 ? 1 : 0) + (e < 0 ? 1 : 0);

            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");
        
            } catch (Exception x) {
                System.out.println("Inputan Tidak Valid");

            } finally {
                System.out.println("");

            } input.close();

            }
        }
       