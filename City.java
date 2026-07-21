import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int currEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currEnd) {
                count++;
                currEnd = farthest;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
