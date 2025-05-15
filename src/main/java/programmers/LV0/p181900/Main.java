package programmers.LV0.p181900;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }
        for (int i = 0; i < tmp.length; i++) {
            answer += tmp[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}