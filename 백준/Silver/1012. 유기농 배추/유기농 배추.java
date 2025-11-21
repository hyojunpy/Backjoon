import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int n, m, v;
    static int [][]arr;
    static boolean [][] vis;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for( int tc = 0 ; tc < T ; tc++) {
            st = new StringTokenizer(br.readLine());
            int ans = 0;
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            arr = new int[n + 1][m + 1];
            vis = new boolean[n + 1][m + 1];

            for (int i = 0; i < v; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(arr[i][j] == 1 && !vis[i][j]) {
                        dfs(i, j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    static void dfs(int x, int y) {
        vis[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nX = x + dx[i];
            int nY = y + dy[i];
            if(nX >= 0 && nX < n && nY >=0 && nY < m  && arr[nX][nY] == 1 && !vis[nX][nY]) {
                dfs(nX, nY);
            }
        }
    }
}