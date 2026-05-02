package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class count_sum_subarray {
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
    static long mod = 1000000007L;
    public static void solve(FastReader fr, PrintWriter out) {
        int n = fr.nextInt() , x = fr.nextInt();
        long[] nums = new long[n];
        long[] prefix = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = fr.nextLong();
            if(i == 0) prefix[i] = nums[i];
            if(i > 0) prefix[i] = prefix[i-1] + nums[i];
        }
        HashMap<Long,Long> FreqMap = new HashMap<>();
        FreqMap.put(0L,1L);
        long count = 0;
        for(int i = 0; i < n; i++){
            long p = prefix[i];
            long s = p - x;
            if(FreqMap.containsKey(s)){
                count = count + FreqMap.get(s);
            }
            FreqMap.put(p,FreqMap.getOrDefault(p,0L)+1);
        }
        out.println(count);
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
