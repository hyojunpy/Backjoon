import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            arr = new int[m];

            double total = 0;

            for(int j =0; j<m; j++) {
                int k = Integer.parseInt(st.nextToken());
                arr[j] = k;
                total += k;
            }

            total /= m;
            double cnt = 0;

            for(int j =0; j<m; j++) {
                if( arr[j] > total) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/m) * 100);
        }
    }
}