import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
		    int[] arr = new int[3];
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    arr[0] = Integer.parseInt(st.nextToken());
		    arr[1] = Integer.parseInt(st.nextToken());
		    arr[2] = Integer.parseInt(st.nextToken());
		    
		    if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
		        break;
		    
		    
		    Arrays.sort(arr);
		    
		    int a = arr[0] * arr[0];
		    int b = arr[1] * arr[1];
		    int c = arr[2] * arr[2];
		    if(a+b == c) {
		        sb.append("right").append("\n");
		    } else {
		        sb.append("wrong").append("\n");
		    }
		}
		System.out.println(sb);
	}
}