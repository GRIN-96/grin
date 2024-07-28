import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] gan = new int[6];
        int[] sa = new int[7];
        String answer = "";

        for (int i = 1; i <= num; i++) {
            int ganScore = 0;
            int saScore = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {

                gan[j] = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    gan[j] *= 1;
                    ganScore += gan[j];
                } else if (j == 1) {
                    gan[j] *= 2;
                    ganScore += gan[j];
                } else if (j == 2) {
                    gan[j] *= 3;
                    ganScore += gan[j];
                } else if (j == 3) {
                    gan[j] *= 3;
                    ganScore += gan[j];
                } else if (j == 4) {
                    gan[j] *= 4;
                    ganScore += gan[j];
                } else if (j == 5) {
                    gan[j] *= 10;
                    ganScore += gan[j];
                }
            }

            // 사우론 군대
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                sa[j] = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    sa[j] *= 1;
                    saScore += sa[j];
                } else if (j == 1) {
                    sa[j] *= 2;
                    saScore += sa[j];
                } else if (j == 2) {
                    sa[j] *= 2;
                    saScore += sa[j];
                } else if (j == 3) {
                    sa[j] *= 2;
                    saScore += sa[j];
                } else if (j == 4) {
                    sa[j] *= 3;
                    saScore += sa[j];
                } else if (j == 5) {
                    sa[j] *= 5;
                    saScore += sa[j];
                } else if (j == 6) {
                    sa[j] *= 10;
                    saScore += sa[j];
                }
            }

            if (ganScore > saScore) {
                answer = "Good triumphs over Evil";
            } else if (ganScore == saScore) {
                answer = "No victor on this battle field";
            } else {
                answer = "Evil eradicates all trace of Good";
            }

            sb.append("Battle ").append(i).append(": ").append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}