package palindromic;

public class Solution {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        String str = String.valueOf(x);

        int digits = str.length();

        if(digits == 1) {
            return true;
        }

        String prePart = "";
        String backPart = "";

        if(digits == 2 || digits == 3) {
            return str.charAt(0) == str.charAt(str.length() - 1);
        }

        if(digits % 2 == 0) {
            prePart = str.substring(0, digits / 2);
            backPart = str.substring(digits /2, digits);
        }else {
            prePart = str.substring(0, digits / 2);
            backPart = str.substring(digits / 2 + 1, digits);
        }

        return new StringBuffer(prePart).reverse().toString().equals(backPart);
    }

    public static void main(String [] args) {
        System.out.println(isPalindrome(1));
    }
}
