public class LT_7GasStation {
    public static void main(String[] args) {
       int gas[] = {1,2,3,4,5}, cost[] = {3,4,5,1,2};
       int ans=canCompleteCircuit(gas,cost);
        System.out.println(ans);
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
     int start=0;
     int totalTank=0;
     int currTank=0;
        for (int i = 0; i < gas.length; i++) {
            int diff=gas[i]-cost[i];
            totalTank+=diff;
            currTank+=diff;
            if(currTank<0){
                start=start+1;
                currTank=0;
            }
        }
       return totalTank>=0?start:-1;

    }
}
