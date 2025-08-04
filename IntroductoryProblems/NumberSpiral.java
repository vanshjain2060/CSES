package IntroductoryProblems;
import java.io.*;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long r = Long.parseLong(st.nextToken()) - 1;
            long c = Long.parseLong(st.nextToken()) - 1;
            
            long result;
            if(r >= c) {
                if(r % 2 == 0) {
                    result = r * r + 1 + c;
                } else {
                    result = (r + 1) * (r + 1) - c;
                }
            } else {
                if(c % 2 == 0) {
                    result = (c + 1) * (c + 1) - r;
                } else {
                    result = c * c + 1 + r;
                }
            }
            
            pw.println(result);
        }
        
        pw.close();
        br.close();
    }
}