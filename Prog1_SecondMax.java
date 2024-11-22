class Solution{
	public int getSecondLargest(int[] arr){
		int secondMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
	
		if(arr.length < 2){
			return -1;
		}

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i];
			}
		}

		if (secondMax == Integer.MIN_VALUE){
			return -1;
		}
		else{
			return secondMax;
		}
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {10, 10, 10};
		int result = s.getSecondLargest(arr);
		System.out.println(result);
	}
}


