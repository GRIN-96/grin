import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();
		int b = sc.nextInt();

		int sum = l + r + b;
		int temp = b - Math.abs(l - r);

		System.out.println(temp >= 0 ? sum - temp % 2 : sum - Math.abs(temp));
	}
}