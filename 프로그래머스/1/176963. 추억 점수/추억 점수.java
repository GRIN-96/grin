import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
       
        int[] answer = new int[photo.length];

        
        Map<String, Integer> point = new HashMap<>();

        
        for (int i = 0; i < name.length; i++) {
            point.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {

            String[] person = photo[i];
            int score = 0;

            for (int j = 0; j < person.length; j++) {
                
                String personName = person[j];

               
                if (point.containsKey(personName)) {
                    score += point.get(personName);
                }

            }
            answer[i] = score;
        }

        return answer;
    }
}