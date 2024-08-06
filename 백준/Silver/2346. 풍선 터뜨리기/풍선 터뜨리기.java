import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<int[]> numList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] arr = {i + 1, Integer.parseInt(st.nextToken())};
            numList.add(arr);
        }
        
        int idx = 0;
        
        while (numList.size() > 1) {
            int[] arr = numList.get(idx);
            sb.append(arr[0]).append(" ");
            int num = arr[1];
            numList.remove(idx);

            if (num > 0) {
                idx = (idx + num - 1) % numList.size();
            } else {
                idx = (idx + numList.size() + num) % numList.size();
                if (idx < 0) {
                    idx += numList.size();
                }
            }
        }
        
        sb.append(numList.get(0)[0]);
        
        System.out.println(sb.toString());
    }
}