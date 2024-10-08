import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(b==0 && n==0) break;
            int left = 0;
            int right = 0;

            for(int i=1; i<=b; i++){
                if(b <= Math.pow(i,n)){
                    right = i;
                    left = right-1;
                    System.out.println((b-Math.pow(left,n)<Math.pow(right,n)-b)? left:right);
                    break;
                }
            }
        }
    }
}
