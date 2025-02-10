import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		HashSet<String> hSet = new HashSet<String>();
		for(int i=0; i<N; i++)
			hSet.add(br.readLine());
			
		List<String> list = new ArrayList<String>(hSet);
		
		Collections.sort(list, new Comparator<String>(){
		    
		    public int compare(String s1, String s2) {
		        if (s1.length() == s2.length()) {
		            return s1.compareTo(s2);
		        } else {
		            return s1.length() - s2.length();
		            
		        }
		    }
		});
		
		for(String s : list){
		    System.out.println(s);
		}
	}
}