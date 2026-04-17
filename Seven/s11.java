class Demo{
	public static void main(String[]args){
		int arr[]={11,5,8,3};
		int S_max=fun(arr,0,0,0);
		System.out.println(S_max);
	}
	static int fun(int arr[],int index,int Max_1,int Max_2){
		if(arr.length==index)return Max_2;
		else if(arr[index]>Max_1){
			Max_2=Max_1;
			Max_1=arr[index];	
		}
		else if(Max_2<arr[index]){
			Max_2=arr[index];
		}												return fun(arr,index+1,Max_1,Max_2);
	}
}