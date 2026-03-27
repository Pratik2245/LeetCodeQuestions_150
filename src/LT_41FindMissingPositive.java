import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LT_41FindMissingPositive {
    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int smInt = 1;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        while (hashSet.contains(smInt)) {
            smInt++;
        }
        return smInt;
    }
}
