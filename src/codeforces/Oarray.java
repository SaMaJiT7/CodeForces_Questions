package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Oarray {
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
        int n = fr.nextInt() ;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = fr.nextInt();
        }
        boolean[] used = new boolean[n];
        Arrays.fill(used,false);
        List<Integer> ans = new ArrayList<>();

        int mask = 0; int index = 0;
        for(int iter = 30; iter >= 0; iter--){
            int maxmask = mask;
            index = -1;

            for(int i = 0 ; i < n; i++){
                if(!used[i] && (a[i] | mask) >  maxmask){
                    maxmask = (a[i] | mask);
                    index = i;
                }
            }

            if(index == -1) break;

            used[index] = true;
            ans.add(a[index]);
            mask = maxmask;
        }
        for(int i = 0; i < n; i++) if(!used[i]) ans.add(a[i]);

        for(int i = 0; i < n; i++){
            out.print(ans.get(i) + " ");
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
