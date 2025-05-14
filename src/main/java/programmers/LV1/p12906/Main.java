package programmers.LV1.p12906;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        System.out.println(new Solution().solution(new int[]{4, 4, 4, 3, 3}));
    }
}