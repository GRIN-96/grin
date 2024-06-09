import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int order) {
        int answer=0;                                       
        String[] ss=String.valueOf(order).split("");        
        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(ss));
        answer+=Collections.frequency(arr, "3");            
        answer+=Collections.frequency(arr, "6");            
        answer+=Collections.frequency(arr, "9");            
        return answer;
    }
}
