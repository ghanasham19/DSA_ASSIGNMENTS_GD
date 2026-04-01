import java.util.*;
class Demo{
	public  static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N: ");
	int n = sc.nextInt();
	int nn=n;
	int rev=0;
		while(n>0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==nn){
			System.out.println("Number is palindrome");
		}else{
			System.out.println("Number is not palindrome");
		}
	}
}