import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
		
		String result = "";
		
		for(int i=0; i<arr.length-1; i++){
		    if(arr[i+1] == arr[i]+1) result = "ascending";
		    else if(arr[i+1] == arr[i]-1) result = "descending";
		    else {
		        result = "mixed";
		        break;
		    }
		}
		System.out.println(result);
	}
}