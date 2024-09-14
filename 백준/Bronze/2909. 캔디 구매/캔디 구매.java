import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();	
		int K = scan.nextInt();	
		
		double num = Math.pow(10, K);
		
		int ans = (int) ((int)Math.round(C/num)*num);
		
		System.out.println(ans);
		
		scan.close();
	}

}