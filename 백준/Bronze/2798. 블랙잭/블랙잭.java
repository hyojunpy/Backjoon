import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] M_arr = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(M_arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) {

            if (arr[i] > M) continue;

            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] > M) continue;

                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (M == temp) {
                        return temp;
                    }

                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}