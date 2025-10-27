package Integer;

public class singleNumber {
    public static int singleNumber(int[] nums){
        int singleNumber = 0;
        for (int num : nums){
            singleNumber = singleNumber ^ num;

        }
        return singleNumber;
    }

    public static void main(String[] args) {
        int ans[] = {4,4,1,3, 5, 2,1,2};
        int result = singleNumber(ans);
        System.out.println(result);
    }
}
