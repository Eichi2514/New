package programmers.LV1.p340213;

class Solution {

    public int convertToSeconds(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        int videoLenSec = convertToSeconds(video_len),
                posSec = convertToSeconds(pos),
                opStartSec = convertToSeconds(op_start),
                opEndSec = convertToSeconds(op_end);

        if (posSec >= opStartSec && posSec <= opEndSec) posSec = opEndSec; // 시작 값 오프닝 구간 확인

        for (String command : commands) {
            if (command.equals("next")) posSec = posSec + 10 >= videoLenSec ? videoLenSec : posSec + 10;
            else posSec = posSec - 10 > 0 ? posSec - 10 : 0;

            if (posSec >= opStartSec && posSec <= opEndSec) posSec = opEndSec; // 오프닝 구간 확인
        }

        int m = posSec / 60,
                s = posSec % 60;

        String answer = "";     // StringBuilder 쓸정도 아님
        answer += m < 10 ? "0" + m : m + "";
        answer += ":";
        answer += s < 10 ? "0" + s : s + "";

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"}));
        System.out.println(new Solution().solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"}));
        System.out.println(new Solution().solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"}));
    }
}