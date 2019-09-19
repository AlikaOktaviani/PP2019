import java.util.Scanner;
class Modul2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Datar\n");
        System.out.println("Input Angka sesuai dengan Menu yang diinginkan :");
        int menu = in.nextInt();

        switch (menu){
            case 1:
            System.out.println("** Pilih Bangun Datar ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang\n");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");

                int bangunDatar = in.nextInt();
                switch (bangunDatar){
                    case 1:
                    System.out.println("Input Panjang :");
                    int panjang = in.nextInt();
                    System.out.println("Input Lebar :");
                    int lebar = in.nextInt();
                    double luas = panjang * lebar ;
                    System.out.println("Luas Persegi Panjang = " + luas);
                    break;
                    case 2:
                    System.out.println("Input Panjang :");
                    int panjang1 = in.nextInt();
                    System.out.println("Input Lebar :");
                    int lebar1 = in.nextInt();
                    luas = panjang1 * lebar1;
                    System.out.println("Luas persegi Panjang = " + luas);
                    break;
                    case 3:
                    System.out.println("Input Alas :");
                    int alas = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi = in.nextInt();
                    luas = alas * tinggi;
                    System.out.println("Luas segitiga = " + luas);
                    break;
                    case 4:
                    System.out.println("Input Jari-jari :");
                    int jari = in.nextInt();
                    luas = Math.PI * Math.pow(jari, 2);
                    System.out.println("Luas Liangkaran = " + luas);
                    break;
                    case 5:
                    System.out.println("Input Alas :");
                    int alas1 = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi1 = in.nextInt();
                    luas = alas1 * tinggi1;
                    System.out.println("Luas Jajar Genjang = " + luas);
                    break;
                    case 6:
                    System.out.println("Input Sisi 1 :");
                    int sisi1 = in.nextInt();
                    System.out.println("Input Sisi 2 :");
                    int sisi2 = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi11 = in.nextInt();
                    luas = ((sisi1 + sisi2) * tinggi11 / 2);
                    System.out.println("Luas Trapesium = " + luas);
                    break;
                    case 7:
                    System.out.println("Input Diagonal 1 :");
                    int diagonal1 = in.nextInt();
                    System.out.println("Input Diagonal 2 :");
                    int diagonal2 = in.nextInt();
                    luas = (diagonal1 * diagonal2) / 2;
                    System.out.println("Luas Belah Ketupat = " + luas);
                    break;
                    case 8:
                    System.out.println("Input Diagonal 1 :");
                    int diagonal11 = in.nextInt();
                    System.out.println("Input Diagonal 2 :");
                    int diagonal22 = in.nextInt();
                    luas = (diagonal11 * diagonal22) / 2;
                    System.out.println("Luas Layang-Layang = " + luas);
                    break;
                    default:
                    System.out.println("Inputan Tidak Tersedia");
                } break;

            case 2:
            System.out.println("** Pilih Bangun Datar ");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segitiga");
            System.out.println("4. Limas Segiempat");
            System.out.println("5. Prisma");
            System.out.println("6. Tabung");
            System.out.println("7. Kerucut");
            System.out.println("8. Bola");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");

            int bangunRuang = in.nextInt();
                switch (bangunRuang){
                    case 1:
                    System.out.println("Input Sisi 1 :");
                    int sisi1 = in.nextInt();
                    System.out.println("Input Sisi 2 :");
                    int sisi2 = in.nextInt();
                    System.out.println("Input Sisi 2 :");
                    int sisi3 = in.nextInt();
                    double volume = sisi1 * sisi2 * sisi3;
                    System.out.println("Volume kubus = " + volume);
                    break;
                    case 2:
                    System.out.println("Input Panjang :");
                    int panjang = in.nextInt();
                    System.out.println("Input Lebar :");
                    int lebar = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi = in.nextInt();
                    volume = panjang * lebar * tinggi;
                    System.out.println("Volume Balok = " + volume);
                    break;
                    case 3:
                    System.out.println("Input Luas Alas :");
                    int lAlas = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi1 = in.nextInt();
                    volume = (lAlas * tinggi1) / 3;
                    System.out.println("Volume Limas Segitiga = " + volume);
                    break;
                    case 4:
                    System.out.println("Input Luas Alas :");
                    double lAlas1 = in.nextDouble();
                    System.out.println("Input Tinggi :");
                    double tinggi11 = in.nextDouble();
                    volume = (lAlas1 * tinggi11) / 2;
                    System.out.println("Input Limas Segiempat = " + volume);
                    break;
                    case 5:
                    System.out.println("Input Luas Alas :");
                    int lAlas11 = in.nextInt();
                    System.out.println("Input Tinggi :");
                    int tinggi111 = in.nextInt();
                    volume = lAlas11 * tinggi111;
                    System.out.println("Volume Prisma = " + volume);
                    break;
                    case 6:
                    System.out.println("Input Jari-jari :");
                    double jari = in.nextDouble();
                    System.out.println("Input Tinggi :");
                    double tinggii1 = in.nextDouble();
                    volume = (Math.PI * jari * jari) * tinggii1;
                    System.out.printf("Volume Tabung = %.2f" , volume);
                    break;
                    case 7:
                    System.out.println("Input Jari-Jari :");
                    double jari1 = in.nextDouble();
                    System.out.println("Input Tinggi :");
                    double tinggii = in.nextDouble();
                    volume = ((Math.PI * jari1 * jari1) * tinggii) / 3;
                    System.out.println("Volume Kerucut = " + volume);
                    break;
                    case 8:
                    System.out.println("Input Jari-Jari :");
                    int jari11 = in.nextInt();
                    volume = ((Math.PI * jari11 * jari11 *jari11) * 4 / 3);
                    System.out.println("Volume Bola = " + volume);
                    break;
                    default:
                    System.out.println("Inputan Tidak Tersedia");
                    break;
                } 
        }
    }
}