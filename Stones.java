import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ans ^= a;
        }
        System.out.print(ans);
        sc.close();
    }
}