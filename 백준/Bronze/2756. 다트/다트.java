import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int score(double r) {
        if (r <= 3) return 100;
        else if (r <= 6) return 80;
        else if (r <= 9) return 60;
        else if (r <= 12) return 40;
        else if (r <= 15) return 20;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = 0;
            int m = 0;

            for (int i = 0; i < 3; i++) {
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                double r = Math.hypot(x, y);
                n += score(r);
            }
            for (int i = 0; i < 3; i++) {
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                double r = Math.hypot(x, y);
                m += score(r);
            }

            if (n > m) sb.append("SCORE: ").append(n).append(" to ").append(m).append(", PLAYER 1 WINS.\n");
            else if (n < m) sb.append("SCORE: ").append(n).append(" to ").append(m).append(", PLAYER 2 WINS.\n");
            else sb.append("SCORE: ").append(n).append(" to ").append(m).append(", TIE.\n");
        }

        System.out.println(sb);
    }
}
