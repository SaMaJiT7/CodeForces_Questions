package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class co_growing_sequence {
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
        int n = fr.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) x[i] = fr.nextInt();
        int[] a = new int[n];
        y[0] = 0;
        a[0] = x[0] ^ y[0];
        for(int i = 1; i < n; i++){
            a[i] = x[i] ^ y[i];
            if((a[i-1] & a[i]) != a[i-1]){
                y[i] = a[i-1] & ~x[i];
                a[i] = x[i] ^ y[i];
            }
        }
        for(int i = 0; i < n; i++){
            out.print(y[i] + " ");
        }
        out.println();
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
