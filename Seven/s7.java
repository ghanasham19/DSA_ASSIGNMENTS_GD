class demo{
	public static void main(String[]args){
		int arr[]={2,98,9,3,8};
		int max=fun(arr,0);
		System.out.println("Max element is:"+max);
	}
	static int fun(int arr[],int index){
		if(index==arr.length)return 0;
		int what=fun(arr,index+1);
		if(arr[index]>what)what=arr[index];
		return what;
		
	}
}