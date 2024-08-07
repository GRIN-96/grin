import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        
        while (true) {
            try {
                if (!scanner.hasNext()) {
                    break;
                }
                String input = scanner.nextLine();
                s += 1;
            } catch (Exception e) {
                break;
            }
        }
        
        System.out.println(s);
    }
}