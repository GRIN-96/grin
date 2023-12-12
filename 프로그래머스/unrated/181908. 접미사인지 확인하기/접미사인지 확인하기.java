class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        // is_suffix의 길이가 my_string보다 짧거나 같은 경우에만 접미사가 될 수 있음. 
        if (is_suffix.length() <= my_string.length()) {
            int suffixLength = is_suffix.length();
            String suffix = my_string.substring(my_string.length() - suffixLength);
            if (suffix.equals(is_suffix)) {
                answer = 1;
            } else {
            	answer = 0;
            }
        }
        
        return answer;
    }
}