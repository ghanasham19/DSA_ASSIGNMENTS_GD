import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n= sc.nextInt();
		int sum=0;
			while(n>0){
				n = n/10;
				sum++;			
			}
		System.out.println("Digit's are:"+sum);
		
	}
}