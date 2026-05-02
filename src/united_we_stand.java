import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class united_we_stand {
    static boolean[] prime;
    static List<Long> P;
    public static void umain(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        int N = (int) (2*1e5);
        prime = new boolean[N+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        // Eliminate even numbers except 2
        for (int i = 4; i < N; i += 2) {
            prime[i] = false;
        }

        for(int i = 3; i*i <= N; i += 2){
            if(prime[i]){
                for(int j = i*i; j < N; j += (i << 1)){
                    prime[j] = false;
                }
            }
        }
        P = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (prime[i]) P.add((long) i);
        }
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a[i] = fr.nextInt();
        }
        Arrays.sort(a);
        int smol = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] == smol){
                b.add(a[i]);
            }
            else{
                c.add(a[i]);
            }
        }
        if(b.size() == 0 || c.size() == 0){
            out.println(-1);
        }
        else{
            out.println(b.size() + " " + c.size());
            for(int bval : b){
                out.print(bval + " ");
            }
            out.println();
            for(int cval : c){
                out.print(cval + " ");
            }
            out.println();
        }
    }

    // 3. Main method: Handles multiple test cases and I/O flushing
    public static void main(String[] args) {
        Main.FastReader fr = new Main.FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // Read the number of test cases
        int N = (int) (2*1e5);
        prime = new boolean[N+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        // Eliminate even numbers except 2
        for (int i = 4; i < N; i += 2) {
            prime[i] = false;
        }

        for(int i = 3; i*i <= N; i += 2){
            if(prime[i]){
                for(int j = i*i; j < N; j += (i << 1)){
                    prime[j] = false;
                }
            }
        }
        P = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (prime[i]) P.add((long) i);
        }
        while (t-- > 0) {
            solve(fr, out);   // Run your logic for each case
        }


        out.flush(); // Crucial: ensures everything is printed
        out.close();
    }
}
