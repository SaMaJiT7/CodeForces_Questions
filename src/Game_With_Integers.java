import java.io.PrintWriter;

public class Game_With_Integers {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        if(n % 3 != 0){
            out.println("First");
        }
        else{
            out.println("Second");
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
