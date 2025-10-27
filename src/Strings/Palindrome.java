package Strings;

public class Palindrome {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

    }
        return true;

}

    public static void main(String[] args) {
       String ss= "A man, a plan, a canal: Panama";
       boolean ans = isPalindrome(ss);
        System.out.println(ans);
    }
}
