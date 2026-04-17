class Demo{
	public static void main(String[]args){
		int arr[]={1,-2,3,-4,5};
		int sum=fun(arr,0);	
		System.out.println("Sum of Negative Numbers are: "+sum);
	}
	static int fun(int arr[],int index){
		if(arr.length==index) return 0;
		int sum=fun(arr,index+1);
		if(arr[index]<0)sum+=arr[index];
		return sum;	
	}
}
