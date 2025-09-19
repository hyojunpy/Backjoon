import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] vis = new int[100001];
    static Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int result = bfs(n);
        System.out.println(result);
    }


    static int bfs(int node) {
        queue.add(node);
        int index = node;
        int n = 0;
        vis[index] = 1;
        while(!queue.isEmpty()) {
            n = queue.poll();   //n에 큐 값 초기화 

            if(n == m) {
                return vis[n] -1;
            }
            if(n-1 >= 0 && vis[n-1] == 0) {     // 앞뒤가 0보다 클때 
                vis[n-1] = vis[n] + 1;
                queue.add(n-1);
            }
            if(n+1 <= 100000 && vis[n+1] == 0) {    // n+1이 100000만보다 작고 방문기록이 없을때
                vis[n+1] = vis[n] + 1;
                queue.add(n+1);
            }
            if(n*2 <= 100000 && vis[n*2] == 0) {    // n*2가 100000만보다 작고 방문기록이 없을때
                vis[n*2] = vis[n] + 1;
                queue.add(n*2);
            }
        }
        return -1;
    }
}
