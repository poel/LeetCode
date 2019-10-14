package longestsubstringwithoutrepeatingcharacters;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder container = new StringBuilder();

        int max = 0;

        int first = -1;

        for (int i = 0; i < s.length(); i++) {

            first = container.indexOf(String.valueOf(s.charAt(i)));

            if(first != -1 ) {
                container.append(s.charAt(i));
                container.delete(0, first + 1);
            }else {
                container.append(s.charAt(i));
            }

            if(container.length() > max) {
                max = container.length();
            }
        }

        if(max < container.length()) {
            max = container.length();
        }

        return max;
    }

    public static int lengthOfLongestSubstringTwo(String s) {
        return 0;
    }

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("cdd");
        System.out.println(max);
    }
}
