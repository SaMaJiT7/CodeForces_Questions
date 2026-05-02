import java.io.PrintWriter;

public interface goal_of_victory {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum += fr.nextInt();
        }
        out.println(-1 * sum);
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
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
}
