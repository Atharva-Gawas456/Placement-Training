import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rem = n % 3;
        int quo = n / 3;

        if (rem == 0)
            System.out.println((int) Math.pow(3, quo));

        if (rem == 1)
            System.out.println(4 * (int) Math.pow(3, quo - 1));

        if (rem == 2)
            System.out.println(2 * (int) Math.pow(3, quo));
        sc.close();

    }
}
