package programmers.LV1.p340198;

import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {
            for (int j = 0; j <= park.length - mats[i]; j++) {
                for (int k = 0; k <= park[j].length - mats[i]; k++) {
                    boolean tmp = true;
                    for (int l = j; l < j + mats[i]; l++) {
                        for (int m = k; m < k + mats[i]; m++) {
                            if (!park[l][m].equals("-1")) {
                                tmp = false;
                                break;
                            }
                        }
                        if (!tmp) break;
                    }
                    if (tmp) return mats[i];
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 3, 2}, new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}}));
    }
}