package programmers.LV2.p42885;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int tmp1 = 0;
        int tmp2 = people.length - 1;

        while (tmp1 <= tmp2) {
            if (people[tmp1] + people[tmp2] <= limit) {
                tmp1++;
            }
            tmp2--;
            answer++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(new Solution().solution(new int[]{70, 80, 50}, 100));
    }
}