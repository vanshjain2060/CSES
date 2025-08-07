package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CreatingStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        Set<String> set = new HashSet<>();
        helper(arr, "", new boolean[arr.length], set);
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder("");
        sb.append(list.size());
        for(String temp : list) {
            sb.append("\n").append(temp);
        }
        System.out.println(sb);
    }

    public static void helper(char[] arr, String curr, boolean[] visited, Set<String> set) {
        if(arr.length == curr.length()) {
            set.add(curr);
            return;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;
                        
            visited[i] = true;
            helper(arr, curr + arr[i], visited, set);
            visited[i] = false;
        }
    }
}