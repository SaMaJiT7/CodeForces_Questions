import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class One_AND_TWO {
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
    static long mod = (long) 1000000007L;
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = fr.nextInt();
            if(arr[i] == 2) total++;
        }
        if(total == 0){
            out.println(1);
            return;
        }
        if(total % 2 == 1){
            out.println(-1);
            return;
        }
        else{
            int count = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] == 2) count++;
                int rem = total - count;
                if(count == rem){
                    out.println(i+1);
                    return;
                }
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
//        solve(fr, out);

        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
