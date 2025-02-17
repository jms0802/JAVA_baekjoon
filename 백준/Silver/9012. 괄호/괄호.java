import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    String str = st.nextToken();
		    sb.append(getResult(str)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static String getResult(String str) {
	    Stack<Character> stack = new Stack();
	    
	    for(int i=0; i<str.length(); i++){
	        if(str.charAt(i) == '(')
	            stack.push(str.charAt(i));
	        else if(stack.isEmpty()){
	            return "NO";
	        }
	        else 
	            stack.pop();
	    }
	    if(stack.isEmpty()) return "YES";
	    else return "NO";
	}
}