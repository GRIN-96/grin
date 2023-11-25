class Solution {
    public String solution(String my_string, int s, int e) {
        //해당 String을 뽑는다
        String answer = my_string.substring(s,e+1);
        
        //뒤집어서 다른 변수에 저장한다
        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();
        
        //원본에다 뒤집은 걸 대체한다
        my_string = my_string.replaceAll(answer, reversedStr);
        return my_string;
    }
}