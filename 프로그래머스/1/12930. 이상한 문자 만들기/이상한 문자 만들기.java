class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
            if(ch == ' '){
                answer += " ";
                cnt = 0;
                continue;
            }
            if((cnt%2) == 0){
                answer += String.valueOf(Character.toUpperCase(ch));
                cnt++;
            }else{
                answer += String.valueOf(Character.toLowerCase(ch));
                cnt++;
            }
        }
        return answer;
    }
}