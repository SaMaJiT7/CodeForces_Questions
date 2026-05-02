package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class little_girl {
    // 1. FastReader Class for efficient input
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
        int n = fr.nextInt() , q = fr.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i <= n; i++) arr[i] = fr.nextInt();

        int[] diff = new int[n+2];
        diff[0] = 0;
        for(int i = 0; i < q; i++){
            int l = fr.nextInt();
            int r = fr.nextInt();
            diff[l]++;
            diff[r+1]--;
        }

        for(int i = 1; i < n+1; i++){
            diff[i] = diff[i] + diff[i-1];
        }
        Arrays.sort(arr);
        Arrays.sort(diff,1,n+1);

        long result = 0;
        for(int i = 1; i <= n; i++){
            result += (long)arr[i] * diff[i];
        }
        out.println(result);
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
