package programmers.LV0.p181855;

class Solution {
    public static int solution(String[] strArr) {
        int[] tmp = new int[30];
        int answer = 0;
        for (int i = 0; i < strArr.length; i++) {
            tmp[strArr[i].length() - 1]++;
            if (answer < tmp[strArr[i].length() - 1]) answer = tmp[strArr[i].length() - 1];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }
}