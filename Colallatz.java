import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Colallatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        while (n > 1) {
            list.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        list.add(1);
        System.out.print(list);

        sc.close();

    }
}