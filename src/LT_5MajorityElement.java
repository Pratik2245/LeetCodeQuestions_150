public class LT_5MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int ans=majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int datac = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                datac = nums[i];
                count++;
            } else if (datac == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return datac;

    }
}
