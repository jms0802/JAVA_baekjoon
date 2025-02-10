import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[3];
		
		int index = -1, num = -1;
		for(int i=0;i<arr.length;i++){
		    arr[i] = br.readLine();
		    if(isNumber(arr[i])){
		        index = i;
		        num = Integer.parseInt(arr[i]) + (3-i);
		    }
		}
		System.out.println(getStr(num));
		
	}
	static boolean isNumber(String str) {
        return str.matches("^[0-9]*$");
    }
	
	static String getStr(int n) {
	    if((n%3==0) && (n%5==0)) return "FizzBuzz";
	    else if((n%3==0)) return "Fizz";
	    else if((n%5==0)) return "Buzz";
	    else return n+"";
	}
}