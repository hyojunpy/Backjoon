import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total_tax = 0;
        int count = 0;
        for(int i = 0; i < 6; i++) {
            count = Integer.parseInt(st.nextToken());
            total_tax += count * 5;
        }

        System.out.println(total_tax);
    }
}