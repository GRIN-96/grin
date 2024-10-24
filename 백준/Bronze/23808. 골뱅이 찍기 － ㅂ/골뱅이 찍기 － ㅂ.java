import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        final String AT = "@";
        final String SPACE = " ";
        StringBuilder sb = new StringBuilder();

        final String atHorizontalStroke = AT.repeat(N * 5);
        final String atVerticalStroke = AT.repeat(N);
        final String spaceVerticalStroke = SPACE.repeat(N * 3);

        StringBuffer horizontalPlankSb = new StringBuffer();
        IntStream.range(0, N).forEach(i -> horizontalPlankSb
                .append(atHorizontalStroke)
                .append("\n"));

        StringBuffer verticalPlankSb = new StringBuffer();
        IntStream.range(0, N).forEach(i -> verticalPlankSb
                .append(atVerticalStroke)
                .append(spaceVerticalStroke)
                .append(atVerticalStroke)
                .append("\n"));

        sb.append(verticalPlankSb).append(verticalPlankSb)
                .append(horizontalPlankSb).append(verticalPlankSb).append(horizontalPlankSb);
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}