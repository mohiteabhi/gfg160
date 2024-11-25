class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot index
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the entire array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the element from the right that is greater than the pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        // Step 4: Reverse the elements from pivot + 1 to the end
        reverse(arr, pivot + 1, n - 1);
    }

    // Helper function to reverse a portion of the array
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3};

        solution.nextPermutation(arr);

        // Print the next permutation
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
