class Demo{
	public static void main(String[]args){
		int []arr={5,2,8,1,3};
		int S_index=fun(arr,0);
		System.out.println("Smallest element index of give array is: "+S_index);
	}
	static int fun(int arr[],int index){
		if(arr.length-1==index) return index;
		int what=fun(arr,index+1);
		if(arr[index]<arr[what])what=index;
		return what;
	}
}