import java.util.*;
class demo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Nuber: ");
		int n=sc.nextInt();
		
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i+j==n+1||i==j){
				System.out.print("*"+" ");
			}else{
			 	System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
	
	
	}
}