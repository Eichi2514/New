package programmers.LV1.p250121;

import java.util.*;

class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> answer = new ArrayList<>();

        int n;
        int m;

        if (ext.equals("code")) n = 0;
        else if (ext.equals("date")) n = 1;
        else if (ext.equals("maximum")) n = 2;
        else n = 3;

        if (sort_by.equals("code")) m = 0;
        else if (sort_by.equals("date")) m = 1;
        else if (sort_by.equals("maximum")) m = 2;
        else m = 3;

        for (int i = 0; i < data.length; i++) {
            if (data[i][n] < val_ext) {
                answer.add(data[i]);
            }
        }

        answer.sort(Comparator.comparingInt(a -> a[m]));

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> result1 = new Solution().solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");

        System.out.print("[");
        for (int i = 0; i < result1.size(); i++) {
            System.out.print(Arrays.toString(result1.get(i)));
            if (i != result1.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}