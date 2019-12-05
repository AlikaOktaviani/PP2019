import java.util.*;

class Angka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Loop jika b>a maka 1. jika b<a maka -1
        int c = b > a ? 1 : -1;

        for (int i = a; i != b; i += c) {
            checkAndAddSelfDiv(result, i);
        }
        checkAndAddSelfDiv(result, b);
        System.out.println(result);
    }

    static void checkAndAddSelfDiv(ArrayList<Integer> result, int i) {
        int x = i;

        boolean canDivide = true;
        while (x != 0) {
            int d = x % 10;
            x /= 10;

            if (d == 0) {
                if (x == 0)
                    continue;
                else {
                    canDivide = false;
                    break;
                }
            }
            if (i % d != 0) {
                canDivide = false;
                break;
            }
        }

        if (canDivide) {
            result.add(i);
        }
    }

}