package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'A']++;
        
            int oddCount = 0;
        for (int i : freq) {
            if (i % 2 != 0)
                oddCount++;
            if (oddCount > 1) {
                System.out.println("NO SOLUTION");
                return;
            }
        }

        char mid = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1)
                mid = (char) (i + 'A');
            else if (freq[i] > 0) {
                if (freq[i] % 2 == 0) {
                    for (int j = 0; j < freq[i] / 2; j++) {
                        sb.append((char) (i + 'A'));
                    }
                } else {
                    mid = (char) (i + 'A');
                    for (int j = 0; j < freq[i] / 2; j++) {
                        sb.append((char) (i + 'A'));
                    }
                }
            }
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        if (mid == ' ') System.out.println(s1 + s2);
        else System.out.println(s1 + mid + s2);
        br.close();
    }
}
