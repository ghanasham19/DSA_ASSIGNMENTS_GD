class demo{
	public static void main(String[]args){
		int arr[]={2,98,-34,2,8};
		boolean what=fun(arr,0);
		System.out.println("all elememts ar even and that is:"+what);
	}
	static boolean fun(int arr[],int index){
		if(index==arr.length)return false;
		if(arr[index]>=0)return fun(arr,index+1);
		return true;
		
	}
}