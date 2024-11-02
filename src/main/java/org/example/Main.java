package org.example;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";
        for (String str : arr) {
            answer += str;
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution("Zbcdefg"));
    }
}

