import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        Map<String, String> hashMap = new HashMap<String, String>();

        for (String[] strings : db) {
            hashMap.put(strings[0], strings[1]);
        }

        if(hashMap.containsKey(id_pw[0])) {
            if(hashMap.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            }else {
                return "wrong pw";
            }
        }else {
            return "fail";
        }

    }
}