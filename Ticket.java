import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        s = s.replace("E", "");
        s = s.replace("F", "");
        s = s.replace("G", "");

        System.out.println(s);

        sc.close();

    }
}
