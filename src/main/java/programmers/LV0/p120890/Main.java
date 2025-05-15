package programmers.LV0.p120890;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int n1 = n;
        int n2 = n;

        while (true) {
            for (int i = 0; i < array.length; i++) {
                if (n2 != array[i]) {
                } else {
                    return answer = n2;
                }
            }
            n2--;
            for (int i = 0; i < array.length; i++) {
                if (n1 != array[i]) {
                } else {
                    return answer = n1;
                }
            }
            n1++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 10, 28}, 20));
        System.out.println(new Solution().solution(new int[]{10, 11, 12}, 13));
    }
}