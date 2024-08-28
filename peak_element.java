import java.util.*;

class PeakFinder {

    // Find all peak elements in the array
    static List<Integer> findAllPeaks(int arr[], int n) {
        List<Integer> peaks = new ArrayList<>();
        
        // Check for peak in first element
        if (n == 1 || arr[0] >= arr[1]) {
            peaks.add(arr[0]);
        }

        // Check for peak in middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                peaks.add(arr[i]);
            }
        }

        // Check for peak in last element
        if (n > 1 && arr[n - 1] >= arr[n - 2]) {
            peaks.add(arr[n - 1]);
        }

        return peaks;
    }

    // Recursively find peak elements until no peaks are left
    static int findFinalPeak(int arr[]) {
        while (true) {
            List<Integer> peaks = findAllPeaks(arr, arr.length);
            if (peaks.size() == 0) {
                // Return max value when no peaks are found
                return Arrays.stream(arr).max().getAsInt();
            }
            // Convert List<Integer> back to int[] for next iteration
            arr = peaks.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int finalPeak = findFinalPeak(arr);
        System.out.println("The final peak element is " + finalPeak);
    }
}
