package IntroductoryProblems;
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isEmpty()) System.out.println(0);

        int maxi = 1, count = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ch) {
                count++;
            } else {
                ch = curr;
                count = 1;
            }
            maxi = Math.max(maxi, count);
        }
        System.out.println(maxi);
        sc.close();
    }
}
