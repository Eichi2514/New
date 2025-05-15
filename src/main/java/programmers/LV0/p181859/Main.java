package programmers.LV0.p181859;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> skt = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (skt.size() == 0) skt.add(arr[i]);
            else if (skt.get(skt.size() - 1) == arr[i]) skt.remove(skt.size() - 1);
            else skt.add(arr[i]);
        }
        if (skt.size() == 0) skt.add(-1);
        return skt;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 1, 1, 1, 0}));
        System.out.println(new Solution().solution(new int[]{0, 1, 0, 1, 0}));
        System.out.println(new Solution().solution(new int[]{0, 1, 1, 0}));
    }
}