import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] K_arr = br.readLine().toCharArray();
        int K = 0; 

        int count_z = 0;
        int count_h = 0;

        for(int i = 0; i < N; i++) {
            K = K_arr[i] -'0';
            if(K % 2 != 0) {
                count_h++;
            }else count_z++;
        }

        if(count_z > count_h) System.out.println(0);
        else if (count_z == count_h) System.out.println(-1);
        else System.out.println(1);
    }
}