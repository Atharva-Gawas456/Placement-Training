import java.util.Scanner;

public class MissingNumber {

    public static int missing(int[] arr) {
        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;

        for (int a : arr)
            sum -= a;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(missing(arr));

        sc.close();
    }
}
