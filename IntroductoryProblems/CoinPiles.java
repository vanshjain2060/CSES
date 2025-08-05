package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long r = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if ((r == 0 && c > 0) || (r > 0 && c == 0) || (r < (c / 2)) || ((r / 2) > c)
                    || (r == 1 && c == 1) || (r == 2 && c == 2)) {
                pw.println("NO");
                continue;
            }

            r = r % 3;
            c = c % 3;

            if ((r == 0 && c > 0) || (r > 0 && c == 0) || (r < (c / 2)) || ((r / 2) > c)
                    || (r == 1 && c == 1) || (r == 2 && c == 2))
                pw.println("NO");
            else
                pw.println("YES");
        }
        pw.close();
        br.close();
    }
}
