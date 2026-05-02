import java.io.PrintWriter;
import java.util.ArrayList;

public class sequence {
    static ArrayList<Integer> ans = new ArrayList<>();
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = fr.nextInt();
        ans.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i-1]<=arr[i]){
                ans.add(arr[i]);
            }
            else{
                ans.add(arr[i]);
                ans.add(arr[i]);
            }
        }

        out.println(ans.size());
        for(int it : ans){
            out.println(it);
        }
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
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
