import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] shirts = br.readLine().split(" ");
		String[] str = br.readLine().split(" ");
		int T = Integer.parseInt(str[0]);
		int P = Integer.parseInt(str[1]);
		
		//티셔츠 묶음
		int Tsum = 0;
		for(String s : shirts) {
		    int ss = Integer.parseInt(s);
		    Tsum += ss / T;
		    if(ss % T > 0) Tsum++;
		}
		
		//연필 묶음
		int share = N / P;
		int rest = N % P;
		
		System.out.println(Tsum);
		System.out.println(share + " " + rest);
	}
}