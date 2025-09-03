import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] arr = {6, 3, 2, 1, 2};
        int count;

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                count += arr[j] * Integer.parseInt(st.nextToken());
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

}
