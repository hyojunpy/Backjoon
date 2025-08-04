import java.io.*;
import java.util.StringTokenizer;

// 티셔츠 T장 // 펜 P 자루 묶음 || 한 자루 // N명
// N 명
// S M L XL XXL XXXL
// T P

// T 장씩 최소 묶음
// P 자루씩 최대 묶음 && 펜 한자루 몇개씩?

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int [] tSize = new int[6];


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < 6; i++) {
            tSize[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        int getT = 0;
        for (int s:tSize) {
            int tmp = s/T; 
            if(s%T != 0){
                tmp += 1; 
            }
            getT += tmp; 
        }

        int getZaru = 0;
        int getSingle = 0;
        getZaru = N / P;
        getSingle = N % P;

        sb.append(getT).append("\n").append(getZaru).append(" ").append(getSingle);
        System.out.println(sb);
    }
}