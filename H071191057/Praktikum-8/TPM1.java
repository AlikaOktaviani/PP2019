import java.io.*;
import java.util.Scanner;
class Praktikum81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        
        String namaFile = sc.next() + ".txt";
        String namaFile2 = sc.next() + ".txt";
        
        try {
            in = new FileInputStream(namaFile);
            out = new FileOutputStream(namaFile2);
            int data;
            while((data = in.read()) != -1){
                out.write(data);
            }
            
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Gagal");
        }
    }
}