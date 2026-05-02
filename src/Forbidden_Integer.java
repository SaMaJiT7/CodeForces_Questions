import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Forbidden_Integer {
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
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt(), k = fr.nextInt(), x = fr.nextInt();
        if (x != 1) {
            out.println("YES");
            out.println(n);
            for (int i = 0; i < n; i++) out.print(1 + " ");
            out.println();
        }
        else {
            if (k < 2 || (n % 2 != 0 && k < 3)) {
                out.println("NO");
            } else {
                out.println("YES");
                ArrayList<Integer> res = new ArrayList<>();
                if (n % 2 != 0) {
                    res.add(3);
                    n -= 3;
                }
                while (n > 0) {
                    res.add(2);
                    n -= 2;
                }
                out.println(res.size());
                for (int i = 0; i < res.size(); i++) {
                    out.print(res.get(i) + (i == res.size() - 1 ? "" : " "));
                }
                out.println();
            }
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
        //solve(fr, out);

        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
