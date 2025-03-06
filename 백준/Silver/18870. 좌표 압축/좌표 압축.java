import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }
        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int[] ans = new int[N];
        int ansIndex = 0;
        ans[arr[0][1]] = ansIndex;
        for(int i=1; i<N; i++){
            if(arr[i][0] != arr[i-1][0])
                ansIndex++;
            ans[arr[i][1]] = ansIndex;
        }

        for (int a : ans)
            sb.append(a).append("\n");

        System.out.println(sb);
    }
}