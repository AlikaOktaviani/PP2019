import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
class Praktikum83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Nama File");
        String nameFile = sc.next() + ".txt" ;

        FileWriter file = null;
        PrintWriter writer = null;
        
        try {
            file = new FileWriter(nameFile);
            writer = new PrintWriter(file);

            System.out.println("Input Banyak Data");
            int jumlah = sc.nextInt();
        
            System.out.println("Input nama, nim, angkatan");
            String[] nama = new String[jumlah];
            String[] nim = new String[jumlah];
            int[] angkatan = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                nama[i] = sc.next();
                nim[i] = sc.next();
                angkatan[i] = sc.nextInt();
            }

            String tbl = "| %-20s | %-10s | %-10d |%n";

            writer.println("+----------------------+------------+------------+");
            writer.println("| Nama                 | NIM        | Angkatan   |");
            writer.println("+----------------------+------------+------------+");
            for (int i = 0; i < jumlah; i++) {
                writer.printf(tbl, nama[i] , nim[i], angkatan[i]);
            }
            writer.printf("+----------------------+------------+------------+%n");

            System.out.println("Berhasil");
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if(writer != null) {
                    writer.close();
                }
                if (writer != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }

}