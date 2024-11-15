public class palindrome {
    public static void main(String[] args) {
        String word = "ebube";
        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
