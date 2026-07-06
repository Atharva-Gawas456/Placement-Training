import java.util.Scanner;

public class Pizza2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] pizza = new int[n];

        for (int i = 0; i < n; i++) {
            pizza[i] = sc.nextInt();
        }
        int ans = 0;
        int count = 1;
        int first = pizza[0];

        for (int i = 1; i < n; i++) {
            if (pizza[i] == first) {
                count++;
            } else {
                first = pizza[i];
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
