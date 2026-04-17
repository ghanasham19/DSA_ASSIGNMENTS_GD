import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	//taking size of array
	System.out.println("Enter the size of arrray you want: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
		
	//adding elements to array
	for(int i=0;i<arr.length;i++){
		System.out.println("Enter the: "+i+" Element of array");
		int n = sc.nextInt();
		arr[i]=n;
	}
		
	//taking target to find our
	System.out.println("Enter the target you want: ");
	int target=sc.nextInt();	
	
	//method call
	int Count=fun(arr,target,0);
	System.out.println("Count of your target element is: "+Count);	
	
	}
	static int fun(int arr[],int target,int index){
		
		if(index==arr.length){
				return 0;
		}
		
		int what=fun(arr,target,index+1);
	
		if(arr[index]==target){
			what++;
		}
		return what;		
	}
}