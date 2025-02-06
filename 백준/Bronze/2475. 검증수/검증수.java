import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int sum = 0;
		
		for(String data : str){
		    int x = Integer.parseInt(data);
		    sum += Math.pow(x, 2);
		}
		
		System.out.println(sum%10);
	}
}