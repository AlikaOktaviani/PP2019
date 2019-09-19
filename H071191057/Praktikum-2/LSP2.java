import java.util.Scanner;
class LSP2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Waktu acara dimulai:");
        int jam1 = input.nextInt();
        int menit1 = input.nextInt();
        jam1 = (60*jam1) + menit1;
        System.out.println("Waktu acara berakhir:");
        int jam2 = input.nextInt();
        int menit2 = input.nextInt();
        jam2 = (60*jam2) + menit2;
        int durasi;
        int jam;
        int menit;

        if (jam2 > 0 && jam1 > 0 && menit2 > 0 && menit1 > 0) {
            if (jam2 < jam1) {
                durasi = (jam2 + 1440 - jam1 == 0) ? 1440 : jam2 + 1440 - jam1;
            } else {
                durasi = jam2 - jam1;
            }
            jam = durasi/60;
            menit = durasi % 60;
            System.out.printf("%02d:%02d", jam , menit);
        }
    }
}