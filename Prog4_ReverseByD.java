class Solution {
    public void rotateArr(int[] arr, int d) {
        int n = arr.length;

        d %= n; 

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){
    	Solution solution = new Solution();
	int[] arr = {1, 2, 3, 4, 5, 6, 7};
	int d = 2;

	solution.rotateArr(arr, d);

	for(int num : arr){
		System.out.print(num + " ");
	}
    }
}
