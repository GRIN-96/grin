import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> cmds = new ArrayList<>();

        while (true) {
            final int cmd = Integer.parseInt(br.readLine());
            if (cmd == 0) {
                break;
            }
            cmds.add(cmd);
        }

        System.out.println(
                cmds.stream()
                        .map(Main::solution)
                        .collect(Collectors.joining("\n")));
    }

    private static String solution(Integer cmd) {
        while (cmd > 9) {
            cmd = digitSum(cmd);
        }
        return String.valueOf(cmd);
    }

    private static Integer digitSum(Integer cmd) {
        int sum = 0;
        while (cmd > 0) {
            sum += (cmd % 10);
            cmd /= 10;
        }
        return sum;
    }


}