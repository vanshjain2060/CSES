package IntroductoryProblems;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long sum = n * (n + 1) / 2;
        if (sum % 2 == 1) {
            System.out.println("NO");
            return;
        }

        long curr = sum / 2;
        Set<Long> s = new TreeSet<>();
        for (long i = n; i > 0; i--) {
            if (curr - i >= 0) {
                curr -= i;
                s.add(i);
            }
            if(curr == 0) break;
        }
        StringBuilder sb = new StringBuilder("YES").append("\n");
        sb.append(s.size()).append("\n");
        for(long l : s) {
            sb.append(l).append(" ");
        }
        sb.append("\n");
        sb.append(n - s.size()).append("\n");
        for(long i=1; i<=n; i++) {
            if(!s.contains(i)) sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
