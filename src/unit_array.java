import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class unit_array {
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
        int[] arr = new int[n];
        int count = 0;
        int count1 = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = fr.nextInt();
            sum += arr[i];
            if(arr[i] == -1){
                count = count + 1;
            }
            else{
                count1 = count1 + 1;
            }
        }
        int ops = 0;
        if(sum == 0 && count % 2 == 0){
            out.println(0);
            return;
        }
        else if(sum < 0){
            while(sum < 0){
                sum = sum + 2;
                count = count - 1;
                ops++;
            }
        }
        if(count % 2 != 0){
            count = count - 1;
            ops++;
        }
        out.println(ops);
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }
        //solve(fr, out);

        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
