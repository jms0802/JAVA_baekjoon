import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        char[] x = X.toCharArray();
        char[] y = Y.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        
        StringBuilder answer = new StringBuilder();
        int idxX = x.length - 1;
        int idxY = y.length - 1;
        
        while(idxX >= 0 && idxY >= 0){
            // 두수가 짝꿍을 이룰 경우
            if(x[idxX] == y[idxY]){
                answer.append(x[idxX]);
                idxX--;
                idxY--;
            }
            else if (x[idxX] > y[idxY]) {
                idxX--;
            } else {
                idxY--;
            }
        }
        
        if(answer.length()==0) {
        	return "-1";
        }
        
        if(answer.toString().matches("0+")) {
        	return "0";
        }
        
        return answer.toString();
    }
}

//String X,Y를 하나씩 쪼개어 배열로 저장한다.
//input : X,Y
//output : x,y


//x,y의 공통 숫자를 저장한다.
//input : x,y
//output : z

//내림차순으로 정렬 하여 반환한다.
//input : z
//output : 내림차순 z