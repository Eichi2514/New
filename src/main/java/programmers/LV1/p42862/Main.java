package programmers.LV1.p42862;

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();

        for (int l : lost) lostList.add(l);
        for (int r : reserve) reserveList.add(r);

        for (int i = 0; i < lostList.size(); i++) {
            int lostNum = lostList.get(i);
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostNum == reserveList.get(j)) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    break;
                }
            }
        }

        int answer = n - lostList.size();

        for (int i = 0; i < lostList.size(); i++) {
            int lostNum = lostList.get(i);
            for (int j = 0; j < reserveList.size(); j++) {
                int reserveNum = reserveList.get(j);
                if (lostNum - 1 == reserveNum || lostNum + 1 == reserveNum) {
                    answer++;
                    reserveList.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(new Solution().solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(new Solution().solution(3, new int[]{3}, new int[]{1}));
    }
}