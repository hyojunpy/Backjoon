import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m, v;
    static int[][] arr;
    static boolean[] vis;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        vis = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(v);
        sb.append("\n");
        vis = new boolean[n + 1];

        bfs(v);

        System.out.println(sb);
    }

    public static void dfs(int start) {
        vis[start] = true;
        sb.append(start).append(" ");
        for(int i = 1; i <= n; i++) {
            if(arr[start][i] == 1 && !vis[i]) dfs(i);
        }
    }

    public static void bfs(int start) {
        q.add(start);
        vis[start] = true;

        while(!q.isEmpty()) {
            start = q.poll();
            sb.append(start).append(" ");

            for(int i = 1; i <= n; i++) {
                if(arr[start][i] == 1 && !vis[i]) {
                    q.offer(i);
                    vis[i] = true;
                }
            }
        }
    }


}
