import java.util.Arrays;

public class LT_6ProductOfArrayExceptSelf {
    public static void main(String[] args) {
      int nums[]={1,2,3,4};
      int arr[]=productExceptSelfOptimise(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] productExceptSelf(int[] nums) {
     int res[]=new int[nums.length];
     for (int i = 0; i <nums.length; i++) {
            int ans=1;
            for (int j = 0; j <nums.length; j++) {
                if(j==i) continue;
                ans*=nums[j];
            }
            res[i]=ans;
     }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static int[] productExceptSelfOptimise(int[] nums){
        int res[]=new int[nums.length];
        res[0]=1;
        for (int i = 1; i <nums.length ; i++) {
            res[i]=res[i-1]*nums[i-1];
        }
        int right=01;
        for (int i = nums.length-1; i >=0 ; i--) {
            res[i]=res[i]*right;
            right*=nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
