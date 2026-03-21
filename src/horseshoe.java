import java.util.Arrays;
import java.util.Scanner;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] shoe = new long[4];
        for (int i = 0; i < shoe.length; i++) {
            shoe[i] = sc.nextLong();
        }
        Arrays.sort(shoe);
        int count = 0;
        for (int i = 1; i < shoe.length; i++) {
            if(shoe[i-1] == shoe[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
