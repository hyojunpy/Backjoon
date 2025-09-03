import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        int Year = Integer.parseInt(st.nextToken());
        int Month = Integer.parseInt(st.nextToken());
        int Day = Integer.parseInt(st.nextToken());

        if(Month >= 10) System.out.printf("TOO LATE");
        else if(Month == 9 && Day > 16) System.out.printf("TOO LATE");
        else System.out.println("GOOD");
    }
}
