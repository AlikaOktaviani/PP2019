import java.util.*;
import java.io.*;
class Praktikum82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FileWriter fwriter = null;
        PrintWriter writer = null;
        FileReader freader = null;
        BufferedReader reader = null;

        String file = sc.next() + ".txt";
        String file2 = sc.next() + ".txt";
        
        try {
            freader = new FileReader(file);
            reader = new BufferedReader(freader);
            fwriter = new FileWriter(file2);
            writer = new PrintWriter(fwriter);

            String data;
            int max = 0;
            
            while ((data = reader.readLine()) != null) {
                max = data.length() > max ? data.length() : max;
            }
            
            freader = new FileReader(file);
            reader = new BufferedReader(freader);

            String cek;
            while ((cek = reader.readLine()) != null) {
                writer.printf("%"+max+"s %n", cek);
            }

            System.out.println("Berhasil");
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if(fwriter != null) {
                    fwriter.close();
                }
                if (freader != null) {
                    freader.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    
    }
}