import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			for(int j = i; j <= i * 2; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
	}

}