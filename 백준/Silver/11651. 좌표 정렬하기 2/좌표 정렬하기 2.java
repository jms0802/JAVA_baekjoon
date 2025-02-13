import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		StringTokenizer st;
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    arr[i][0] = Integer.parseInt(st.nextToken());
		    arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a1, a2) -> {
		   return a1[1] == a2[1] ? a1[0] - a2[0] : a1[1] - a2[1];
		});
		
		for(int x[] : arr){
		    sb.append(x[0] + " " + x[1] + "\n");
		}
		
		System.out.println(sb);
	}
}