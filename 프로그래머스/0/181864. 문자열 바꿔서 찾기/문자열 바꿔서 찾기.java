class Solution {
	public int solution(String myString, String pat) {
    	int answer = 0;
        
        String str = myString.replace('A', 'C').replace('B', 'A').replace('C', 'B');
        
        if(str.contains(pat)) {
        	answer = 1;
        }
        return answer;
    }
}