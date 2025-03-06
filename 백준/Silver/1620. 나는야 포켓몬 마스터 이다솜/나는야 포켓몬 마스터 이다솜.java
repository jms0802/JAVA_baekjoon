import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i=1; i<=N; i++) {
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if(str.matches("[+-]?\\d*(\\.\\d+)?")) {
                sb.append(map1.get(Integer.parseInt(str))).append("\n");
            } else {
                sb.append(map2.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
}