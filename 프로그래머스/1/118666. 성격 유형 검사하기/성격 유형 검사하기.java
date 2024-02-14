import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        char[] mbti_type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        HashMap<Character, Integer> mbti = new HashMap<>();
        for (char c : mbti_type) {
            mbti.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char[] c = survey[i].toCharArray();
            if (choices[i] > 4) {
                int currentValue = mbti.get(c[1]);
                mbti.put(c[1], currentValue + choices[i]-4);

            } else if(choices[i] < 4) {
                int[] value = {0,3,2,1};
                int currentValue = mbti.get(c[0]);
                mbti.put(c[0], currentValue + value[choices[i]]);
            }
            
        }
        
        for (int i=0; i<mbti_type.length; i+=2) {
            if (mbti.get(mbti_type[i]) > mbti.get(mbti_type[i+1])) {
                answer += mbti_type[i];
            } else if (mbti.get(mbti_type[i]) < mbti.get(mbti_type[i+1])) {
                answer += mbti_type[i+1];
            } else {
                answer += mbti_type[i];
            }
        }
        
        return answer;
    }
}