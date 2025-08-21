import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());


        if(B.compareTo(A) > 0) System.out.println(B.multiply(A));
        else System.out.println(A.multiply(B));
    }
}