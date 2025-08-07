import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String N = br.readLine();
            boolean chk = true;
            if(N.equals("0")) break;

            for(int i = 0; i < N.length()/2; i++) {
                if(N.charAt(i) != N.charAt(N.length() - 1 - i)) chk = false;
            }

            if(chk) System.out.println("yes");
            else System.out.println("no");
        }
    }
}