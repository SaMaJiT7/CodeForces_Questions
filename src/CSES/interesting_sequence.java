package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class interesting_sequence {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
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

        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        public String nextLine() {
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

    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt(),m = fr.nextInt();
        if(n == 1){
            out.println("YES");
            out.println(m);
            return;
        }
        if(n > m) {
            out.println("NO");
            return;
        }
        if ((n & 1) == 0 && (m & 1) == 1) {
            out.println("NO");
            return;
        }

        out.println("YES");

        if ((n & 1) == 1) {
            for (int i = 1; i <= n - 1; i++) {
                out.print(1 + " ");
            }
            out.println(m - (n - 1));
        } else {
            for (int i = 1; i <= n - 2; i++) {
                out.print(1 + " ");
            }

            int val = (m - (n - 2)) / 2;
            out.println(val + " " + val);
        }
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
