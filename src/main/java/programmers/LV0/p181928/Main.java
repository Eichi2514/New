package programmers.LV0.p181928;

class Solution {
    public int solution(int[] num_list) {
        String h = "";
        String j = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) h += Integer.toString(num_list[i]);
            else j += Integer.toString(num_list[i]);
        }
        int answer = Integer.parseInt(h) + Integer.parseInt(j);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(new Solution().solution(new int[]{5, 7, 8, 3}));
    }
}