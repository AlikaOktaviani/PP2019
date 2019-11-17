import java.util.Scanner;

class TPM03 {
    public static void main(String[] args) {
        Scanner alk = new Scanner(System.in);
        int n = alk.nextInt();
        myDay(n);
    }

    public static void myDay(int n) {
        System.out.println(tahun(n) + " tahun");
        System.out.println(bulan(n) + " bulan");
        System.out.println(hari(n) + " hari");

    }

    public static int tahun(int n) {
        int tahun = n / 365;
        return tahun;
    }

    public static int bulan(int n) {
        int bulan = (n % 365) / 30;
        return bulan;
    }

    public static int hari(int n) {
        int hari = n % 365 % 30;
        return hari;
    }

}