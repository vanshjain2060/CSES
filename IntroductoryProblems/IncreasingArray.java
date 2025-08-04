package IntroductoryProblems;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        long count = 0;
        for(int i=1; i<n; i++) {
            if(arr[i] < arr[i-1]) {
                count += arr[i-1] - arr[i];
                arr[i] = arr[i-1];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
