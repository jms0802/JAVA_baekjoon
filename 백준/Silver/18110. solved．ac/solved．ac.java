import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int exclude = (int) Math.round(N * 0.15);
        
		StringTokenizer st;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = Integer.parseInt(br.readLine());
		}

        Arrays.sort(arr);

        double sum = 0;
        for(int i= exclude; i<N-exclude; i++) {
		    sum += arr[i];
		}
        int total = N - (exclude*2);
        int result = (int) Math.round(sum/total);
		sb.append(result);
        System.out.println(sb);
	}
}