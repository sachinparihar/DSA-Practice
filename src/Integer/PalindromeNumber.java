package Integer;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if(x < 0) return false;
        if(x != 0 && x % 10 == 0) return false;

        int result = 0;
        while(x != 0){
            int lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;
        }
        return (x == result) || (x == result / 10);

    }

    public static void main(String[] args) {
        int ans = -121;
        boolean res = isPalindrome(ans);
        System.out.println(res);
    }
}
