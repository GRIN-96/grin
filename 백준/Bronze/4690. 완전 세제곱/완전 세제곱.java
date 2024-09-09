import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = 0;

        for (int i = 2; i <= 100; i++) {
            a = (int) Math.pow(i, 3);

            for (int b = 2; b <= i; b++) {
                for (int c = b; c <= i; c++) {
                    for (int d = c; d <= i; d++) {

                        int sum = (int) Math.pow(b, 3) + (int) Math.pow(c, 3) + (int) Math.pow(d, 3);

                        if (a == sum){
                            sb.append("Cube = ").append(i).append(", Triple = (").append(b).append(",").append(c).append(",").append(d).append(")").append("\n");
                        }
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}