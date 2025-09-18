import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] vis;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(arr[n - 1][m - 1]);
    }

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        vis[x][y] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)
                    continue;
                if (arr[nextX][nextY] == 0)
                    continue;
                if (vis[nextX][nextY])
                    continue;
                queue.offer(new Point(nextX, nextY));
                vis[nextX][nextY] = true;

                arr[nextX][nextY] = arr[p.x][p.y] + 1;
            }
        }
    }

}
