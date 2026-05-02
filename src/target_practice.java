import java.io.PrintWriter;

public class target_practice {
    public static void solve(Main.FastReader fr, PrintWriter out) {
        char[][] grid = new char[10][10];
        for(int i = 0; i < 10; i++){
            String s = fr.next();
            for(int j = 0; j < 10; j++){
                grid[i][j] = s.charAt(j);
            }
        }
        int score = 0;
        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                if(grid[r][c] == 'X'){
                    if(r == 0 || r == 9 || c == 0 || c == 9) score += 1;
                    else if(r == 1 || r == 8 || c == 1 || c == 8) score += 2;
                    else if(r == 2 || r == 7 || c == 2 || c == 7) score += 3;
                    else if(r == 3 || r == 6 || c == 3 || c == 6) score += 4;
                    else score += 5;
                }
            }
        }
        out.println(score);
    }

//    public static void solve(Main.FastReader fr, PrintWriter out) {
//        char[][] grid = new char[10][10];
//        for(int i = 0; i < 10; i++){
//            String s = fr.next();
//            for(int j = 0; j < 10; j++){
//                grid[i][j] = s.charAt(j);
//            }
//        }
//        int score = 0;
//        for(int r = 0; r < 10; r++){
//            for(int c = 0; c < 10; c++){
//                if(grid[r][c] == 'X'){
//                    int layer = Math.min(Math.min(r,9-r),Math.min(c,9-c));
//                    score += (layer+1);
//                }
//            }
//        }
//        out.println(score);
//    }

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



    // 3. Main method: Handles multiple test cases and I/O flushing
}
