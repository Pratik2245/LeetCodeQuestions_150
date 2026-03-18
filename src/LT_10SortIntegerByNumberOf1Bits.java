import java.util.Arrays;

public class LT_10SortIntegerByNumberOf1Bits {
    public static void main(String[] args) {
      int arr[]={0,1,2,3,4,5,6,7,8};
     int ans[]= sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortByBits(int[] arr) {

        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}
