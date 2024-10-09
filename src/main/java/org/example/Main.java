package org.example;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) answer.add(-1);
        Collections.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        int[] asd = {5, 9, 7, 10};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(asd, 5));
    }
}

