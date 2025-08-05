package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreyCode {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");

        int total = 1 << n;
        for(int mask = 0; mask < total; mask++) {
            int code = mask ^ (mask >> 1);

            for(int i=n-1; i>=0; i--) {
                int bit = (code & (1 << i)) > 0 ? 1 : 0;
                sb.append(bit);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
