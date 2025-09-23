import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        double n = Integer.parseInt(st.nextToken());
        double m = Integer.parseInt(st.nextToken());

        if(n >= m / 2) sb.append("E");
        else sb.append("H");

        System.out.println(sb);
    }
}