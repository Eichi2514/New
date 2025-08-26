package programmers.LV2.p17686;

import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String f1, String f2) {
                String[] parts1 = splitFileName(f1);
                String[] parts2 = splitFileName(f2);

                int headCompare = parts1[0].toLowerCase().compareTo(parts2[0].toLowerCase());
                if (headCompare != 0) {
                    return headCompare;
                }

                int num1 = Integer.parseInt(parts1[1]);
                int num2 = Integer.parseInt(parts2[1]);

                return Integer.compare(num1, num2);
            }

            private String[] splitFileName(String file) {
                int idx = 0;
                int len = file.length();

                 while (idx < len && !Character.isDigit(file.charAt(idx))) {
                    idx++;
                }
                String head = file.substring(0, idx);

                 int numStart = idx;
                while (idx < len && Character.isDigit(file.charAt(idx)) && idx - numStart < 5) {
                    idx++;
                }
                String number = file.substring(numStart, idx);

                return new String[]{head, number};
            }
        });

        return files;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(sol.solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));
    }
}