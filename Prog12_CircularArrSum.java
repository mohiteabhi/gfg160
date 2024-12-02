class Solution{
	public int circularSubarraySum(int[] arr){
		int totalSum = 0;
		int currentMaxSum = 0;
		int currentMinSum = 0;
		int maxSum = arr[0];
		int minSum = arr[0];

		for(int i = 0; i < arr.length; i++){
			currentMaxSum = Math.max(currentMaxSum + arr[i], arr[i]);
			maxSum = Math.max(maxSum, currentMaxSum);

			currentMinSum = Math.min(currentMinSum + arr[i], arr[i]);
			minSum = Math.min(minSum, currentMinSum);

			totalSum += arr[i];
		}
		int normalSum = maxSum;
		int circularSum = totalSum - minSum;

		if(minSum == totalSum){
			return normalSum;
		}
		return Math.max(normalSum, circularSum);
	}
	public static void main(String[] args){
		Solution sln = new Solution();
		int[] arr = {8, -8, 9, -9, 10, -11, 12};
		int result = sln.circularSubarraySum(arr);
		System.out.print(result);
	}
}
