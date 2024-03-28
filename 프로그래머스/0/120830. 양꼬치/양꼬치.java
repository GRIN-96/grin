class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sale = n / 10 ;
        answer = (n * 12000) + ((k-sale) * 2000);
        return answer;
    }
}