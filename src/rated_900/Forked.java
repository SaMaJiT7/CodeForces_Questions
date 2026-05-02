package rated_900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Forked {
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
    public static void solve(FastReader fr, PrintWriter out) {
        int a = fr.nextInt(), b = fr.nextInt();
        //King's posi
        int xk = fr.nextInt() , yk = fr.nextInt();
        //Queen's Posi
        int xq = fr.nextInt(), yq = fr.nextInt();
        int[][] move = {{+a,+b},{+a,-b},{-a,+b},{-a,-b},{+b,+a},{+b,-a},{-b,+a},{-b,-a}};
        HashSet<String> king = new HashSet<>();
        HashSet<String> queen = new HashSet<>();
        for(int[] val : move){
            int dx = val[0];
            int dy = val[1];
            //King's position
            int Xk = xk + dx;
            int Yk = yk + dy;
            king.add(Xk+"#"+Yk);
            //queen's position
            int Xq = xq + dx;
            int Yq = yq + dy;
            queen.add(Xq+"#"+Yq);
        }
        int count = 0;
        for(String val : king){
            if(queen.contains(val)){
                count++;
            }
        }
        out.println(count);
    }


    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        FastReader fr = new FastReader();
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
