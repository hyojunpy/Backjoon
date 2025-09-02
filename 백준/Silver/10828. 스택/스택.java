import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<String> stacksStr = new Stack<>(); 

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")) {
                stacksStr.add(st.nextToken()); 
            } else if(str.equals("pop")) {
                if(stacksStr.empty()) sb.append("-1\n");
                else sb.append(stacksStr.pop()).append("\n");
            } else if (str.equals("size")) {
                sb.append(stacksStr.size()).append("\n");
            } else if (str.equals("empty")) {
                if(stacksStr.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else {
                if(stacksStr.empty()) sb.append(-1).append("\n");
                else sb.append(stacksStr.peek()).append("\n");
            }
        }

        System.out.println(sb);
    }
}