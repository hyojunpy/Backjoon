import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int dp0[] = new int[41];
        int dp1[] = new int[41];

        dp0[0] = 1;
        dp1[0] = 0;

        dp0[1] = 0;
        dp1[1] = 1;

        for(int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i -1] + dp0[i - 2];
            dp1[i] = dp1[i -1] + dp1[i - 2];
        }

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp0[n]).append(" ").append(dp1[n]).append("\n");
        }

        System.out.println(sb);
    }
}