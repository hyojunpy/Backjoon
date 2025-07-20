import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(bf.readLine());
        int A = (int)(N * 0.78);
        int B = (int)(N*0.8 + (N*0.2)*0.78);

        sb.append(A).append(" ").append(B);

        System.out.println(sb);
    }
}