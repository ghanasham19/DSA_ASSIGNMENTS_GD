class Demo{
	public static void main(String[]args){
		int arr[]={2,4,5,6,9};
		int k=2;
		int count=fun(arr,k,0);
		System.out.println("Count of NUmbers divisible by "+k+" is: "+count);
	}
	static int fun(int arr[],int k,int index){
		if(arr.length==index)return 0;
		int count=fun(arr,k,index+1);	
		if(arr[index]%k==0)count++;
		return count;
	}
}