import java.io.PrintWriter;

public class cover_in_water {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        String s = fr.next();

        int count = 0;
        int curr = 0;
        boolean isdot = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.'){
                count++;
                curr++;
                if(curr >= 3) isdot = true;
            }
            else{
                curr = 0;
            }
        }
        if(count == 0) out.println(0);
        else if(isdot) out.println(2);
        else out.println(count);
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
