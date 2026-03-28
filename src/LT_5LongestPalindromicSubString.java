import java.util.ArrayList;
import java.util.List;

public class LT_5LongestPalindromicSubString {
    public static void main(String[] args) {

        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                String str=s.substring(i,j);
                if(checkPalindrome(str)){
                  if(res.length()<str.length()){
                      res=str;
                  }
                }
            }
        }
        return res;
    }
    public static boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
