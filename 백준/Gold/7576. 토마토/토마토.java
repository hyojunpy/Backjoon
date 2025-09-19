import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[][] box;
    static int cnt = 0;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); // 박스 y 길이 받기
        n = Integer.parseInt(st.nextToken()); // 박스 x 길이 받기

        box = new int[n][m]; // 위에서 받은 길이로 박스 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());  //아니라면 그냥 박스에 추가
                if (box[i][j] == 1) { // 해당 경로에 박스에 익은 토마토가 있을 시 큐에 추가
                    queue.add(new int[]{i, j});
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        while (!queue.isEmpty()) { // 큐가 빌때까지 실행
            int[] cur = queue.poll(); // 큐에 있는 값을 빼서 cur에 초기화
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) { // 사방탐색
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n &&ny < m) { //nx, ny가 벽이 아닐때
                    if(box[nx][ny] == 0) {  // 해당 경로가 익지 않은 토마토가 들었을때 큐에 추가
                        queue.add(new int[]{nx, ny});
                        box[nx][ny] = box[x][y] + 1;   //날자를 계산하기 위해 기존 익은 토마토보다 +1
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (box[i][j] == 0) { // 익지 않은 토마토가 있을때  -1
                    return -1;
                }

                cnt = Math.max(cnt, box[i][j]); // box중 가장 큰 날자 가져오기
            }
        }

        if(cnt == 1) {
            return 0;
        } else {
            return cnt -1;
        }
    }
}
