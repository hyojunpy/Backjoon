import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String a = "@";
        String b = " ";

        String N1 = a.repeat(n) + b.repeat(n * 3) + a.repeat(n);
        String N2 = a.repeat(n * 5);

        StringBuffer case1 = new StringBuffer();
        IntStream.range(0, n).forEach(i -> case1
                .append(N1)
                .append("\n"));


        StringBuffer case2 = new StringBuffer();
        IntStream.range(0, n).forEach(i -> case2
                .append(N2)
                .append("\n"));

        sb.append(case1).append(case2).append(case1).append(case2).append(case1);
        sb.setLength(sb.length() -1);
        System.out.println(sb);
    }
}
