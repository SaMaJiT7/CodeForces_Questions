import java.util.Scanner;

public class color {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noofstone = scan.nextInt();
        String colofstone = scan.next();
        int c = 0;
        if (colofstone.chars().allMatch(ch ->ch == colofstone.charAt(0))){
            System.out.println(noofstone-1);
        }
        else {
            for (int i = 1; i < noofstone; i++) {
                if (colofstone.charAt(i) == colofstone.charAt(i - 1)) {
                    c++;
                }
            }

            System.out.print(c);
        }
    }
}

