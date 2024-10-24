import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String S = br.readLine();
			int size = S.length();
			int sum = 0;
			
			if(S.equals("0")) break;
			
			for(int i = 0; i < S.length(); i++) {
				int n = S.charAt(i) - '0';
				for(int j = 2; j <= size; j++) {
					n *= j;
				}
				sum += n;
				size--;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

}
