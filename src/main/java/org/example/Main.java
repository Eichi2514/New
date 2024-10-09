package org.example;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        ArrayList<Long> tmps = new ArrayList<>();
        while (n > 0) {
            tmps.add(n % 10);
            n /= 10;
        }
        Collections.sort(tmps, Collections.reverseOrder());
        String tmp = "";
        for (int i = 0; i < tmps.size(); i++) {
            tmp += tmps.get(i);
        }
        long answer = Long.parseLong(tmp.toString());
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(118372));
    }
}

