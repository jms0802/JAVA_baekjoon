import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] baseArr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++){
		    baseArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(baseArr);
		
		st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++){
		    int x = Integer.parseInt(st.nextToken());
		    
		    if(Arrays.binarySearch(baseArr, x) >= 0)
		        sb.append(1 + "\n");
		    else sb.append(0 + "\n");
		}
		
		System.out.println(sb);
	}
}