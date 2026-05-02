package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class forest_queries {
    public static class FastReader {
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

        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
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
    public static void solve(FastReader fr, PrintWriter out) {
        int n = fr.nextInt() , q = fr.nextInt();
        char[][] nums = new char[n+1][n+1];
        for(int i = 1; i <= n; i++){
            String s = fr.next();
            for (int j = 1; j <= n; j++) {
                nums[i][j] = s.charAt(j - 1);
            }
        }

        int[][] prefix = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int val = (nums[i][j] == '*' ? 1 : 0);
                prefix[i][j] = val + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }

        for(int i = 0; i < q; i++){
            int y1 = fr.nextInt();
            int x1 = fr.nextInt();
            int y2 = fr.nextInt();
            int x2 = fr.nextInt();

            int ans = prefix[y2][x2] - prefix[y2][x1-1] - prefix[y1-1][x2] + prefix[y1-1][x1-1];
            out.println(ans);
        }
    }


    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        FastReader fr = new FastReader();
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
