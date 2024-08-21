import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigDecimal result = new BigDecimal("0.5").pow(N);
        
        result = result.setScale(N, RoundingMode.HALF_UP);
        
        System.out.println(result.toPlainString());
    }
}
