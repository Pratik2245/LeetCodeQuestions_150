public class LT_JumpGame {
    public static void main(String[] args) {
//        int nums[]={2,3,1,1,4};
        int nums[]={3,2,1,0,4};
        boolean b=canJump(nums);
        System.out.println(b);
    }
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i <nums.length; i++) {
          if(i>maxReach){
              return  false;
          }
          maxReach=Math.max(maxReach,i+nums[i]);
        }
        return true;
    }
}
