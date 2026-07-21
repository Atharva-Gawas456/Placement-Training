import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String key = sc.next();

        String ans = "";

        for (char ch : key.toCharArray()) {
            for (char c : s.toCharArray()) {
                if (ch == c) {
                    ans += c;
                }
            }
        }
        System.out.print(ans);

        sc.close();
    }
}
