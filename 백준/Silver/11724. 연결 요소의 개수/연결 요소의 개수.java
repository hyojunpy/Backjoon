import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m, ans;
    static boolean[] vis;
    static int[] arr;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        list = new ArrayList[n + 1];
        vis = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        for(int i = 1; i <= n; i++) {
            if(!vis[i]) {
                dfs(i);
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int node) {
        vis[node] = true;
        for(int to : list[node]) {
            if(!vis[to]) {
                dfs(to);
            }
        }
    }
}
