import java.util.*;

public class MaxSubsequences {

    /**
     * Calculates the GCD of two numbers using the Euclidean Algorithm.
     */
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Finds the maximum number of identical subsequences that can be 
     * formed using all characters of the string exactly once.
     */
    public static int solve(String s) {
        if (s == null || s.isEmpty()) return 1;

        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find GCD of all frequencies in the map
        int result = -1;
        for (int count : freqMap.values()) {
            if (result == -1) {
                result = count;
            } else {
                result = getGCD(result, count);
            }
        }

        // If result is 0 or no chars, return 1; otherwise return the GCD
        return (result <= 0) ? 1 : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int result = solve(s);

        System.out.println("Maximum identical subsequences: " + result);

        scanner.close();
    }
}