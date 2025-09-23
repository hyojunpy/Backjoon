import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            switch (str) {
                case "Algorithm":
                    sb.append(204).append("\n");
                    break;
                case "DataAnalysis":
                    sb.append(207).append("\n");
                    break;
                case "ArtificialIntelligence":
                    sb.append(302).append("\n");
                    break;
                case "CyberSecurity":
                    sb.append("B101").append("\n");
                    break;
                case "Network":
                    sb.append("303").append("\n");
                    break;
                case "Startup":
                    sb.append("501").append("\n");
                    break;
                case "TestStrategy":
                    sb.append("105").append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}