class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result1 = a +"" + b ;
        String result2 = b +"" + a ;
        if (Integer.parseInt(result1) > Integer.parseInt(result2)) {
            answer = Integer.parseInt(result1);
        }
        else {
            answer = Integer.parseInt(result2);
        }
        return answer;
    }
}