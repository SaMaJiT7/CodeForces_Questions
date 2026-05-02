package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class counting_rooms {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
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

        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        public String nextLine() {
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
    static long mod = 676767677;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void solve(Main.FastReader fr, PrintWriter out) {
        int n = fr.nextInt(), m = fr.nextInt();
        char[][] room = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        for (boolean[] row : visited) Arrays.fill(row, false);
        int k;
        for (int i = 0; i < n; i++) {
            String s = fr.next();
            k = 0;
            for (char ch : s.toCharArray()) {
                room[i][k++] = ch;
            }
        }

        int count = 0;
//        Queue<int[]> que = new ArrayDeque<>();
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//               if(visited[i][j]) continue;
//               if(room[i][j] == '#') continue;
//               que.add(new int[]{i,j});
//               visited[i][j] = true;
//               count++;
//               while(!que.isEmpty()){
//                   int[] val = que.poll();
//                   int x = val[0];
//                   int y = val[1];
//
//                   for(int p = 0; p < 4; p++){
//                       int nx = x + dx[p];
//                       int ny = y + dy[p];
//
//
//                       if(nx >= 0 && ny >= 0 && nx < n && ny < m){
//                           if(!visited[nx][ny] && room[nx][ny] != '#'){
//                               que.add(new int[]{nx,ny});
//                               visited[nx][ny] = true;
//                           }
//                       }
//                   }
//               }
//            }
//        }
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
