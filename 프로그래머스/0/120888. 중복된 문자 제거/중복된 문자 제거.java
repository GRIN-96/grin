import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        String[] str = my_string.split("");
        String[] arr = Arrays.stream(str).distinct().toArray(String[]::new);
        
        return String.join("", arr);
    }
}