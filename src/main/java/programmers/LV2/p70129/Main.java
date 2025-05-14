package programmers.LV2.p70129;

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int count1 = 0;
        int count2 = 0;

        while(s.length() > 1){
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '1'){
                    tmp += "1";
                } else {
                    count2++;
                }
            }
            s = Integer.toBinaryString(tmp.length());
            count1++;
        }

        int[] answer = {count1, count2};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution("110010101001");
        int[] result2 = new Solution().solution("01110");
        int[] result3 = new Solution().solution("1111111");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
