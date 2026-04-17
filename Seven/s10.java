class Demo{
	public static void main(String[] args){
		int arr[]={1,2,3,5,1};
		boolean what = fun(arr,0);
		System.out.println("the give array is palindrome and that is:"+what);
	}

	static boolean fun(int arr[],int index){
		if(index==arr.length)return true;
		if(fun(arr,index+1)){
			int a=(arr.length-1)-index;
			if(arr[index]==arr[a]){
				return true;
			}	
		}
		return false;
		
			
	}
}