class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        answer += n;
        
        for (int i=0; i < control.length(); i++) {
            
            String str = String.valueOf(control.charAt(i));
            
            if("w".equals(str)) answer += 1;
            if("s".equals(str)) answer -= 1;
            if("d".equals(str)) answer += 10;
            if("a".equals(str)) answer -= 10;
            
        }
        return answer;
    }
}