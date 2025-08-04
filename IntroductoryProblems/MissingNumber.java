package IntroductoryProblems;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for(int i=1; i<n; i++) sum += sc.nextInt();
        System.out.println((long)((n+1)*(n)/2) - sum);
        sc.close();
    }
}
