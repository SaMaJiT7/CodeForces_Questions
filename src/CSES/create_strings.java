package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class create_strings {
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
        int[] freq = new int[26];
        String s = fr.nextLine();
        int n = s.length();
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        List<String> res = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        dfs(freq,ans,res,n);
        out.println(res.size());
        for(String val : res){
            out.println(val);
        }
    }
    public static void dfs(int[] freq, StringBuilder ans, List<String> res,int n){
        if(ans.length() == n){
            res.add(ans.toString());
            return;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                ans.append((char) (i+'a'));
                freq[i]--;
                dfs(freq,ans,res,n);
                ans.deleteCharAt(ans.length()-1);
                freq[i]++;
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
