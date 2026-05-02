import java.io.PrintWriter;

public class daytona_cost {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt() , k = fr.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[101];
        for(int i = 0; i < n; i++){
            arr[i] = fr.nextInt();
            freq[arr[i]]++;
        }

        if(freq[k] != 0){
            out.println("YES");
        }
        else{
            out.println("NO");
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


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
