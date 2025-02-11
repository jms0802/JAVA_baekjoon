import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
		    arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		for(int a : arr){
		    sb.append(a+"\n");
		}
		System.out.println(sb);
	}
}