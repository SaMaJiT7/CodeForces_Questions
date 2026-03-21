import java.util.Scanner;

public class sumcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        float a = 0;
        float b = 0;
        float c = 0;
        for (int i = 0; i < t; i++) {
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            if (a + b == c || a + c == b || b + c == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
