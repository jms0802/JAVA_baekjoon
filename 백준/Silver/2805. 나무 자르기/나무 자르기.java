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
		
		int[] trees = new int[N];
		
		int max = 0;
		int min = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
		    trees[i] = Integer.parseInt(st.nextToken());
		    if(trees[i] > max) max = trees[i];
		}
		
		while(min < max) {
		    int mid = (min+max) /2;
		    long sum = 0;
		    for(int tree : trees) {
		        if((tree - mid) > 0)
		            sum += tree-mid;
		    }
		    
		    if(sum < M) max = mid;
		    else min = mid +1;
		}
		
		sb.append(min-1);
		System.out.println(sb);
	}
}