import java.util.Scanner;

public class Gold {
    public static boolean isPrime(int n){
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int factorCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int count = 0;

        for(int m = i; m <= j; m++){
            if(isPrime(factorCount(m))) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
