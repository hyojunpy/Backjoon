import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int cnt = 0;
    static int[][] arr;
    static boolean[] vis;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());


        arr = new int[n + 1][n + 1];
        vis = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
             st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);

        System.out.println(cnt-1);
    }

    public static void dfs(int start) {
        vis[start] = true;
        cnt++;
        for(int i = 1; i <= n; i++) {
            if(arr[start][i] == 1 && !vis[i]) dfs(i);
        }
    }
}
