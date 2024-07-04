class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int pieces = 6;
        
        for ( int i = 1; i <= pieces * n; i++ ) { 
            if ( (pieces * i) % n == 0 ) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}