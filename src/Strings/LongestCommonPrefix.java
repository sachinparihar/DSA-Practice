package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

        public static String longestCommonPrefix(String[] strs) {

//            // Approach 1: Sorting method
//            Arrays.sort(strs);
//            String left = strs[0];
//            String right = strs[strs.length-1];
//            int index = 0;
//            while (index  < left.length() ){
//                if(left.charAt(index) == right.charAt(index)){
//                    index++;
//                } else {
//                    break;
//                }
//            }
//           return index == 0?"" :left.substring(0,index);


            // Approach 2

           if(strs.length == 0) return "";

           String Prefix = strs[0];

            for (int i = 1; i < strs.length ; i++) {

                while (strs[i].indexOf(Prefix) != 0 ){
                    Prefix = Prefix.substring(0,Prefix.length()-1);
                }

            }

            return Prefix;

    }

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
