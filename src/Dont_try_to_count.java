import java.io.PrintWriter;

public class Dont_try_to_count {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt() , m = fr.nextInt();
        String x = fr.next();
        String s = fr.next();
        StringBuilder str = new StringBuilder(x);
        int operations = 0;
        if(x.contains(s)){
            out.println(0);
            return;
        }
        while(str.length() < m) {
            str.append(str);
            operations++;
            x = str.toString();
            if(x.contains(s)){
                out.println(operations);
                return;
            }
        }
        str.append(str);
        operations++;
        x = str.toString();
        if(x.contains(s)){
            out.println(operations);
            return;
        }
        out.println(-1);
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
