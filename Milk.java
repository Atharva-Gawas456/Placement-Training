import java.util.Scanner;

public class Milk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();

        int lit = 0;

        while (n >= r1 || n >= r2) {
            if (r2 == r3) {
                lit = Integer.MAX_VALUE;
                break;
            }
            if (n >= r2) {
                n -= r2;
                n += r3;
                lit++;
            } else if (n >= r1) {
                n -= r1;
                lit++;
            }
        }
        System.out.print(lit);
        sc.close();
    }
}
