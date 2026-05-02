package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class codechef_prefixsum {
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
        int n = fr.nextInt() , m = fr.nextInt();
        int[][] grid = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                grid[i][j] = fr.nextInt();
            }
        }
        int[][] prefix = new int[n+1][m+1];
        for(int i = 0; i <= n; i++) prefix[i][0] = 0;
        for(int j = 0; j <= m; j++) prefix[0][j] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                prefix[i][j] = (grid[i][j] == 0 ? 1 : 0);

                if(i > 0) prefix[i][j] += prefix[i-1][j];
                if(j > 0) prefix[i][j] += prefix[i][j-1];
                if(i > 0 && j > 0) prefix[i][j] -= prefix[i-1][j-1];
            }
        }
        int q = fr.nextInt();
        for(int i = 1; i <= q; i++){
            int a = fr.nextInt() , b = fr.nextInt(),  c = fr.nextInt(),  d = fr.nextInt();

            int count = prefix[c][d] - prefix[c][b-1] - prefix[a-1][d] + prefix[a-1][b-1];

            if(count > 0){
                out.println(0);
            }
            else{
                out.println(1);
            }
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
