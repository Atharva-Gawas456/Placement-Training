import java.util.Scanner;

public class Rock {
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++)
            ans *= i;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int I = sc.nextInt();

        int x = sc.nextInt();

        int num = n - I;

        if(x < 1) System.out.println("Cannot Move");
        if(x == 1) System.out.println(1);
        if(x > num) System.out.println(0);

        int count = 0;

        while(num >= x){
            num -= x;
            count++;
        }
        if(num > 0) count++;

        System.out.println(fact(count));
        sc.close();
    }
}
