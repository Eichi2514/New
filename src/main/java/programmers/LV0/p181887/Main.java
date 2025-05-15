package programmers.LV0.p181887;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int h = 0;
        int j = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) h += num_list[i];
            else j += num_list[i];
        }
        if (h >= j) answer = h;
        else answer = j;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(new Solution().solution(new int[]{-1, 2, 5, 6, 3}));
    }
}