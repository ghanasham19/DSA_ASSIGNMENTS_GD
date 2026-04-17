class Dmeo{
	public static void main(String[]args){
	int arr[]={1,12,1,9};
	boolean what=fun(arr,1);
	System.out.println("It's :"+what+" that array is sorted!");
	}
	static boolean fun(int arr[],int index){
		if(index==arr.length)return true;
		if(arr[index]>arr[index-1])return fun(arr,index+1);
		return false;	
	}
	
}