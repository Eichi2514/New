package programmers.LV2.p92341;

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee  = fees[1];
        int unitTime = fees[2];
        int unitFee  = fees[3];

        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> totalMap = new HashMap<>();

        for (String rec : records) {
            String[] parts = rec.split(" ");
            int time = toMinutes(parts[0]);
            String car = parts[1];
            String action = parts[2];

            if (action.equals("IN")) {
                inMap.put(car, time);
            } else {
                int inTime = inMap.remove(car);
                totalMap.put(car, totalMap.getOrDefault(car, 0) + (time - inTime));
            }
        }

        int endOfDay = toMinutes("23:59");
        for (Map.Entry<String, Integer> e : inMap.entrySet()) {
            String car = e.getKey();
            int inTime = e.getValue();
            totalMap.put(car, totalMap.getOrDefault(car, 0) + (endOfDay - inTime));
        }

        List<String> cars = new ArrayList<>(totalMap.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            int totalMin = totalMap.get(cars.get(i));
            int fee = calcFee(totalMin, baseTime, baseFee, unitTime, unitFee);
            answer[i] = fee;
        }
        return answer;
    }

    private int toMinutes(String hhmm) {
        String[] s = hhmm.split(":");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        return h * 60 + m;
    }

    private int calcFee(int totalMin, int baseTime, int baseFee, int unitTime, int unitFee) {
        if (totalMin <= baseTime) return baseFee;
        int over = totalMin - baseTime;
        int units = (over + unitTime - 1) / unitTime;
        return baseFee + units * unitFee;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
        System.out.println(Arrays.toString(sol.solution(new int[]{120, 0, 60, 591}, new String[]{"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 461, 1, 10}, new String[]{"00:00 1234 IN"})));

    }
}