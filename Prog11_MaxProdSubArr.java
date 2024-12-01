class Solution {
    int maxProduct(int[] arr) {
        int N = arr.length;
        int currentMax = arr[0];
        int currentMin = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < N; i++) {
            int temp = currentMax;

            currentMax = Math.max(arr[i], Math.max(arr[i] * currentMax, arr[i] * currentMin));

            currentMin = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * currentMin));

            maxProd = Math.max(maxProd, currentMax);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        Solution sln = new Solution();
        int result = sln.maxProduct(arr);
        System.out.print(result);
    }
}
