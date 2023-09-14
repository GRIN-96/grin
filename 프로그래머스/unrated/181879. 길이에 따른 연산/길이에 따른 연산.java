class Solution {
    public int solution(int[] num_list) {
        
        int length = num_list.length;
        int answer = 0;
        int ans = 1;
        
        for (int i = 0; i < length; i++) {
            if (length >= 11) {
                answer += num_list[i];
            }else {
                ans *= num_list[i];
                answer = ans;
            }
        }
        
        return answer;
    }
}