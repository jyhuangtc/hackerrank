package Arrays;

import java.util.Scanner;

public class NewYearChaos {
    /**
     *
     */

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = 0; i < q.length; i++) {
            int diff = q[i] - (i+1);
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (diff > 0) {
                bribes += diff;
            } else if (diff < 0){
            }
        }
        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
