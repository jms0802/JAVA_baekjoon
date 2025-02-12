import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][2];
		StringTokenizer st;
		for(int i=0; i<N; i++){
		    st  = new StringTokenizer(br.readLine());
		    arr[i][0] = st.nextToken();
		    arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, Comparator.comparing(row -> Integer.parseInt(row[0])));
		
		for(String x[] : arr){
		    sb.append(x[0] + " " + x[1] + "\n");
		}
		
		System.out.println(sb);
	}
}