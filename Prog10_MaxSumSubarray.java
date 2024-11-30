class Solution {
     	public int maxSubArraySum(int[] arr) {
		int res = arr[0];     
		int maxEnding = arr[0]; 

		for (int i = 1; i < arr.length; i++) { 

			maxEnding = Math.max(maxEnding + arr[i], arr[i]); 
			res = Math.max(res, maxEnding);
		}
		return res;
	}
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] arr = {2,3,-8,7,-1,2,3};
		int result = sol.maxSubArraySum(arr);
		System.out.println(result);
	}
}	
