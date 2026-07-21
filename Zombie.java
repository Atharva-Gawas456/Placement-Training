import java.util.Scanner;
import java.util.Arrays;

public class Zombie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        boolean win = true;

        for (int i = 0; i < n; i++) {
            if (b < arr[i]) {
                win = false;
                break;
            }
            b = b - ((arr[i] % 2) + (arr[i]/2));
        }
        if(win) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
