package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArraysLeftRotation {
    /**
     * A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
     * For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
     *
     * Given an array a of n integers and a number, d, perform d left rotations on the array.
     * Return the updated array to be printed as a single line of space-separated integers.
     *
     * Function Description:
     *   Complete the function rotLeft in the editor below. It should return the resulting array of integers.
     *
     *   rotLeft has the following parameter(s):
     *   An array of integers a.
     *   An integer d, the number of rotations.
     *
     * Input Format:
     *   The first line contains two space-separated integers n and d, the size of a and the number of left rotations you must perform.
     *   The second line contains n space-separated integers a[i].
     *
     * Constraints:
     *   1 <= n <= 10exp5
     *   1 <= d <= n
     *   1 <= a[i] <= 10exp6
     *
     * Output Format:
     *   Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.
     *
     * Sample Input:
     *
     * 5 4
     * 1 2 3 4 5
     *
     * Sample Output:
     *
     * 5 1 2 3 4
     *
     * Explanation:
     *
     * When we perform d=4 left rotations, the array undergoes the following sequence of changes:
     */

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        for (int j = 0; j < d; j++) {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i-1] = a[i];
            }
            a[a.length-1] = temp;
        }

        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
