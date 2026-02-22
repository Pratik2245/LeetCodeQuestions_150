import java.util.Arrays;

public class LT_4RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        int nums[]={1,2,2};
        int ans=removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int k=2;
        for (int i = 2; i <nums.length; i++) {
             if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
