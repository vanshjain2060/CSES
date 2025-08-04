package IntroductoryProblems;
import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        for(long i = 1; i <= n; i++) {
            if(i == 1) sb.append(0).append("\n");
            else {
                long total = (i*i)*((i*i)-1) / 2;
                long canAttack = 4 * (i-1) * (i-2);
                sb.append(total - canAttack).append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
