package programmers.LV0.p181918;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0) stk.add(arr[i]);
            else if (stk.get(stk.size() - 1) < arr[i]) stk.add(arr[i]);
            else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
                i--;
            }
        }
        return stk;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 4, 2, 5, 3}));
    }
}