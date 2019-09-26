import java.util.Scanner;
class Modul1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x < y){
            for (int i = x; i <= y; i++){
                System.out.print(i);
                if (i != 0){
                    if (i % 2 == 0){
                        System.out.print(" genap");
                    } else if (i % 2 != 0){
                        System.out.print(" ganjil");
                    }
                    if (i > 0){
                        System.out.println(" positif");
                    } else if (i < 0){
                        System.out.println(" negatif");
                    }
                } else if (i == 0){
                    System.out.println(" nol");
                }
            }
        } else {
            for (int i = y; i <= x; i++){
                System.out.print(i);
                    if (i % 2 == 0){
                        System.out.print(" genap");
                    } else if (i % 2 != 0){
                        System.out.print(" ganjil");
                    }
                    if (i > 0){
                        System.out.println(" positif");
                    } else if (i < 0){
                        System.out.println(" negatif");
            } else if (i ==0){
                System.out.println(" nol");
            }
            }
        }


        
        }
        
    }



        

            
    
    
    