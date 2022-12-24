package homework2;

public class homework2task1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdedcba"));
        System.out.println(isPalindrome("шалаш"));

    }

    public static Boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
