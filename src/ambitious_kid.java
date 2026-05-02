import java.io.PrintWriter;

public class ambitious_kid {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int N = fr.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = fr.nextInt();
        }
        int answer = Math.abs(nums[0]);
        for(int i = 1; i < N; i++){
            answer = Math.min(answer,Math.abs(nums[i]));
        }

        out.println(answer);
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

//        int t = fr.nextInt(); // Read the number of test cases
//        while (t-- > 0) {
//            solve(fr, out);   // Run your logic for each case
//        }
        solve(fr, out);

        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
