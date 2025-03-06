import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i] = origin[i];
        }
        Arrays.sort(sorted);

        int rank = 0;
        for (int a : sorted) {
            if(!map.containsKey(a)) {
                map.put(a, rank);
                rank++;
            }
        }

        for (int a : origin){
            sb.append(map.get(a)).append("\n");
        }
        System.out.println(sb);
    }
}