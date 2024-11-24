class Prog3_Reverse{
	public static void Solution(int arr[]){
		int N = arr.length;
		int i = 0;
		int j = N - 1;
		
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k = 0; k < N; k++){
			System.out.print(arr[k] + " ");
		}
	}
	public static void main(String[] args){
		 int arr[] = {4, 3, 2, 1};
		 Solution(arr);
	}
}
