import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char a = s.charAt(0);
        int count = 1;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                count++;
            } else {
                if (count % 2 == 0)
                    ans += count;
                a = s.charAt(i);
                count = 1;
            }
        }
        if (count % 2 == 0)
            ans += count;
        System.out.print(ans);
        sc.close();
    }
}
