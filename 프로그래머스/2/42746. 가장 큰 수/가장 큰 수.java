import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (n1,n2)->(n2+n1).compareTo(n1+n2));
        
        if(arr[0].equals("0"))
            return "0";
        
        return String.join("",arr);
    }
}

//한자릿 수 중 가장 큰 값이 첫번째
//x자릿 수 중 x자리 수가 큰 것이 첫번째