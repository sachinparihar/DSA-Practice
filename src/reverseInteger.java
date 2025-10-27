public class reverseInteger {

    public static int reverse(int x){
        int result = 0;

        while(x!=0){
            int lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;
        }
        return result;
    }


    public static void main(String[] args) {
        int ans = 321;
        int result = reverse(ans);
        System.out.println("The reverse number is: "+ result);
    }
}

// output
// The reverse number is: 123