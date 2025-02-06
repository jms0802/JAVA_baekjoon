import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		String result = "";
		if(score<60) result = "F";
		else if(score <70) result ="D";
		else if(score <80) result ="C";
		else if(score <90) result ="B";
		else result="A";
		
		System.out.println(result);
	}
}