import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int m = M - 11;
        if(m < 0) {
            m += 60;
            H = H -1;
        }
        int h = H - 11;
        if(h < 0) {
            h += 24;
            D = D -1;
        }
        int d = D -11;
        if(d < 0) {
            System.out.println(-1);
        }
        else {
            sb.append(d*24*60+h*60+m);
            System.out.println(sb);
        }
    }
}
