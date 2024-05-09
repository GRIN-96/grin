import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    public int[] solution(String my_string) {
   
        List<Integer> numbers = new ArrayList<>();

        for (char str : my_string.toCharArray()) {
            if(Character.isDigit(str)) {
                int number = Character.getNumericValue(str);
                numbers.add(number);
            }
        }
        Collections.sort(numbers);

        int[] answer = new int[numbers.size()];
        for (int i=0; i<numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}