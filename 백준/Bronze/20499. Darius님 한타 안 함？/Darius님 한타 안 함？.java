import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");

        Integer K = Integer.parseInt(st.nextToken());
        Integer D = Integer.parseInt(st.nextToken());
        Integer A = Integer.parseInt(st.nextToken());

        if ((K + A) < D || D == 0) System.out.printf("hasu");
        else System.out.println("gosu");
    }
}
