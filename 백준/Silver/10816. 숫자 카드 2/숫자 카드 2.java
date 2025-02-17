import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());;
		for(int i=0; i<N; i++){
		    arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++){
		    int n = Integer.parseInt(st.nextToken());
		    int result = upperBound(arr, n) - lowerBound(arr, n);
		    sb.append(result).append(" ");
		}
		
		System.out.println(sb);
	}
	
	public static int upperBound(int[] arr, int n){
	    int first = 0;
	    int last = arr.length;
	    
	    while (first < last) {
	        int mid = (first + last) / 2;
	        
	        if(n < arr[mid]){
	            last = mid;
	        } else {
	            first = mid + 1;
	        }
	    }
	    return first;
	}
	
	public static int lowerBound(int[] arr, int n){
	    int first = 0;
	    int last = arr.length;
	    
	    while (first < last) {
	        int mid = (first + last) / 2;
	        
	        if(n <= arr[mid]){
	            last = mid;
	        } else {
	            first = mid + 1;
	        }
	    }
	    return first;
	}
}