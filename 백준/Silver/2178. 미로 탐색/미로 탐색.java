import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(arr[n - 1][m - 1]);
    }

    static void bfs(int x, int y){
        Queue<Point> q = new java.util.LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Point p = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m ){
                    continue;
                }
                if(arr[nx][ny] == 0) {
                    continue;
                }
                if(visited[nx][ny]) {
                    continue;
                }

                q.offer(new Point(nx, ny));
                visited[nx][ny] = true;
                arr[nx][ny] = arr[p.x][p.y] + 1;
            }
        }
    }
}
