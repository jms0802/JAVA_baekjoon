import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        StringTokenizer st;
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x = 0;
            
            if (!str.equals("all") && !str.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }

            switch(str) {
                case "add":
                    S = S | (1 << x);
                    break;
                case "remove":
                    S = S & ~(1 << x);
                    break;
                case "check":
                    sb.append((S & (1 << x)) > 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    S = S ^ (1 << x);
                    break;
                case "all":
                    S = (1 << 21) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}
