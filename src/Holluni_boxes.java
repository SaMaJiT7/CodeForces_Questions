import java.io.PrintWriter;
import java.util.Arrays;

public class Holluni_boxes {
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }

    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        if (k > 1 || Arrays.equals(arr, arr2)) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
