package programmers.LV0.p181880;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if ((num_list[i] % 2) == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{12, 4, 15, 1, 14}));
    }
}