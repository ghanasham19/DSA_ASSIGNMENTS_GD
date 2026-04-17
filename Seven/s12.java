class Demo{
	public static void main(String[]args){
		int arr[]={11,18,19,98};
		boolean what=fun(arr,0);
		System.out.println(what);
	}
	static boolean fun(int arr[],int index){
		if(arr.length-1==index)return true;
		if(arr[index+1]>arr[index]){
			return fun(arr,index+1);	
		}												return false;
	}
}