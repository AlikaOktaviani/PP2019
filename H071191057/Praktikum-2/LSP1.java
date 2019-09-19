import java.util.Scanner;
class LSP1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Titik (" + x + "," + y + ") ");
        if (x < 0 && y > 0){
            if(x + y < 0){
                System.out.println("Kuadran 1");
            }else if(x+y>0){
                System.out.println("Kuadran 2");
            }else{
                System.out.println("Berada pada -x = y");
            }
        }else if (x>0 && y>0){
            if(x-y<0){
                System.out.println("Kuadran 3");
            }else if(x-y>0){
                System.out.println("Kuadran 4");
            }else{
                System.out.println("Berada pada x = y");
            }
        }else if (x>0 && y<0){
            if(x+y>0){
                System.out.println("Kuadran 5");
            }else if(x+y<0){
                System.out.println("Kuadran 6");
            }else{
                System.out.println("Berada pada x = -y");
            }
        }else if (x<0 && y<0){
            if(x-y>0){
                System.out.println("Kuadran 7");
            }else if(x+(-y)<0){
                System.out.println("Kuadran 8");
            }else{
                System.out.println("Berada pada -x = -y");
            }
        }else{
            if(x==0 && y!=0){
            System.out.println(x + " , " + y);
            }else{
                System.out.println(x + " , " + y);
            }
        }
        
        
    }
}