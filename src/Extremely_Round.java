import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Extremely_Round {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // 2. The solve method: Your logic goes here
    static long mod = 1000000007L;
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        if(n <= 10){
            out.println(n);
            return;
        }
        int num = n;
        int count = 0;
        int rem = 0;
        while(num > 0){
            count = count + 1;
            rem = num % 10;
            num = num / 10;
        }
        int ans = ((count - 1) * 9) + rem;
        out.println(ans);
    }


    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }
//        solve(fr, out);

        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
