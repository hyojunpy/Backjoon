import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = s.toCharArray();
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') cnt += 2;
            else if (arr[i] < 68) cnt += 3;
            else if(arr[i] < 71) cnt += 4;
            else if(arr[i] < 74) cnt += 5;
            else if(arr[i] < 77) cnt += 6;
            else if(arr[i] < 80) cnt += 7;
            else if(arr[i] < 84) cnt += 8;
            else if(arr[i] < 87) cnt += 9;
            else cnt += 10;
        }

        System.out.println(cnt);
    }
}