class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] != 0){
                arr[i] = arr[count];
                arr[count] = arr[i];
                count++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        Solution s = new Solution();
        s.pushZerosToEnd(arr);
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " ");
	}
        
        
    }
}
