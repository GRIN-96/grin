import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
    	// 결과를 담을 list 선언
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
