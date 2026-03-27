package Practise;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] v = new int[N];
        int[] d = new int[N];

        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        // Max Heap: {currentTaste, decrease}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]
        );

        // Add all foods
        for (int i = 0; i < N; i++) {
            pq.add(new int[]{v[i], d[i]});
        }

        long totalTaste = 0;

        // Take M meals
        for (int i = 0; i < M; i++) {
            if (pq.isEmpty()) break;

            int[] food = pq.poll();

            int taste = food[0];
            int decrease = food[1];

            totalTaste += taste;

            // Update taste
            taste -= decrease;

            // Add back if still useful
            if (taste > 0) {
                pq.add(new int[]{taste, decrease});
            }
        }

        System.out.println(totalTaste);
    }
}
