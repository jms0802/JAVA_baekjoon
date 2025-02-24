import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        int n = 1;
        for(int i=0; i<N ; i++){
            int target = Integer.parseInt(br.readLine());
            if(n <= target) {
                for(int j=n; j<=target; j++){
                    stack.push(n++);
                    sb.append("+").append("\n");
                }
            }
            if(stack.peek() == target){
                sb.append("-").append("\n");
                stack.pop();
            } else {
                sb = new StringBuilder("NO");
                break;
            }
        }
        System.out.println(sb);
	}
}