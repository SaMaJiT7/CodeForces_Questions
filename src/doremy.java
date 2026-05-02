import java.io.PrintWriter;
import java.util.HashMap;

public class doremy {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = fr.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = fr.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(n == 2){
            out.println("Yes");
        }
        else if(map.size() == 1) out.println("Yes");
        else if(map.size() > 2) out.println("No");
        else{
            int f1 = 0, f2 = 0;
            int i = 0;

            for (int val : map.values()) {
                if (i == 0) f1 = val;
                else f2 = val;
                i++;
            }
            if(n % 2 == 0){
                if (f1 == n/2 && f2 == n/2){
                    out.println("Yes");
                }
                else{
                    out.println("No");
                }
            }else{
                if ((f1 == n/2 && f2 == n/2 + 1) || (f2 == n/2 && f1 == n/2 + 1)){
                    out.println("Yes");
                }
                else{
                    out.println("No");
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


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
