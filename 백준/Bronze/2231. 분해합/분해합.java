import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n_len = str.length();
        int n = Integer.parseInt(str);
        int result = 0;

        for(int i = (n - (n_len * 9)); i < n; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
