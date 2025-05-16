package codeup.UP1200.p1285;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.next();

        int result = 0;
        int num = 0;
        char tmp = '+';
        int index = 0;

        while (index < words.length()) {
            char a = words.charAt(index);

            if (Character.isDigit(a)) {
                num = num * 10 + (a - '0');
            }

            if (!Character.isDigit(a) || index == words.length() - 1) {
                if (tmp == '+') {
                    result += num;
                } else if (tmp == '-') {
                    result -= num;
                } else if (tmp == '*') {
                    result *= num;
                } else if (tmp == '/') {
                    result /= num;
                }

                if (a == '=') break;

                tmp = a;
                num = 0;
            }

            index++;
        }

        System.out.println(result);
    }
}