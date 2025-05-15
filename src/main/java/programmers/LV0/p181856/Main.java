package programmers.LV0.p181856;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                tmp1 += arr1[i];
                tmp2 += arr2[i];
            }
            if (tmp1 > tmp2) answer = 1;
            else if (tmp2 > tmp1) answer = -1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(new Solution().solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }
}