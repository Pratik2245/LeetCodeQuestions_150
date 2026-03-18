package Practise;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
     String s="abcdabcbb";
     int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxLen=0;
        for (int right = 0; right <s.length(); right++) {
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

}
