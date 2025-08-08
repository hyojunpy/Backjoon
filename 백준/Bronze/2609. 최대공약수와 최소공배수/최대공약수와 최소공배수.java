import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int d = gcd(A, B);

        System.out.println(d);
        System.out.println(A * B / d);
    }

    public static int gcd(int A, int B) {
        if(B == 0)
            return A;

        return gcd(B, A % B);
    }
}