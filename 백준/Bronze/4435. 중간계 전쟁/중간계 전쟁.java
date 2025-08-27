import java.io.*;
import java.util.*;

public class Main {
    final static int gandalfu[] = {1, 2, 3, 3, 4, 10};
    final static int sauron[] = {1, 2, 2, 2, 3, 5, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;


        for (int i = 0; i < N; i++) {
            a = 0;
            b = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < gandalfu.length; j++) {
                a += gandalfu[j] * Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < sauron.length; k++) {
                b += sauron[k] * Integer.parseInt(st.nextToken());
            }
            if (a > b) sb.append("Battle ").append(i + 1).append(": Good triumphs over Evil").append("\n");
            else if (a < b) sb.append("Battle ").append(i + 1).append(": Evil eradicates all trace of Good").append("\n");
            else sb.append("Battle ").append(i + 1).append(": No victor on this battle field").append("\n");
        }
        System.out.println(sb);
    }
}