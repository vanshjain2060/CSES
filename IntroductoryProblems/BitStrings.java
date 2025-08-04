package IntroductoryProblems;
import java.util.Scanner;

public class BitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(pow(n));
    }

    private static long pow(long n) {
        if(n == 0) return 1;
        long half = pow(n/2) % 1000000007;
        if(n % 2 == 0) return (half * half) % 1000000007;
        else return (half * half * 2) % 1000000007;
    }
}
