public class LT_8BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }

    public static int binaryGap(int n) {
        int maxDistance = 0;
        int lastIndex = -1;   // stores position of last seen '1'
        int currentIndex = 0;
        while (n>0){
            if ((n & 1) == 1) {   // if current bit is 1
                if (lastIndex != -1) {
                    maxDistance = Math.max(maxDistance, currentIndex - lastIndex);
                }
                lastIndex = currentIndex;
            }
            n = n >> 1;  // shift right
            currentIndex++;
        }
        return maxDistance;
    }
}
