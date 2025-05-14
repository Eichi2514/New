package programmers.LV2.p12981;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int tmp = 1;
            int count = 1;
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                for (int k = 1; k <= i; k++) {
                    if (tmp < n) tmp++;
                    else {
                        count++;
                        tmp = 1;
                    }
                }
                return new int[]{tmp, count};
            }

            for (int j = 0; j < arr.size(); j++) {
                if (words[i].equals(arr.get(j))) {
                    for (int k = 1; k <= i; k++) {
                        if (tmp < n) tmp++;
                        else {
                            count++;
                            tmp = 1;
                        }
                    }
                    return new int[]{tmp, count};
                }
            }
            arr.add(words[i]);
        }
        return new int[]{0, 0};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        int[] result2 = new Solution().solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] result3 = new Solution().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}