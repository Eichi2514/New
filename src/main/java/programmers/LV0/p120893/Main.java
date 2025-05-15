package programmers.LV0.p120893;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.replace("a", "1");
        my_string = my_string.replace("A", "a");
        my_string = my_string.replace("1", "A");

        my_string = my_string.replace("b", "1");
        my_string = my_string.replace("B", "b");
        my_string = my_string.replace("1", "B");

        my_string = my_string.replace("c", "1");
        my_string = my_string.replace("C", "c");
        my_string = my_string.replace("1", "C");

        my_string = my_string.replace("d", "1");
        my_string = my_string.replace("D", "d");
        my_string = my_string.replace("1", "D");

        my_string = my_string.replace("e", "1");
        my_string = my_string.replace("E", "e");
        my_string = my_string.replace("1", "E");

        my_string = my_string.replace("f", "1");
        my_string = my_string.replace("F", "f");
        my_string = my_string.replace("1", "F");

        my_string = my_string.replace("g", "1");
        my_string = my_string.replace("G", "g");
        my_string = my_string.replace("1", "G");

        my_string = my_string.replace("h", "1");
        my_string = my_string.replace("H", "h");
        my_string = my_string.replace("1", "H");

        my_string = my_string.replace("i", "1");
        my_string = my_string.replace("I", "i");
        my_string = my_string.replace("1", "I");

        my_string = my_string.replace("j", "1");
        my_string = my_string.replace("J", "j");
        my_string = my_string.replace("1", "J");

        my_string = my_string.replace("k", "1");
        my_string = my_string.replace("K", "k");
        my_string = my_string.replace("1", "K");

        my_string = my_string.replace("l", "1");
        my_string = my_string.replace("L", "l");
        my_string = my_string.replace("1", "L");

        my_string = my_string.replace("m", "1");
        my_string = my_string.replace("M", "m");
        my_string = my_string.replace("1", "M");

        my_string = my_string.replace("n", "1");
        my_string = my_string.replace("N", "n");
        my_string = my_string.replace("1", "N");

        my_string = my_string.replace("o", "1");
        my_string = my_string.replace("O", "o");
        my_string = my_string.replace("1", "O");

        my_string = my_string.replace("p", "1");
        my_string = my_string.replace("P", "p");
        my_string = my_string.replace("1", "P");

        my_string = my_string.replace("q", "1");
        my_string = my_string.replace("Q", "q");
        my_string = my_string.replace("1", "Q");

        my_string = my_string.replace("r", "1");
        my_string = my_string.replace("R", "r");
        my_string = my_string.replace("1", "R");

        my_string = my_string.replace("s", "1");
        my_string = my_string.replace("S", "s");
        my_string = my_string.replace("1", "S");

        my_string = my_string.replace("t", "1");
        my_string = my_string.replace("T", "t");
        my_string = my_string.replace("1", "T");

        my_string = my_string.replace("u", "1");
        my_string = my_string.replace("U", "u");
        my_string = my_string.replace("1", "U");

        my_string = my_string.replace("v", "1");
        my_string = my_string.replace("V", "v");
        my_string = my_string.replace("1", "V");

        my_string = my_string.replace("w", "1");
        my_string = my_string.replace("W", "w");
        my_string = my_string.replace("1", "W");

        my_string = my_string.replace("x", "1");
        my_string = my_string.replace("X", "x");
        my_string = my_string.replace("1", "X");

        my_string = my_string.replace("y", "1");
        my_string = my_string.replace("Y", "y");
        my_string = my_string.replace("1", "Y");

        my_string = my_string.replace("z", "1");
        my_string = my_string.replace("Z", "z");
        String answer = my_string.replace("1", "Z");

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("cccCCC"));
        System.out.println(new Solution().solution("abCdEfghIJ"));
    }
}