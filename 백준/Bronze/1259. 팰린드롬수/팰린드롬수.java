import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(true){
			String N = br.readLine();
			String reverse="";
			
			if(N.equals("0"))
				break;
			
			for(int i=N.length()-1;i>=0;i--) {
				reverse += N.charAt(i);
			}
			
			if(N.equals(reverse))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}		
}