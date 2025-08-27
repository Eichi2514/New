package programmers.LV2.p42888;

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        List<String[]> messageList = new ArrayList<>();

        for (String rec : record) {
            String[] parts = rec.split(" ");
            String command = parts[0];
            String uid = parts[1];

            if (command.equals("Enter")) {
                String nickname = parts[2];
                userMap.put(uid, nickname);
                messageList.add(new String[] {uid, "님이 들어왔습니다."});
            } else if (command.equals("Leave")) {
                messageList.add(new String[] {uid, "님이 나갔습니다."});
            } else if (command.equals("Change")) {
                String nickname = parts[2];
                userMap.put(uid, nickname);
            }
        }

        String[] answer = new String[messageList.size()];
        for (int i = 0; i < messageList.size(); i++) {
            String uid = messageList.get(i)[0];
            String message = messageList.get(i)[1];
            answer[i] = userMap.get(uid) + message;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }
}