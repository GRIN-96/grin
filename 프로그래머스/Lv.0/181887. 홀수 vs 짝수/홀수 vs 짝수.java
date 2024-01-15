class Solution {
    public int solution(int[] num_list) {
        int even = 0;  // 짝수
        int odd = 0;  // 홀수
        int answer = 0;  
        
        for (int i = 0; i<num_list.length; i++ ) {
            if((i+1) % 2 == 0) {
               even += num_list[i];  
            }else {
                odd += num_list[i]; 
            }  
        }
        
        if (even > odd) {
            answer = even;
        }else {
            answer = odd; 
        }
        
        return answer;
    }
}