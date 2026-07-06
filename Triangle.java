import java.util.Scanner;

public class Triangle {
    public static String isPossible() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        double t = (double) (n * m) / k;

        for (int x1 = 1; x1 <= n; x1++) {
            for (int y1 = 0; y1 <= m; y1++) {
                for (int x2 = 0; x2 <= n; x2++) {
                    for (int y2 = 0; y2 <= m; y2++) {
                        double area = 0.5 * Math.abs(x1 * (y2 - y1) + x2 * (y1 - 0) + n * (0 - y2));
                        if (area == t) {
                            return "YES";
                        }
                    }
                }
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(isPossible());
    }
}
