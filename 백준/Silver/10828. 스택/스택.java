import java.util.*;
import java.io.*;

public class Main
{
    static List<Integer> stack = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    String str = st.nextToken();
		    if(str.equals("push")) {
		        int x = Integer.parseInt(st.nextToken());
		        checkCommend(str, x);  
		    } 
		    else checkCommend(str, 0);
		}
		System.out.println(sb);
	}
	public static void checkCommend(String cmd, int value) {
	    int size = stack.size();
	    switch(cmd){
	        case "push":
	            stack.add(value);
	            break;
	        case "pop":
	            if(size <= 0) {
	                sb.append(-1).append("\n");
	                break;
	            }
	            sb.append(stack.get(size-1)).append("\n");
	            stack.remove(size-1);
	            break;
	        case "size":
	            sb.append(size).append("\n");
	            break;
	        case "empty":
	            sb.append((size < 1) ? 1 : 0).append("\n");
	            break;
	        case "top":
	            if(size <= 0) {
	                sb.append(-1).append("\n");
	                break;
	            }
	            sb.append(stack.get(size-1)).append("\n");
	            break;
	    }
	}
}