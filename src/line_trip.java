import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class line_trip {
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
        int n = fr.nextInt();
        int x = fr.nextInt();
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[arr.length-1] = x;
        for(int i = 1; i <= n; i++){
            arr[i] = fr.nextInt();
        }
        Arrays.sort(arr);
        int maxgap = 0;
        for(int i = 0; i < n; i++){
            maxgap = Math.max(maxgap,(arr[i+1]-arr[i]));
        }
        int dist = 2 * (arr[arr.length-1] - arr[arr.length-2]);
        maxgap = Math.max(maxgap,dist);
        out.println(maxgap);
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
