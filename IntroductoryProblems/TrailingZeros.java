package IntroductoryProblems;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        sc.close();
        while(n >= 5) {
            n /= 5;
            count += n;
        }
        System.out.println(count);
    }
}