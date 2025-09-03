import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            if(arr[0] == 'C') count++;
        }

        System.out.println(count);
    }
}
