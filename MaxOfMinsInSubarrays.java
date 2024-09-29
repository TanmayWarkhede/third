import java.util.Scanner;

public class MaxOfMinsInSubarrays {
    
    public static int maxOfMins(int[] arr, int k) {
        int maxOfMins = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int minInSubarray = Integer.MAX_VALUE;
            
            for (int j = i; j < i + k; j++) {
                minInSubarray = Math.min(minInSubarray, arr[j]);
            }
            
            maxOfMins = Math.max(maxOfMins, minInSubarray);
        }

        return maxOfMins;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length of the segment
        int k = sc.nextInt();

        // Read size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the result
        int result = maxOfMins(arr, k);
        
        // Output the result
        System.out.println(result);

        sc.close();
    }
}
