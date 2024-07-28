import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			result = arr[2] + arr[2] - arr[1];
		}
		else if(arr[1] - arr[0] < arr[2] - arr[1]) {
			result = arr[1] + (arr[1] - arr[0]);
		}
		else if(arr[1] - arr[0] > arr[2] - arr[1]) {
			result = arr[0] + (arr[2] - arr[1]);
		}
		
		System.out.println(result);
		scan.close();
	}

}