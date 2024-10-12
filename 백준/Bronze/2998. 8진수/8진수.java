import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.length()%3==1)
			input = "00" + input;
		else if(input.length()%3==2)
			input = "0" + input;
		StringBuffer result = new StringBuffer();
		for(int i=0;i<input.length();i+=3) {
			String tmp = input.substring(i, i+3);
			switch (tmp) {
			case "000": result.append("0"); break;
			case "001": result.append("1"); break;
			case "010": result.append("2"); break;
			case "011": result.append("3"); break;
			case "100": result.append("4"); break;
			case "101": result.append("5"); break;
			case "110": result.append("6"); break;
			case "111": result.append("7"); break;
			}
		}
		System.out.println(result);
	}
}