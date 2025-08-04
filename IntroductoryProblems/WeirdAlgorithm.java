package IntroductoryProblems;
import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n > 1) {
            System.out.print(n + " ");
            if(n % 2 == 0) n /= 2;
            else n = (3 * n) + 1;
        }
        System.out.print(1);
        sc.close();
    }
}

